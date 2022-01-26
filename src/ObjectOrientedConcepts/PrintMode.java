package ObjectOrientedConcepts;

abstract class PrintMode {

    int numberOfPages;
    int pageSize;
    String orientation;
    double colorIntensity;


    double costPerPage;


    public double getCostPerPage() {
        return costPerPage;
    }

    public void setCostPerPage(double costPerPage) {
        this.costPerPage = costPerPage;
    }

  /*  public abstract void getSaveToner(){

    }*/


}
