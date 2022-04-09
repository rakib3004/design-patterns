package DesignPatternConcepts.BuilderPattern;

public class FoodMenuBuilder {

public FoodMenu createClassicalBangladeshiFoodMenu(){
    FoodMenu foodMenu = new FoodMenu();
    foodMenu.addFood(new FriedRice());
    foodMenu.addFood(new Juice());
    return foodMenu;
}


    public FoodMenu createMordernBangladeshiFoodMenu(){
        FoodMenu foodMenu = new FoodMenu();
        foodMenu.addFood(new Kacci());
        foodMenu.addFood(new Yogurt());
        return foodMenu;
    }


    public FoodMenu createClassicalAmericanFoodMenu(){
        FoodMenu foodMenu = new FoodMenu();
        foodMenu.addFood(new Burger());
        foodMenu.addFood(new Juice());
        return foodMenu;
    }


    public FoodMenu createModernAmericanFoodMenu(){
        FoodMenu foodMenu = new FoodMenu();
        foodMenu.addFood(new Pizza());
        foodMenu.addFood(new Pepsi());
        return foodMenu;
    }


    public FoodMenu createClassicalMixedFoodMenu(){
        FoodMenu foodMenu = new FoodMenu();
        foodMenu.addFood(new Biriyani());
        foodMenu.addFood(new Pepsi());
        return foodMenu;
    }


    public FoodMenu createModernMixedFoodMenu(){
        FoodMenu foodMenu = new FoodMenu();
        foodMenu.addFood(new Pizza());
        foodMenu.addFood(new Yogurt());
        return foodMenu;
    }





}
