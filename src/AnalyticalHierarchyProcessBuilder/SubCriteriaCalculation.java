package AnalyticalHierarchyProcessBuilder;

public class SubCriteriaCalculation<priorityData> {


    double criteria;
    PriorityData[] priorityData;
    int numberOfBooks;

    public SubCriteriaCalculation(double criteria, PriorityData[] priorityData, int numberOfBooks) {
        this.criteria = criteria;
        this.priorityData = priorityData;
        this.numberOfBooks = numberOfBooks;
    }

    public void calculateSubCriteria(){
        SubCriteria subCriteria = new SubCriteria(new TimeSubCriteria());
        subCriteria.subCriteriaCalculation()
    }



}
