package AnalyticalHierarchyProcessBuilder;

public class HighMediumBorrowCriteria implements  BorrowCriteriaMatcher {
    @Override
    public boolean compareBorrowCount() {
        return false;
    }

    @Override
    public int getBorrowClassIndex() {
        return 0;
    }
}
