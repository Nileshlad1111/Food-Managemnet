package com.food;

import java.util.*;

public class FoodStore {
    HashSet<FoodItem> foodStoreList = new HashSet<>();
    static FoodStore instance;

    private FoodStore() {
    }

    static FoodStore getInstance() {
        if (instance == null) {
            instance = new FoodStore();
        }
        return instance;
    }


    public void deleteFoodItem(String item) {
        foodStoreList.stream()
                .filter(p -> p.getFoodName().equalsIgnoreCase(item))
                /*.findFirst()*/
                .map(p -> {
                    foodStoreList.remove(p);
                    return p;
                });
    }

    public void printStarterItems() {
        foodStoreList.stream().filter(s1 -> s1.getFoodCategories().equals(FoodCategories.STARTER)).forEach(System.out::println);
    }
    public void printMainCourseItems() {
        foodStoreList.stream().filter(s1 -> s1.getFoodCategories().equals(FoodCategories.MAIN_COURSE)).forEach(System.out::println);
    }

    public void printJuicesItems() {
        foodStoreList.stream().filter(s1 -> s1.getFoodCategories().equals(FoodCategories.JUICE)).forEach(System.out::println);

    }

    public void printFoodStore(){
      Collection<Object> list = Collections.singleton(foodStoreList);
      list.stream().forEach(System.out::println);
    }



    public void addFoodItems() {
        Scanner sc = new Scanner(System.in);
        FoodItem foodItem = new FoodItem();
        System.out.println("Enter the Name of Food:");
        String foodName = sc.nextLine();
        foodItem.setFoodName(foodName);

        System.out.println("Enter the Price of Food:");
        float foodPrice = sc.nextFloat();
        foodItem.setPrice(foodPrice);
        sc.nextLine();

        setFoodTypeOpt(sc, foodItem);
        setFoodCategoriesOpt(sc,foodItem);
        setFoodTasteOpt(sc, foodItem);

        foodStoreList.add(foodItem);
    }

    public void setFoodTasteOpt(Scanner sc, FoodItem foodItem) {
        System.out.println("Enter Food Taste");
        System.out.println("Select Food taste from below");
        System.out.println("1. Sweet");
        System.out.println("2. Spicy");
        System.out.println("3. Medium Spicy");
        System.out.println("4. Less Spicy");
        System.out.println("5. Salty");
        System.out.println("Enter your choice:");
        int choice3 = sc.nextInt();
        switch (choice3){
            case 1:
                foodItem.setTaste(Taste.SWEET);
                break;
            case 2:
                foodItem.setTaste(Taste.SPICY);
                break;
            case 3:
                foodItem.setTaste(Taste.MEDIUM_SPICY);
                break;
            case 4:
                foodItem.setTaste(Taste.LESS_SPICY);
                break;
            case 5:
                foodItem.setTaste(Taste.SALTY);
                break;
            default:
                System.out.println("Wrong Choice");
        }
        sc.nextLine();
    }

    public void setFoodCategoriesOpt(Scanner sc, FoodItem foodItem) {
        System.out.println("Enter the Category of Food:");
        System.out.println("Select food Category from below ");
        System.out.println("1. Starter");
        System.out.println("2. Main-Course");
        System.out.println("3. Juice");
        System.out.println("Enter your choice:");
        int choice1 = sc.nextInt();
        switch (choice1){
            case 1:
                foodItem.setFoodCategories(FoodCategories.STARTER);
                break;
            case 2:
                foodItem.setFoodCategories(FoodCategories.MAIN_COURSE);
                break;
            case 3:
                foodItem.setFoodCategories(FoodCategories.JUICE);
                break;
            default:
                System.out.println("Wrong Choice");
        }
        sc.nextLine();
    }

    public void setFoodTypeOpt(Scanner sc, FoodItem foodItem) {
        System.out.println("Enter the Type of Food:");
        System.out.println("Select food type from below ");
        System.out.println("1. Veg");
        System.out.println("2. Non-Veg");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                foodItem.setFoodType(FoodType.VEG);
                break;
            case 2:
                foodItem.setFoodType(FoodType.NON_VEG);
                break;

            default:
                System.out.println("Wrong Choice");
        }
        sc.nextLine();
    }
}
