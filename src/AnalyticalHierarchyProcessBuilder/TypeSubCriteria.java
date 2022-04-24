package AnalyticalHierarchyProcessBuilder;

public class TypeSubCriteria implements SubCriteriaAHP{

    @Override
    public double[] subCriteriaImplementation(double criteriaValue, PriorityData[] priorityData, int numberOfBooks) {
        AHPcalculation ahPcalculation =  AHPcalculation.getInstance();
        AHPSubCriteriaProcess ahpSubCriteriaProcess =  AHPSubCriteriaProcess.getInstance();
        int matrixSize=3;
        double[] criteriaCount = ahpSubCriteriaProcess.typeCriteriaCalculationMethods(priorityData, numberOfBooks);
        return ahPcalculation.subCriteriaCalculationAnalyticalHierarchyProcess(matrixSize,criteriaCount,criteriaValue);

    }
}
