package AnalyticalHierarchyProcessBuilder;


public class AHPcalculation {
    AHPcriteriaWeight ahPcriteriaWeight;

    AHPcriteriaWeight [] ahpWeight= new AHPcriteriaWeight[4];
    TypeCriteriaAHP typeCriteriaAHP = new TypeCriteriaAHP();
    CountCriteriaAHP countCriteriaAHP = new CountCriteriaAHP();
    TimeCriteriaAHP timeCriteriaAHP = new TimeCriteriaAHP();

    public AHPcriteriaWeight criteriaCalculationAnalyticalHierarchyProcess(PriorityData[] priorityData, int numberOfBooks) {


        double[][] AHPMatrix = new double[3][3];

        int i, j;

        AHPMatrix[0][1] = 2.0;
        AHPMatrix[0][2] = 3.0;
        AHPMatrix[0][2] = 5.0;
        AHPMatrix[1][2] = 2.0;
        AHPMatrix[1][2] = 4.0;
        AHPMatrix[2][2] = 1.5;
        double[] summationMatrix = new double[3];
        double[] weightMatrix = new double[3];


        for (i = 0; i < 3; i++) {
            AHPMatrix[i][i] = (1);
        }

        for (i = 0; i < 3; i++) {
            for (j = i + 1; j < 3; j++) {
                AHPMatrix[i][j] = Math.pow(AHPMatrix[i][j], -1);
                summationMatrix[i] = summationMatrix[i] + AHPMatrix[i][j];
            }
        }

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {

                AHPMatrix[i][j] = AHPMatrix[i][j] / summationMatrix[i];
                weightMatrix[i] = weightMatrix[i] + AHPMatrix[j][i];
            }
            weightMatrix[i] = weightMatrix[i] / 3;
        }



        double [] countMatrix, timeMatrix, typeMatrix;

        countMatrix = typeCriteriaAHP.typeCriteriaAHPMethods(weightMatrix[0], priorityData, numberOfBooks);
        timeMatrix = countCriteriaAHP.countCriteriaAHPMethods(weightMatrix[1], priorityData, numberOfBooks);
        typeMatrix= timeCriteriaAHP.timeCriteriaAHPMethods(weightMatrix[2], priorityData, numberOfBooks);

        ahPcriteriaWeight = new AHPcriteriaWeight(countMatrix, timeMatrix, typeMatrix);

        return ahPcriteriaWeight;

    }

    public double [] subCriteriaCalculationAnalyticalHierarchyProcess(int matrixSize, double [] criteriaMatrix, double criteria){
        int iterator,jterator;
        double[][] criteriaAHPMatrix = new double[matrixSize][matrixSize];
        double[] summationMatrix = new double[matrixSize];

        double[] criteriaWeightMatrix = new double[matrixSize];
        for (iterator = 0; iterator < matrixSize; iterator++) {
            criteriaAHPMatrix[iterator][iterator] = (1);
        }


        for (iterator = 0; iterator < matrixSize; iterator++) {
            for (jterator = iterator + 1; jterator < matrixSize; jterator++) {
                criteriaAHPMatrix[iterator][jterator] = Math.pow(criteriaMatrix[iterator] / criteriaMatrix[jterator],-1);
                summationMatrix[iterator] = summationMatrix[iterator] + criteriaAHPMatrix[iterator][jterator];

            }
        }

        for (iterator = 0; iterator < matrixSize; iterator++) {
            for (jterator = 0; jterator < matrixSize; jterator++) {
                criteriaAHPMatrix[iterator][jterator] = criteriaAHPMatrix[iterator][jterator]
                        / summationMatrix[iterator];
                criteriaWeightMatrix[iterator] = criteriaWeightMatrix[iterator] + criteriaAHPMatrix[jterator][iterator];

            }
            criteriaWeightMatrix[iterator] = criteriaWeightMatrix[iterator] / matrixSize;

        }

        for (iterator = 0; iterator < matrixSize; iterator++) {
            criteriaWeightMatrix[iterator] = criteriaWeightMatrix[iterator] * criteria;
        }

        return  criteriaWeightMatrix;
    }
}
