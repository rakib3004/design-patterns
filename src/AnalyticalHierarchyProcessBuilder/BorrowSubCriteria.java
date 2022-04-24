package AnalyticalHierarchyProcessBuilder;

public class BorrowSubCriteria implements SubCriteriaAHP{
    @Override
    public double[] subCriteriaImplementation(double criteriaValue, PriorityData[] priorityData, int numberOfBooks) {
        AHPcalculation ahPcalculation =  AHPcalculation.getInstance();
        AHPSubCriteriaProcess ahpSubCriteriaProcess =  AHPSubCriteriaProcess.getInstance();
        int matrixSize=4;
        double[] criteriaCount = ahpSubCriteriaProcess.borrowCriteriaCalculationMethods(priorityData, numberOfBooks);
        return ahPcalculation.subCriteriaCalculationAnalyticalHierarchyProcess(matrixSize,criteriaCount,criteriaValue);

    }
}
