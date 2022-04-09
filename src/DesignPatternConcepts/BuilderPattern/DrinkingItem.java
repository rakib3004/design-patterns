package DesignPatternConcepts.BuilderPattern;


public abstract class DrinkingItem implements Item {

    public abstract String foodName();

    @Override
    public Box packing() {
        return new DrinkingBox();
    }

    public abstract float  foodPrice();
}
