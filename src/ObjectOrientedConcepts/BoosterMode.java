package ObjectOrientedConcepts;

public class BoosterMode extends PrintMode {

    private double intensityThreshold=0.75;

    public BoosterMode(int numberOfPages, PageSize pageSize, String orientation, double colorIntensity, double costPerPage) {
        super(numberOfPages,pageSize,orientation,colorIntensity,costPerPage);
    }

    @Override
    void saveToner() {

    }

    @Override
    void savePage() {

    }

    @Override
    void boost() {
        colorIntensity=intensityThreshold;

    }
}
