package AnalyticalHierarchyProcessBuilder;

public class BorrowSubCriteria implements SubCriteriaAHP{
    @Override
    public double[] subCriteriaImplementation(int matrixSize, double [] criteriaCount, double criteriaValue) {
        return new double[0];
    }

    @Override
    public double[] subCriteriaImplementation(double criteria, PriorityData[] priorityData, int numberOfBooks) {
        return new double[0];
    }
}
