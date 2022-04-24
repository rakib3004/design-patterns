package AnalyticalHierarchyProcessBuilder;

public class HighBorrowCriteria implements  BorrowCriteriaMatcher{
    @Override
    public boolean compareBorrowCount(double borrowPriority) {
        return borrowPriority<=40;
    }

    @Override
    public int getBorrowClassIndex() {
        return 0;
    }
}
