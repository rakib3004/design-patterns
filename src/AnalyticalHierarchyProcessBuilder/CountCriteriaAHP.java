package AnalyticalHierarchyProcessBuilder;


public class CountCriteriaAHP {

    AHPSubCriteriaProcess ahpSubCriteriaProcess = new AHPSubCriteriaProcess();
    double[] countCounter = new double[4];

    public AHPcriteriaWeight countCriteriaAHPMethods(double criteria, PriorityData[] priorityData, int numberOfBooks) {


    AHPcalculation ahPcalculation = new AHPcalculation();
        countCounter = ahpSubCriteriaProcess.countCriteriaCalculationMethods(priorityData, numberOfBooks);

       double [] countWeightMatrix = ahPcalculation.matrixCalculationAnalyticalHierarchyProcess(4,countCounter,criteria)

        AHPcriteriaWeight  ahPcriteriaWeight = new AHPcriteriaWeight(countWeightMatrix[0], countWeightMatrix[1], countWeightMatrix[2],
                countWeightMatrix[3]);


        return ahPcriteriaWeight;
    }
}