package DesignPatternConcepts.BuilderPattern;

public class TakeOut {

    public static void main(String[] args) {
        System.out.println("Welcome to TakeOut");

        FoodMenuBuilder classicalBangladeshiFood = new FoodMenuBuilder();

        FoodMenu foodMenu = classicalBangladeshiFood.createClassicalBangladeshiFoodMenu();
        foodMenu.showFoods();


        FoodMenuBuilder modernBangladeshiFood = new FoodMenuBuilder();

        FoodMenu foodMenu2 = modernBangladeshiFood.createMordernBangladeshiFoodMenu();
        foodMenu2.showFoods();




    }
}
