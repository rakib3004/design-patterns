package ObjectOrientedConcepts;

public class PageSaveMode extends PrintMode {



    public PageSaveMode(int numberOfPages, PageSize pageSize, String orientation, double colorIntensity, double costPerPage) {
       super(numberOfPages,pageSize,orientation,colorIntensity,costPerPage);
    }

    /* This follow [Single-Responsibility Principle]
     * because this class works on only on responsibility
     */

    /*
     *[Liskov Substitution Principle]
     *  This class extend 'PrintMode' but if 'PrintMode' does not exists
     * This is independently executes without any problem
     * because this class already have all essential attributes and methods
     * so its follow   *Liskov Substitution Principle*
     */



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
