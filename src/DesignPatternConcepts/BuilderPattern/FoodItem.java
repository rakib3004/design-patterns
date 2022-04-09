package DesignPatternConcepts.BuilderPattern;

public abstract class FoodItem implements Item {

    public abstract String foodName();

    @Override
    public Box packing() {
        return new FoodBox();
    }

    public abstract float  foodPrice();
}
