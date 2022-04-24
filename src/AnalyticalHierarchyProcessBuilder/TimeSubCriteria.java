package AnalyticalHierarchyProcessBuilder;

public class TimeSubCriteria implements SubCriteriaAHP{
    AHPcalculation ahPcalculation = AHPcalculation.getInstance();

    @Override
    public double[] subCriteriaImplementation(double criteriaValue, PriorityData[] priorityData, int numberOfBooks) {
        AHPcalculation ahPcalculation = new AHPcalculation();
        AHPSubCriteriaProcess ahpSubCriteriaProcess = new AHPSubCriteriaProcess();
        int matrixSize=5;
       double[] criteriaCount = ahpSubCriteriaProcess.timeCriteriaCalculationMethods(priorityData, numberOfBooks);
        return ahPcalculation.subCriteriaCalculationAnalyticalHierarchyProcess(matrixSize,criteriaCount,criteriaValue);

    }
}
