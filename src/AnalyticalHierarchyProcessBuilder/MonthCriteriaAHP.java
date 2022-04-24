package AnalyticalHierarchyProcessBuilder;


public class MonthCriteriaAHP {

    AHPSubCriteriaProcess ahpSubCriteriaProcess = new AHPSubCriteriaProcess();
    double[] monthCounter = new double[5];

    public double [] monthCriteriaAHPMethods(double criteria, PriorityData[] priorityData, int numberOfBooks) {

        AHPcalculation ahPcalculation = new AHPcalculation();

        monthCounter = ahpSubCriteriaProcess.monthCriteriaCalculationMethods(priorityData, numberOfBooks);
        double [] monthWeightMatrix = ahPcalculation.matrixCalculationAnalyticalHierarchyProcess(5,monthCounter,criteria);



        return monthWeightMatrix;
    }
}