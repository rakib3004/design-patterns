package ObjectOrientedConcepts;

abstract class PrintMode {


        public int numberOfPages;
        public PageSize pageSize;
         public String orientation;
       public double colorIntensity;
        public double costPerPage;

    public PrintMode(int numberOfPages, PageSize pageSize, String orientation, double colorIntensity, double costPerPage) {

    }

    public int getNumberOfPages() {
            return numberOfPages;
        }

        public void setNumberOfPages(int numberOfPages) {
            this.numberOfPages = numberOfPages;
        }

        public PageSize getPageSize() {
            return pageSize;
        }

        public void setPageSize(PageSize pageSize) {
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

class PageSize{

    private double pageHeight;
    private double pageWeight;

    public PageSize(double pageHeight, double pageWeight) {
        this.pageHeight = pageHeight;
        this.pageWeight = pageWeight;
    }

    public double getPageHeight() {
        return pageHeight;
    }

    public void setPageHeight(double pageHeight) {
        this.pageHeight = pageHeight;
    }

    public double getPageWeight() {
        return pageWeight;
    }

    public void setPageWeight(double pageWeight) {
        this.pageWeight = pageWeight;
    }
}
