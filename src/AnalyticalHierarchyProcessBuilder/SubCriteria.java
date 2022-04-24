package AnalyticalHierarchyProcessBuilder;

public class SubCriteria {
     SubCriteriaAHP subCriteriaAHP;

    public SubCriteria( SubCriteriaAHP subCriteriaAHP) {
        this.subCriteriaAHP=subCriteriaAHP;
    }
    public double [] subCriteriaCalculation(int matrixSize, double [] criteriaCount, double criteriaValue){
        return  subCriteriaAHP.subCriteriaImplementation( matrixSize, criteriaCount, criteriaValue);
    }

}
