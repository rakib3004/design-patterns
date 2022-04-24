package AnalyticalHierarchyProcessBuilder;

public class LowBorrowCriteria implements BorrowCriteriaMatcher {
    @Override
    public boolean compareBorrowCount() {
        return false;
    }

    @Override
    public int getBorrowClassIndex() {
        return 0;
    }
}
