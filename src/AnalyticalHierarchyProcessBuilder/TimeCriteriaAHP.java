package AnalyticalHierarchyProcessBuilder;


public class TimeCriteriaAHP {

    AHPSubCriteriaProcess ahpSubCriteriaProcess = new AHPSubCriteriaProcess();
    double[] monthCounter = new double[5];
    public double [] timeCriteriaAHPMethods(double criteria, PriorityData[] priorityData, int numberOfBooks) {

        AHPcalculation ahPcalculation = new AHPcalculation();

        monthCounter = ahpSubCriteriaProcess.timeCriteriaCalculationMethods(priorityData, numberOfBooks);
        double [] timeWeightMatrix = ahPcalculation.subCriteriaCalculationAnalyticalHierarchyProcess(5,monthCounter,criteria);

        return timeWeightMatrix;
    }
}