package AnalyticalHierarchyProcessBuilder;

public class LatestTimeCriteria implements TimeCriteriaMatcher{
    @Override
    public boolean compareTimeCount(double timePriority) {
        return false;
    }

    @Override
    public int getBorrowClassIndex() {
        return 0;
    }
}
