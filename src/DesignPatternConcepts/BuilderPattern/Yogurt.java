package DesignPatternConcepts.BuilderPattern;

public class Yogurt extends DrinkingItem {
    @Override
    public String foodName() {
        return "Yogurt";
    }

    @Override
    public float foodPrice() {
        return 30.0f;
    }
}
