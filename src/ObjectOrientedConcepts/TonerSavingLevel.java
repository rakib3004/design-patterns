package ObjectOrientedConcepts;

public interface TonerSavingLevel {
    double getColorIntensity();

}

class HighTonerSavingLevel implements TonerSavingLevel {

    @Override
    public double getColorIntensity() {
        return 0.99;
    }
}

class MediumTonerSavingLevel implements TonerSavingLevel {

    @Override
    public double getColorIntensity() {
        return 0.66;
    }
}

class LowTonerSavingLevel implements TonerSavingLevel {

    @Override
    public double getColorIntensity() {
        return 0.33;
    }
}
