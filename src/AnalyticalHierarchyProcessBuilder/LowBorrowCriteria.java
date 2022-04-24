package AnalyticalHierarchyProcessBuilder;

public class LowBorrowCriteria implements BorrowCriteriaMatcher {

    @Override
    public boolean compareBorrowCount(double borrowPriority) {
          return borrowPriority<=10;
    }

    @Override
    public int getBorrowClassIndex() {
        return 3;
    }
}
