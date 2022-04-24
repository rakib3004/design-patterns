package AnalyticalHierarchyProcessBuilder;

public class HighMediumBorrowCriteria implements  BorrowCriteriaMatcher {
    @Override
    public boolean compareBorrowCount(double borrowPriority) {
        return borrowPriority<=30;
    }

    @Override
    public int getBorrowClassIndex() {
        return 0;
    }
}
