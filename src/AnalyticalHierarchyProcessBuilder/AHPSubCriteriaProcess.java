package AnalyticalHierarchyProcessBuilder;


import java.util.List;

public class AHPSubCriteriaProcess {

    int iterator;


    List<BorrowCriteriaMatcher> borrowCriteriaMatchers;
    public  AHPSubCriteriaProcess(List<BorrowCriteriaMatcher> borrowCriteriaMatchers) {
    super();
    this.borrowCriteriaMatchers=borrowCriteriaMatchers;
    }

    public AHPSubCriteriaProcess() {
    }




    public double[] borrowCriteriaCalculationMethods(PriorityData[] priorityData, int numberOfBooks) {
        int[] borrowCounter = new int[4];
        double[] parsingBorrowCounter = new double[4];

        // count number of books on each type of purchase category in AHP Calculation


        int index=0;
        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            for (BorrowCriteriaMatcher borrowCriteriaMatcher: borrowCriteriaMatchers){
                if(borrowCriteriaMatcher.compareBorrowCount(priorityData[iterator].getBorrowPriority()))
                    index=borrowCriteriaMatcher.getBorrowClassIndex();
                     borrowCounter[index]++;
            }
        }

        for (iterator = 0; iterator < 4; iterator++) {
            parsingBorrowCounter[iterator] = Double.parseDouble(String.valueOf(borrowCounter[iterator]));
        }

        return parsingBorrowCounter;
    }

    public double[] timeCriteriaCalculationMethods(PriorityData[] priorityData, int numberOfBooks) {
        int[] timeCounter = new int[5];
        double[] parsingTimeCounter = new double[5];

        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            if (priorityData[iterator].getTimePriority() <= 5.60) {
                timeCounter[4]++;

            } else if (priorityData[iterator].getTimePriority() <= 7.20) {
                timeCounter[3]++;

            } else if (priorityData[iterator].getTimePriority() <= 9.50) {
                timeCounter[2]++;

            } else if (priorityData[iterator].getTimePriority() <= 12.00) {
                timeCounter[1]++;

            } else if (priorityData[iterator].getTimePriority() <= 14.00) {
                timeCounter[0]++;
            }
        }

        for (iterator = 0; iterator < 5; iterator++) {
            parsingTimeCounter[iterator] = Double.parseDouble(String.valueOf(timeCounter[iterator]));
        }
        return parsingTimeCounter;
    }

    public double[] typeCriteriaCalculationMethods(PriorityData[] priorityData, int numberOfBooks) {
        int[] typeCounter = new int[3];
        double[] parsingTypeCounter = new double[3];


        for (iterator = 0; iterator < numberOfBooks; iterator++) {
            if (priorityData[iterator].getBookId().substring(0, 2).equals("01")) {
                typeCounter[0]++;
            } else if (priorityData[iterator].getBookId().substring(0, 2).equals("08")) {
                typeCounter[1]++;
            } else {
                typeCounter[2]++;
            }
        }
        for (iterator = 0; iterator < 3; iterator++) {
            parsingTypeCounter[iterator] = Double.parseDouble(String.valueOf(typeCounter[iterator]));
        }
        return parsingTypeCounter;
    }
}
