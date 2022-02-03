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

        public void getColorIntensity() {
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


        /*
        *This class abstract only those three class whose are
        *  essential for its' children class and it does not  force to implement
        * an interface that it does’t use it's client class
        *So it follows [Interface Segregation Principle]

         */

            /*
            *This PrintMode class is independent because this never dependent on any class
            *On the other hand Its' children depend on this class
            * So, it follows [Dependency Inversion Principle]
             */
        abstract   void saveToner();

        abstract  void savePage();

        abstract void boost();



}

class PageSize{

    private double pageHeight;
    private double pageWidth;

    public PageSize(double pageHeight, double pageWidth) {
        this.pageHeight = pageHeight;
        this.pageWidth = pageWidth;
    }

    public double getPageHeight() {
        return pageHeight;
    }

    public void setPageHeight(double pageHeight) {
        this.pageHeight = pageHeight;
    }

    public double getPageWidth() {
        return pageWidth;
    }

    public void setPageWidth(double pageWidth) {
        this.pageWidth = pageWidth;
    }
}
