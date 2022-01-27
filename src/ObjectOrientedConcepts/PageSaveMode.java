package ObjectOrientedConcepts;

public class PageSaveMode extends PrintMode {



    public PageSaveMode(int numberOfPages, PageSize pageSize, String orientation, double colorIntensity, double costPerPage) {
       super(numberOfPages,pageSize,orientation,colorIntensity,costPerPage);
    }


    public void renderPreview(){
        System.out.println("Preview the Documents");
    }

    @Override
    void saveToner() {

    }

    @Override
    void savePage() {

    }

    @Override
    void boost() {

    }
}
