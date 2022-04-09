package DesignPatternConcepts.PrototypePattern;

public abstract class University implements Cloneable {
private String id;
protected  String universityType;



    abstract void universityDetails();


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUniversityType() {
        return universityType;
    }

    public void setUniversityType(String universityType) {
        this.universityType = universityType;
    }


    public Object clone(){

        Object object = null;


        try{
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return object;
    }
}
