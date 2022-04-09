package DesignPatternConcepts.BuilderPattern;

public class Pepsi extends DrinkingItem {
    @Override
    public String foodName() {
        return "Pepsi";
    }

    @Override
    public float foodPrice() {
        return 25.0f;
    }
}
