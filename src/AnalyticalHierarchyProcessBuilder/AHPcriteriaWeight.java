package AnalyticalHierarchyProcessBuilder;

public class AHPcriteriaWeight {

    private double highlyDemand;
    private double highMediumDemand;
    private double lowMediumDemand;
    private double lowlyDemand;

    private double latestBook;
    private double newlyBook;
    private double recentlyOldBook;
    private double oldBook;
    private double oldestBook;

    private double uponnashType;
    private double scienceFictionType;
    private double religionType;



    public AHPcriteriaWeight() {
    }



    public AHPcriteriaWeight( double[] countModule, double [] timeModule, double [] typeModule) {

        this.lowlyDemand = countModule[0];
        this.lowMediumDemand = countModule[1];
        this.highMediumDemand = countModule[2];
        this.highlyDemand = countModule[3];
        this.latestBook = timeModule[0];
        this.newlyBook = timeModule[1];
        this.recentlyOldBook = timeModule[2];
        this.oldBook = timeModule[3];
        this.uponnashType = typeModule[0];
        this.scienceFictionType = typeModule[1];
        this.religionType = typeModule[2];

    }



    public double getLowlyDemand() {
        return lowlyDemand;
    }

    public void setLowlyDemand(double lowlyDemand) {
        this.lowlyDemand = lowlyDemand;
    }

    public double getLowMediumDemand() {
        return lowMediumDemand;
    }

    public void setLowMediumDemand(double lowMediumDemand) {
        this.lowMediumDemand = lowMediumDemand;
    }

    public double getHighMediumDemand() {
        return highMediumDemand;
    }

    public void setHighMediumDemand(double highMediumDemand) {
        this.highMediumDemand = highMediumDemand;
    }

    public double getHighlyDemand() {
        return highlyDemand;
    }

    public void setHighlyDemand(double highlyDemand) {
        this.highlyDemand = highlyDemand;
    }

    public double getLatestBook() {
        return latestBook;
    }

    public void setLatestBook(double latestBook) {
        this.latestBook = latestBook;
    }

    public double getNewlyBook() {
        return newlyBook;
    }

    public void setNewlyBook(double newlyBook) {
        this.newlyBook = newlyBook;
    }

    public double getRecentlyOldBook() {
        return recentlyOldBook;
    }

    public void setRecentlyOldBook(double recentlyOldBook) {
        this.recentlyOldBook = recentlyOldBook;
    }

    public double getOldBook() {
        return oldBook;
    }

    public void setOldBook(double oldBook) {
        this.oldBook = oldBook;
    }

    public double getOldestBook() {
        return oldestBook;
    }

    public void setOldestBook(double oldestBook) {
        this.oldestBook = oldestBook;
    }

    public double getUponnashType() {
        return uponnashType;
    }

    public void setUponnashType(double uponnashType) {
        this.uponnashType = uponnashType;
    }


    public double getScienceFictionType() {
        return scienceFictionType;
    }

    public void setScienceFictionType(double scienceFictionType) {
        this.scienceFictionType = scienceFictionType;
    }

    public double getReligionType() {
        return religionType;
    }

    public void setReligionType(double religionType) {
        this.religionType = religionType;
    }



}
