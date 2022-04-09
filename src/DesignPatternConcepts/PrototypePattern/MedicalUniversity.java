package DesignPatternConcepts.PrototypePattern;

public class MedicalUniversity extends University {

    public MedicalUniversity() {
        universityType="Medical University";
    }

    @Override
    void universityDetails() {
        System.out.println("Medicine, Nero-Science, Surgery, Heart Science");
    }

}
