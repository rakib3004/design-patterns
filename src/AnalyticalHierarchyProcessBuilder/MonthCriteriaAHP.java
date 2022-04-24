package AnalyticalHierarchyProcessBuilder;


public class MonthCriteriaAHP {

    AHPSubCriteriaProcess ahpSubCriteriaProcess = new AHPSubCriteriaProcess();
    double[] monthCounter = new double[5];

    public AHPcriteriaWeight monthCriteriaAHPMethods(double criteria, PriorityData[] priorityData, int numberOfBooks) {

        AHPcalculation ahPcalculation = new AHPcalculation();

        monthCounter = ahpSubCriteriaProcess.monthCriteriaCalculationMethods(priorityData, numberOfBooks);
        double [] monthWeightMatrix = ahPcalculation.matrixCalculationAnalyticalHierarchyProcess(5,monthCounter,criteria);

        AHPcriteriaWeight  ahPcriteriaWeight = new AHPcriteriaWeight(monthWeightMatrix[0], monthWeightMatrix[1],
                monthWeightMatrix[2], monthWeightMatrix[3], monthWeightMatrix[4]);

        return ahPcriteriaWeight;
    }
}