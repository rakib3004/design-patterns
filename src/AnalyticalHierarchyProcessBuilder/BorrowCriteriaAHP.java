package AnalyticalHierarchyProcessBuilder;


public class BorrowCriteriaAHP {

    AHPSubCriteriaProcess ahpSubCriteriaProcess = new AHPSubCriteriaProcess();
    double[] borrowCounter = new double[4];

    public  double [] borrowCriteriaAHPMethods(double criteria, PriorityData[] priorityData, int numberOfBooks) {

    AHPcalculation ahPcalculation = new AHPcalculation();
        borrowCounter = ahpSubCriteriaProcess.borrowCriteriaCalculationMethods(priorityData, numberOfBooks);

       double [] borrowWeightMatrix = ahPcalculation.subCriteriaCalculationAnalyticalHierarchyProcess(4, borrowCounter,criteria);



        return borrowWeightMatrix;
    }
}