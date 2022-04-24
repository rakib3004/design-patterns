package AnalyticalHierarchyProcessBuilder;

public class OldTimeCriteria implements TimeCriteriaMatcher {
    @Override
    public boolean compareTimeCount(double timePriority) {
        return false;
    }

    @Override
    public int getBorrowClassIndex() {
        return 3;
    }
}
