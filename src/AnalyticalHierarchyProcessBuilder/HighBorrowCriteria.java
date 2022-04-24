package AnalyticalHierarchyProcessBuilder;

public class HighBorrowCriteria implements  BorrowCriteriaMatcher{
    @Override
    public boolean compareBorrowCount() {
        return false;
    }

    @Override
    public int getBorrowClassIndex() {
        return 0;
    }
}
