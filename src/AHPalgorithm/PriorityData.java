package AHPalgorithm;

public class PriorityData {
    public double bookPriority;
    public double timePriority;
    public double borrowPriority;
    public double pricePriority;


    public PriorityData(double bookPriority, double timePriority, double borrowPriority, double pricePriority) {
        this.bookPriority = bookPriority;
        this.timePriority = timePriority;
        this.borrowPriority = borrowPriority;
        this.pricePriority = pricePriority;
    }

    public double getBookPriority() {
        return bookPriority;
    }

    public void setBookPriority(double bookPriority) {
        this.bookPriority = bookPriority;
    }

    public double getTimePriority() {
        return timePriority;
    }

    public void setTimePriority(double timePriority) {
        this.timePriority = timePriority;
    }

    public double getBorrowPriority() {
        return borrowPriority;
    }

    public void setBorrowPriority(double borrowPriority) {
        this.borrowPriority = borrowPriority;
    }

    public double getPricePriority() {
        return pricePriority;
    }

    public void setPricePriority(double pricePriority) {
        this.pricePriority = pricePriority;
    }
}
