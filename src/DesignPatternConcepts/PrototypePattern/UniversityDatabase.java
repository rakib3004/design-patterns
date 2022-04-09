package DesignPatternConcepts.PrototypePattern;

import DesignPatternConcepts.FacadePattern.Rectangle;
import DesignPatternConcepts.FacadePattern.Shape;

import java.util.HashMap;

public class UniversityDatabase {

    private static HashMap<String,University> universityHashMap = new HashMap<String, University>();

    public static University getUniversity(String  universityID){

        University university = universityHashMap.get(universityID);

        University cloningUniversity;
        cloningUniversity = (University) university.clone();

        return cloningUniversity;
    }

    public static void loadUniversityInfo(){

       AgriculturalUniversity agriculturalUniversity = new AgriculturalUniversity();
       agriculturalUniversity.setId("Uni001");
       universityHashMap.put(agriculturalUniversity.getId(),agriculturalUniversity);
    }
}
