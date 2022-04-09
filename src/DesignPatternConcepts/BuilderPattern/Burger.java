package DesignPatternConcepts.BuilderPattern;

public class Burger extends FoodItem {

    @Override
    public String foodName() {
        return "Burger";
    }

    @Override
    public float foodPrice() {
        return 70.0f;
    }
}
