package AnalyticalHierarchyProcessBuilder;

public class LowMediumBorrowCriteria implements  BorrowCriteriaMatcher{
    @Override
    public boolean compareBorrowCount(double borrowPriority) {
        return borrowPriority<=20;
    }

    @Override
    public int getBorrowClassIndex() {
        return 0;
    }
}
