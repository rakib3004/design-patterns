package DesignPatternConcepts.BuilderPattern;

public class Pizza extends FoodItem {

    @Override
    public String foodName() {
        return "Pizza";
    }

    @Override
    public float foodPrice() {
        return 90.0f;
    }
}
