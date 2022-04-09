package DesignPatternConcepts.PrototypePattern;

public class AgriculturalUniversity extends University {


    public AgriculturalUniversity() {
        universityType="Agricultural University";
    }

    @Override
    void universityDetails() {
        System.out.println("Agricultural, Animal Science, Agricultural Business, Fisheries Studies");
    }


}
