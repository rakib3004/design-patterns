package DesignPatternConcepts.BuilderPattern;

public class Juice extends DrinkingItem {
    @Override
    public String foodName() {
        return "Juice";
    }

    @Override
    public float foodPrice() {
        return 20.0f;
    }
}
