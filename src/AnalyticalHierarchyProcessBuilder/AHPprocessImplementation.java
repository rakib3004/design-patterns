package AnalyticalHierarchyProcessBuilder;


public class AHPprocessImplementation {
    AHPcriteriaWeight ahPcriteriaWeight;
    CountCriteriaAHP countCriteriaAHP;

    public PriorityData[] ahpProcessImplementationMethods(AHPcriteriaWeight ahPcriteriaWeight,
                                                          PriorityData[] priorityData, int numberOfBooks) {


        int iterator1;


        for (iterator1 = 0; iterator1 < numberOfBooks; iterator1++) {
            if (priorityData[iterator1].borrowPriority <= 10) {

                priorityData[iterator1].borrowPriority = ahPcriteriaWeight.lowlyDemand;
            } else if (priorityData[iterator1].borrowPriority <= 20) {

                priorityData[iterator1].borrowPriority = ahPcriteriaWeight.lowMediumDemand;
            } else if (priorityData[iterator1].borrowPriority <= 30) {

                priorityData[iterator1].borrowPriority = ahPcriteriaWeight.highMediumDemand;
            } else if (priorityData[iterator1].borrowPriority <= 40) {

                priorityData[iterator1].borrowPriority = ahPcriteriaWeight.highlyDemand;
            }
        }


        for (iterator1 = 0; iterator1 < numberOfBooks; iterator1++) {
            if (priorityData[iterator1].bookId.substring(0, 2).equals("01")) {
                priorityData[iterator1].bookPriority = ahPcriteriaWeight.uponnashType;
            } else if (priorityData[iterator1].bookId.substring(0, 2).equals("05")) {

                priorityData[iterator1].bookPriority = ahPcriteriaWeight.uponnashType;
            } else if (priorityData[iterator1].bookId.substring(0, 2).equals("02")) {

                priorityData[iterator1].bookPriority = ahPcriteriaWeight.kobitaType;
            } else if (priorityData[iterator1].bookId.substring(0, 2).equals("13")) {
                priorityData[iterator1].bookPriority = ahPcriteriaWeight.scienceFictionType;
            } else if (priorityData[iterator1].bookId.substring(0, 2).equals("14")) {
                priorityData[iterator1].bookPriority = ahPcriteriaWeight.scienceFictionType;
            } else if (priorityData[iterator1].bookId.substring(0, 2).equals("06")) {
                priorityData[iterator1].bookPriority = ahPcriteriaWeight.scienceFictionType;
            } else if (priorityData[iterator1].bookId.substring(0, 2).equals("10")) {
                priorityData[iterator1].bookPriority = ahPcriteriaWeight.kisorUponnashType;
            } else if (priorityData[iterator1].bookId.substring(0, 2).equals("11")) {
                priorityData[iterator1].bookPriority = ahPcriteriaWeight.kisorUponnashType;
            } else if (priorityData[iterator1].bookId.substring(0, 2).equals("04")) {
                priorityData[iterator1].bookPriority = ahPcriteriaWeight.religionType;
            } else {
                priorityData[iterator1].bookPriority = ahPcriteriaWeight.othersType;
            }
        }
        try {

            for (iterator1 = 0; iterator1 < numberOfBooks; iterator1++) {
                if (Integer.parseInt(priorityData[iterator1].bookPrice) <= 180) {
                    priorityData[iterator1].pricePriority = ahPcriteriaWeight.lowPrice;
                } else if (Integer.parseInt(priorityData[iterator1].bookPrice) <= 250) {
                    priorityData[iterator1].pricePriority = ahPcriteriaWeight.mediumPrice;
                } else {
                    priorityData[iterator1].pricePriority = ahPcriteriaWeight.highPrice;
                }
            }
        } catch (Exception exception) {
        }

        for (iterator1 = 0; iterator1 < numberOfBooks; iterator1++) {
            if (priorityData[iterator1].timePriority <= 4.00) {
                priorityData[iterator1].timePriority = ahPcriteriaWeight.latestBook;
            } else if (priorityData[iterator1].timePriority <= 6.00) {
                priorityData[iterator1].timePriority = ahPcriteriaWeight.newlyBook;
            } else if (priorityData[iterator1].timePriority <= 8.00) {
                priorityData[iterator1].timePriority = ahPcriteriaWeight.recentlyOldBook;
            } else if (priorityData[iterator1].timePriority <= 10.00) {
                priorityData[iterator1].timePriority = ahPcriteriaWeight.oldBook;
            } else if (priorityData[iterator1].timePriority <= 12.00) {
                priorityData[iterator1].timePriority = ahPcriteriaWeight.oldestBook;
            }
        }


        return priorityData;
    }
}