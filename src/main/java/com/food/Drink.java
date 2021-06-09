package com.food;

public class Drink extends FoodItem{
    public Drink() {
        this.setFoodName("slice");
        this.setFoodType(FoodType.VEG);
        this.setFoodCategory(FoodCategory.DRINKS);
    }
}
