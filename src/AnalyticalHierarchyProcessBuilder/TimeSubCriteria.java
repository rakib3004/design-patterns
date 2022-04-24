package AnalyticalHierarchyProcessBuilder;

public class TimeSubCriteria implements SubCriteriaAHP{

    @Override
    public double[] subCriteriaImplementation(double criteriaValue, PriorityData[] priorityData, int numberOfBooks) {
        AHPcalculation ahPcalculation =  AHPcalculation.getInstance();
        AHPSubCriteriaProcess ahpSubCriteriaProcess =  AHPSubCriteriaProcess.getInstance();
        int matrixSize=5;
       double[] criteriaCount = ahpSubCriteriaProcess.timeCriteriaCalculationMethods(priorityData, numberOfBooks);
        return ahPcalculation.subCriteriaCalculationAnalyticalHierarchyProcess(matrixSize,criteriaCount,criteriaValue);

    }
}
