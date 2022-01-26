package ObjectOrientedConcepts;

abstract class PrintMode {


    int numberOfPages;
    int pageSize;
    String orientation;
    double colorIntensity;
    double costPerPage;

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    public double getColorIntensity() {
        return colorIntensity;
    }

    public void setColorIntensity(double colorIntensity) {
        this.colorIntensity = colorIntensity;
    }

    public double getCostPerPage() {
        return costPerPage;
    }

    public void setCostPerPage(double costPerPage) {
        this.costPerPage = costPerPage;
    }



    abstract   void saveToner();

    abstract  void savePage();

    abstract void boost();



}
