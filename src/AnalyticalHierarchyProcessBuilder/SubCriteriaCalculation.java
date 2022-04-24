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
        SubCriteria timeSubCriteria = new SubCriteria(new TimeSubCriteria());
        timeSubCriteria.subCriteriaCalculation(criteria,priorityData,numberOfBooks);

        SubCriteria typeSubCriteria = new SubCriteria(new TypeSubCriteria());
        typeSubCriteria.subCriteriaCalculation(criteria,priorityData,numberOfBooks);

        SubCriteria borrowSubCriteria = new SubCriteria(new BorrowSubCriteria());
        borrowSubCriteria.subCriteriaCalculation(criteria,priorityData,numberOfBooks);


    }



}
