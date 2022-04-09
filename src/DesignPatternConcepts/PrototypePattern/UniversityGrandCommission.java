package DesignPatternConcepts.PrototypePattern;

public class UniversityGrandCommission {

    public static void main(String[] args) {
        UniversityDatabase.loadUniversityInfo();

        University firstUniversity = (University) UniversityDatabase.getUniversity("Uni001");
        System.out.println("University Details: "+ firstUniversity.getUniversityType());

        University secondUniversity = (University) UniversityDatabase.getUniversity("Uni002");
        System.out.println("University Details: "+ secondUniversity.getUniversityType());

        University thirdUniversity = (University) UniversityDatabase.getUniversity("Uni003");
        System.out.println("University Details: "+ thirdUniversity.getUniversityType());
    }
}
