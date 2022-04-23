package AnalyticalHierarchyProcessBuilder;


public class AHPprocessImplementation {
    AHPcriteriaWeight ahPcriteriaWeight;
    CountCriteriaAHP countCriteriaAHP;

    public PriorityData[] ahpProcessImplementationMethods(AHPcriteriaWeight ahPcriteriaWeight,
                                                          PriorityData[] priorityData, int numberOfBooks) {


        int iterator1;


        for (iterator1 = 0; iterator1 < numberOfBooks; iterator1++) {
            if (priorityData[iterator1].borrowPriority <= 10) {

                priorityData[iterator1].borrowPriority = ahPcriteriaWeight.getLowlyDemand();
            } else if (priorityData[iterator1].borrowPriority <= 20) {

                priorityData[iterator1].borrowPriority = ahPcriteriaWeight.getLowMediumDemand();
            } else if (priorityData[iterator1].borrowPriority <= 30) {

                priorityData[iterator1].borrowPriority = ahPcriteriaWeight.getHighMediumDemand();
            } else if (priorityData[iterator1].borrowPriority <= 40) {

                priorityData[iterator1].borrowPriority = ahPcriteriaWeight.getHighlyDemand();
            }
        }


        for (iterator1 = 0; iterator1 < numberOfBooks; iterator1++) {
            if (priorityData[iterator1].bookId.substring(0, 2).equals("01")) {
                priorityData[iterator1].bookPriority = ahPcriteriaWeight.getUponnashType();
            } else if (priorityData[iterator1].bookId.substring(0, 2).equals("05")) {

                priorityData[iterator1].bookPriority = ahPcriteriaWeight.getUponnashType();
            } else if (priorityData[iterator1].bookId.substring(0, 2).equals("02")) {

                priorityData[iterator1].bookPriority = ahPcriteriaWeight.getKobitaType();
            } else if (priorityData[iterator1].bookId.substring(0, 2).equals("13")) {
                priorityData[iterator1].bookPriority = ahPcriteriaWeight.getScienceFictionType();
            } else if (priorityData[iterator1].bookId.substring(0, 2).equals("14")) {
                priorityData[iterator1].bookPriority = ahPcriteriaWeight.getScienceFictionType();
            } else if (priorityData[iterator1].bookId.substring(0, 2).equals("06")) {
                priorityData[iterator1].bookPriority = ahPcriteriaWeight.getScienceFictionType();
            } else if (priorityData[iterator1].bookId.substring(0, 2).equals("10")) {
                priorityData[iterator1].bookPriority = ahPcriteriaWeight.getKisorUponnashType();
            } else if (priorityData[iterator1].bookId.substring(0, 2).equals("11")) {
                priorityData[iterator1].bookPriority = ahPcriteriaWeight.getKisorUponnashType();
            } else if (priorityData[iterator1].bookId.substring(0, 2).equals("04")) {
                priorityData[iterator1].bookPriority = ahPcriteriaWeight.getReligionType();
            } else {
                priorityData[iterator1].bookPriority = ahPcriteriaWeight.getOthersType();
            }
        }
        try {

            for (iterator1 = 0; iterator1 < numberOfBooks; iterator1++) {
                if (Integer.parseInt(priorityData[iterator1].bookPrice) <= 180) {
                    priorityData[iterator1].pricePriority = ahPcriteriaWeight.getLowPrice();
                } else if (Integer.parseInt(priorityData[iterator1].bookPrice) <= 250) {
                    priorityData[iterator1].pricePriority = ahPcriteriaWeight.getMediumPrice();
                } else {
                    priorityData[iterator1].pricePriority = ahPcriteriaWeight.getHighPrice();
                }
            }
        } catch (Exception exception) {
        }

        for (iterator1 = 0; iterator1 < numberOfBooks; iterator1++) {
            if (priorityData[iterator1].timePriority <= 4.00) {
                priorityData[iterator1].timePriority = ahPcriteriaWeight.getLatestBook();
            } else if (priorityData[iterator1].timePriority <= 6.00) {
                priorityData[iterator1].timePriority = ahPcriteriaWeight.getNewlyBook();
            } else if (priorityData[iterator1].timePriority <= 8.00) {
                priorityData[iterator1].timePriority = ahPcriteriaWeight.getRecentlyOldBook();
            } else if (priorityData[iterator1].timePriority <= 10.00) {
                priorityData[iterator1].timePriority = ahPcriteriaWeight.getOldBook();
            } else if (priorityData[iterator1].timePriority <= 12.00) {
                priorityData[iterator1].timePriority = ahPcriteriaWeight.getOldestBook();
            }
        }


        return priorityData;
    }
}