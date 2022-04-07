package ObjectOrientedConcepts;

public class BoosterMode extends PrintMode {

    private double intensityThreshold = 0.75;

    public BoosterMode(int numberOfPages, PageSize pageSize, String orientation, double colorIntensity,
            double costPerPage) {
        super(numberOfPages, pageSize, orientation, colorIntensity, costPerPage);
    }

    /*
     * [Liskov Substitution Principle]
     * This class extend 'PrintMode' but if 'PrintMode' does not exists
     * This is independently executes without any problem
     * because this class already have all essential attributes and methods
     * so its follow *Liskov Substitution Principle*
     */

    /*
     * This follow [Single-Responsibility Principle]
     * because this class works on only on responsibility
     */

    @Override
    void saveToner() {

    }

    @Override
    void savePage() {

    }

    @Override
    void boost() {
        /*
         * It follows [O]pen Closed Principle] because it's never modify the parent
         * class module
         * But it can extend[override] parent class module for better purpose
         */
        colorIntensity = intensityThreshold;
        System.out.println("Set Color Intensity according to Intensity Threshold");

    }
}
