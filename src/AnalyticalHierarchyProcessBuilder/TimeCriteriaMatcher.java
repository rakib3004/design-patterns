package AnalyticalHierarchyProcessBuilder;

public interface TimeCriteriaMatcher {
    public boolean compareBorrowCount(double timePriority);
    public int getBorrowClassIndex();
}
