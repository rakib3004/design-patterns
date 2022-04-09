package DesignPatternConcepts.BuilderPattern;

public class FriedRice extends FoodItem {

    @Override
    public String foodName() {
        return "Fried Rice";
    }

    @Override
    public float foodPrice() {
        return 50.0f;
    }
}
