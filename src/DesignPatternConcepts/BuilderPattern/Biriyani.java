package DesignPatternConcepts.BuilderPattern;

public class Biriyani extends FoodItem {

    @Override
    public String foodName() {
        return "Biriyani";
    }

    @Override
    public float foodPrice() {
        return 100.0f;
    }
}
