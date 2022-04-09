package DesignPatternConcepts.BuilderPattern;


import java.util.ArrayList;
import java.util.List;

public class FoodMenu {
    private List<Item> foodItems = new ArrayList<Item>();

    public void addFood(Item foodItem){
        foodItems.add(foodItem);
    }

    public float totalBill(){
        float totalBill = 0.0f;

        for (Item foodItem : foodItems) {
            totalBill += foodItem.foodPrice();
        }
        return totalBill;
    }

    public void showFoods(){

        for (Item item : foodItems) {
            System.out.print("Food Name : " + item.foodName());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.foodPrice());
        }
    }
}