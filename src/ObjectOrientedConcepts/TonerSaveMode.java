package ObjectOrientedConcepts;

public class TonerSaveMode extends PrintMode {

    public String tonerSavingLevel;

    public TonerSaveMode(int numberOfPages, PageSize pageSize, String orientation, double colorIntensity,
            double costPerPage) {
        super(numberOfPages, pageSize, orientation, colorIntensity, costPerPage);
    }



    TonerSavingLevel tonerSavingLevel1;

    public void getColorIntensity() {
        tonerSavingLevel1.getColorIntensity();
    }

    @Override
    void saveToner() {


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
