package AnalyticalHierarchyProcessBuilder;

public class OldestTimeCriteria implements  TimeCriteriaMatcher {
    @Override
    public boolean compareTimeCount(double timePriority) {
        return false;
    }

    @Override
    public int getBorrowClassIndex() {
        return 4;
    }
}
