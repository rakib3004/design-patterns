package AnalyticalHierarchyProcessBuilder;


public class AHPprocessImplementation {
    AHPcriteriaWeight ahPcriteriaWeight;
    CountCriteriaAHP countCriteriaAHP;

    public PriorityData[] ahpProcessImplementationMethods(AHPcriteriaWeight ahPcriteriaWeight,
                                                          PriorityData[] priorityData, int numberOfBooks) {


        int iterator1;


        for (iterator1 = 0; iterator1 < numberOfBooks; iterator1++) {
            if (priorityData[iterator1].getBorrowPriority()<= 10) {

                priorityData[iterator1].setBorrowPriority(ahPcriteriaWeight.getLowlyDemand()) ;
            } else if (priorityData[iterator1].getBorrowPriority() <= 20) {

                priorityData[iterator1].setBorrowPriority(ahPcriteriaWeight.getLowMediumDemand());
            } else if (priorityData[iterator1].getBorrowPriority() <= 30) {

                priorityData[iterator1].setBorrowPriority(ahPcriteriaWeight.getHighMediumDemand()) ;
            } else if (priorityData[iterator1].getBorrowPriority() <= 40) {

                priorityData[iterator1].setBorrowPriority(ahPcriteriaWeight.getHighlyDemand());
            }
        }


        for (iterator1 = 0; iterator1 < numberOfBooks; iterator1++) {
            if (priorityData[iterator1].getBookId().substring(0, 2).equals("01")) {
                priorityData[iterator1].setBookPriority(ahPcriteriaWeight.getUponnashType()) ;
            } else if (priorityData[iterator1].getBookId().substring(0, 2).equals("05")) {

                priorityData[iterator1].setBookPriority(ahPcriteriaWeight.getUponnashType());
            } else if (priorityData[iterator1].getBookId().substring(0, 2).equals("02")) {

                priorityData[iterator1].setBookPriority(ahPcriteriaWeight.getKobitaType());
            } else if (priorityData[iterator1].getBookId().substring(0, 2).equals("13")) {
                priorityData[iterator1].setBookPriority(ahPcriteriaWeight.getScienceFictionType());
            } else if (priorityData[iterator1].getBookId().substring(0, 2).equals("14")) {
                priorityData[iterator1].setBookPriority(ahPcriteriaWeight.getScienceFictionType());
            } else if (priorityData[iterator1].getBookId().substring(0, 2).equals("06")) {
                priorityData[iterator1].setBookPriority(ahPcriteriaWeight.getScienceFictionType());
            } else if (priorityData[iterator1].getBookId().substring(0, 2).equals("10")) {
                priorityData[iterator1].setBookPriority(ahPcriteriaWeight.getKisorUponnashType());
            } else if (priorityData[iterator1].getBookId().substring(0, 2).equals("11")) {
                priorityData[iterator1].setBookPriority(ahPcriteriaWeight.getKisorUponnashType());
            } else if (priorityData[iterator1].getBookId().substring(0, 2).equals("04")) {
                priorityData[iterator1].setBookPriority(ahPcriteriaWeight.getReligionType());
            } else {
                priorityData[iterator1].setBookPriority(ahPcriteriaWeight.getOthersType());
            }
        }
        try {

            for (iterator1  =0; iterator1 < numberOfBooks; iterator1++) {
                if (Integer.parseInt(priorityData[iterator1].getBookPrice()) < 180) {
                    priorityData[iterator1].setPricePriority(ahPcriteriaWeight.getLowPrice());  ;
                } else if (Integer.parseInt(priorityData[iterator1].getBookPrice()) < 250) {
                    priorityData[iterator1].setPricePriority(ahPcriteriaWeight.getMediumPrice());
                } else {
                    priorityData[iterator1].setPricePriority(ahPcriteriaWeight.getHighPrice());
                }
            }
        } catch (Exception exception) {
        }

        for (iterator1 = 0; iterator1 < numberOfBooks; iterator1++) {
            if (priorityData[iterator1].getTimePriority() <= 4.00) {
                priorityData[iterator1].setTimePriority(ahPcriteriaWeight.getLatestBook());
            } else if (priorityData[iterator1].getTimePriority() <= 6.00) {
                priorityData[iterator1].setTimePriority(ahPcriteriaWeight.getNewlyBook());
            } else if (priorityData[iterator1].getTimePriority() <= 8.00) {
                priorityData[iterator1].setTimePriority(ahPcriteriaWeight.getRecentlyOldBook());
            } else if (priorityData[iterator1].getTimePriority() <= 10.00) {
                priorityData[iterator1].setTimePriority(ahPcriteriaWeight.getOldBook());
            } else if (priorityData[iterator1].getTimePriority() <= 12.00) {
                priorityData[iterator1].setTimePriority(ahPcriteriaWeight.getOldestBook());
            }
        }


        return priorityData;
    }
}