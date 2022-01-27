package ObjectOrientedConcepts;

public class TonerSaveMode extends PrintMode {

    public String tonerSavingLevel;
    public TonerSaveMode(int numberOfPages, PageSize pageSize, String orientation, double colorIntensity, double costPerPage) {
        super(numberOfPages,pageSize,orientation,colorIntensity,costPerPage);
    }



    @Override
    void saveToner() {

        /*
        *There is a toner saving level, color intensity algorithm where it show that
        * If toner saving level is high then color intensity is 1/3rd
        * If toner saving level is medium then color intensity is 2/3rd
        * If toner saving level is high then color intensity is full
        * We will assume the toner saving level is between 0 to 1
        */


        if(tonerSavingLevel=="high"){
            colorIntensity=.33;
        }
        else if(tonerSavingLevel=="medium"){
            colorIntensity=.67;
        }
        else{
            colorIntensity=.33;
        }
    }

    @Override
    void savePage() {

    }

    @Override
    void boost() {

    }
}
