package DesignPatternConcepts.BuilderPattern;


import java.util.ArrayList;
import java.util.List;

public class FoodMenu {
    private List<FoodItem> foodItems = new ArrayList<FoodItem>();

    public void addFood(FoodItem foodItem){
        foodItems.add(foodItem);
    }

    public float totalBill(){
        float totalBill = 0.0f;

        for (FoodItem foodItem : foodItems) {
            totalBill += foodItem.foodPrice();
        }
        return totalBill;
    }

    public void showFoods(){

        for (Item item : foodItems) {
            System.out.print("Item : " + item.foodPrice());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.foodPrice());
        }
    }
}