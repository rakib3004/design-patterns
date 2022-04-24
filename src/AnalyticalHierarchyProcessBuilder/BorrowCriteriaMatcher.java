package AnalyticalHierarchyProcessBuilder;

public interface BorrowCriteriaMatcher {
    public boolean compareBorrowCount(double borrowPriority);
    public int getBorrowClassIndex();
}
