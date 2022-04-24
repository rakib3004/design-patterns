package AnalyticalHierarchyProcessBuilder;

public class SubCriteria {
     SubCriteriaAHP subCriteriaAHP;

    public SubCriteria( SubCriteriaAHP subCriteriaAHP) {
        this.subCriteriaAHP=subCriteriaAHP;
    }
    public double [] subCriteriaCalculation(double criteria, PriorityData[] priorityData, int numberOfBooks){
       return subCriteriaAHP.subCriteriaImplementation(criteria,priorityData, numberOfBooks);
    }

}
