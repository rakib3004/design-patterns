package ObjectOrientedConcepts;

public class TonerSaveMode extends PrintMode {

    public String tonerSavingLevel;

    public TonerSaveMode(int numberOfPages, PageSize pageSize, String orientation, double colorIntensity,
            double costPerPage) {
        super(numberOfPages, pageSize, orientation, colorIntensity, costPerPage);
    }

    /*
     * There is a toner saving level, color intensity algorithm where it show that
     * If toner saving level is high then color intensity is 1/3rd
     * If toner saving level is medium then color intensity is 2/3rd
     * If toner saving level is high then color intensity is full
     * We will assume the toner saving level is between 0 to 1
     */

    /*
     * [Liskov Substitution Principle]
     * This class extend 'PrintMode' but if 'PrintMode' does not exists
     * This is independently executes without any problem
     * because this class already have all essential attributes and methods
     * so its follow *Liskov Substitution Principle*
     */

    TonerSavingLevel tonerSavingLevel1;

    public void getColorIntensity() {
        tonerSavingLevel1.getColorIntensity();
    }

    @Override
    void saveToner() {

        /*
         * It follows [O]pen Closed Principle] because it's never modify the parent
         * class module
         * But it can extend[override] parent class module for better purpose
         */

        /*
         * Imple
         */

    }

    /*
     * If page height is less than page width then this page orientation is legal
     * If page height is greater than page width then this page orientation is legal
     */
    void adjustPage() {

        if (pageSize.getPageHeight() < pageSize.getPageWidth()) {
            orientation = "legal";
        } else {
            orientation = "portrait";
        }
    }

    @Override
    void savePage() {

    }

    @Override
    void boost() {

    }
}
