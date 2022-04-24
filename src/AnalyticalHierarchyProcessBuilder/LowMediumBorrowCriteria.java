package AnalyticalHierarchyProcessBuilder;

public class LowMediumBorrowCriteria implements  BorrowCriteriaMatcher{
    @Override
    public boolean compareBorrowCount() {
        return false;
    }

    @Override
    public int getBorrowClassIndex() {
        return 0;
    }
}
