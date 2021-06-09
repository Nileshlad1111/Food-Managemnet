package com.food;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodStore {
    public ArrayList<FoodItem> foodStore = new ArrayList<>();

    public void prepare(FoodItem foodItem) {
        foodStore.add(foodItem);
    }

    public void deliverFood(FoodItem foodItem) {
        foodStore.remove(foodItem);
    }


    public void printFood() {
        for (FoodItem foodItem : foodStore) {
            System.out.println(foodItem);
        }
    }

    public void printStarterItems() {
        for (FoodItem fooditem : foodStore) {
            if (fooditem.getFoodCategory() == (FoodCategory.STARTER)) {
                System.out.println(fooditem);
            }
        }
    }

    public void printMainCourseItems() {
        for (FoodItem fooditem : foodStore) {
            if (fooditem.getFoodCategory() == (FoodCategory.MAIN_COURSE)) {
                System.out.println(fooditem);
            }
        }
    }

    public void printDrinK() {
        for (FoodItem foodItem : foodStore) {
            if (foodItem.getFoodCategory() == (FoodCategory.DRINKS)) {
                System.out.println(foodItem);
            }
        }

    }

    public void printPrepareFood() {
        printMainCourseItems();
    }

    public void printDeliverFood() {
        System.out.println("1. Deliver Starters \n " +
                "2. Deliver Main Course \n " +
                "3. Deliver Drinks \n " +
                "4. Deliver Food \n " );
        System.out.println("Enter your Choice");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                printStarterItems();
                break;
            case 2:
                printMainCourseItems();
                break;
            case 3:
                printDrinK();
                break;
            default:
        }
    }

    public void createSystemMenu() {
        System.out.println("1. Print Starters \n " +
                "2. Print Main Course \n " +
                "3. Print Drinks \n " +
                "4. Prepare Food \n " +
                "5. Deliver Food");
        System.out.println("Enter your Choice");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                printStarterItems();
                break;
            case 2:
                printMainCourseItems();
                break;
            case 3:
                printDrinK();
            case 4:
                printPrepareFood();
                break;
            case 5:
                printDeliverFood();
            default:
        }
    }


}
