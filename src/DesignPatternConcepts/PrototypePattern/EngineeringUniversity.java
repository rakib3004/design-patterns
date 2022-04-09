package DesignPatternConcepts.PrototypePattern;

public class EngineeringUniversity extends University {

    public EngineeringUniversity() {
        universityType="Engineering University";
    }

    @Override
    void universityDetails() {
        System.out.println("Computer, Electrical, Civil, Mechanical, Chemical Engineering");
    }

}
