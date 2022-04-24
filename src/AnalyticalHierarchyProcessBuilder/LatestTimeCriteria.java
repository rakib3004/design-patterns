package AnalyticalHierarchyProcessBuilder;

public class LatestTimeCriteria implements TimeCriteriaMatcher{
    @Override
    public boolean compareBorrowCount(double timePriority) {
        return false;
    }

    @Override
    public int getBorrowClassIndex() {
        return 0;
    }
}
