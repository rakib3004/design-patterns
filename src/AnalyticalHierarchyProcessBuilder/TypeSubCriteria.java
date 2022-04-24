package AnalyticalHierarchyProcessBuilder;

public class TypeSubCriteria implements SubCriteriaAHP{
    AHPcalculation ahPcalculation = AHPcalculation.getInstance();

    @Override
    public double[] subCriteriaImplementation(double criteriaValue, PriorityData[] priorityData, int numberOfBooks) {
        AHPcalculation ahPcalculation = new AHPcalculation();
        AHPSubCriteriaProcess ahpSubCriteriaProcess = new AHPSubCriteriaProcess();
        int matrixSize=3;
        double[] criteriaCount = ahpSubCriteriaProcess.typeCriteriaCalculationMethods(priorityData, numberOfBooks);
        return ahPcalculation.subCriteriaCalculationAnalyticalHierarchyProcess(matrixSize,criteriaCount,criteriaValue);

    }
}
