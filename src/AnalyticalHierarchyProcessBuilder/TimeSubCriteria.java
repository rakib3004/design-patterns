package AnalyticalHierarchyProcessBuilder;

public class TimeSubCriteria implements SubCriteriaAHP{
    AHPcalculation ahPcalculation = new AHPcalculation();
    @Override
    public double[] subCriteriaImplementation(int matrixSize, double [] criteriaCount, double criteriaValue) {
        return ahPcalculation.subCriteriaCalculationAnalyticalHierarchyProcess(matrixSize,criteriaCount,criteriaValue);
    }

    @Override
    public double[] subCriteriaImplementation(double criteria, PriorityData[] priorityData, int numberOfBooks) {
        return new double[0];
    }
}
