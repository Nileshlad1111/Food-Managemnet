package com.food;

enum Taste {
    SWEET, SPICY, SALTY;
}

enum FoodType {
    VEG, NON_VEG;
}

enum FoodCategory {
    STARTER, MAIN_COURSE, DRINKS, DESSERT
}


public class FoodItem {

    private String foodName;
    private FoodType foodType;
    private float price;
    private Taste taste;
    private FoodCategory foodCategory;

    public String getFoodName() {
        return foodName;
    }

    protected void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    protected void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }

    public FoodCategory getFoodCategory() {
        return foodCategory;
    }

    public void setFoodCategory(FoodCategory foodCategory) {
        this.foodCategory = foodCategory;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "foodName='" + foodName + '\'' +
                ", foodType=" + foodType +
                ", price=" + price +
                ", taste=" + taste +
                ", foodCategory=" + foodCategory +
                '}';
    }
}
