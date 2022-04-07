package ObjectOrientedConcepts;

public class PageSaveMode extends PrintMode {

    public PageSaveMode(int numberOfPages, PageSize pageSize, String orientation, double colorIntensity,
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

    @Override
    void saveToner() {
        /*
         * It follows [O]pen Closed Principle] because it's never modify the parent
         * class module
         * But it can extend[override] parent class module for better purpose
         */
        System.out.println("Save Toner Successfully done!");
        renderPreview();
    }

    @Override
    void savePage() {

    }

    @Override
    void boost() {

    }

    public void renderPreview() {
        System.out.println("Preview the Documents");
    }

}
