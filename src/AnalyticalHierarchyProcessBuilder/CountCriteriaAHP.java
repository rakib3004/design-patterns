package AnalyticalHierarchyProcessBuilder;


public class CountCriteriaAHP {

    AHPSubCriteriaProcess ahpSubCriteriaProcess = new AHPSubCriteriaProcess();
    double[] countCounter = new double[4];

    public  double []  countCriteriaAHPMethods(double criteria, PriorityData[] priorityData, int numberOfBooks) {

    AHPcalculation ahPcalculation = new AHPcalculation();
        countCounter = ahpSubCriteriaProcess.countCriteriaCalculationMethods(priorityData, numberOfBooks);

       double [] countWeightMatrix = ahPcalculation.matrixCalculationAnalyticalHierarchyProcess(4,countCounter,criteria);



        return countWeightMatrix;
    }
}