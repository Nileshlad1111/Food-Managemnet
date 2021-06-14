package com.food;


import java.util.Scanner;

public class Application {

    FoodStore foodStore = FoodStore.getInstance();
    public void createSystemMenu() {
        while(true){
            System.out.println("1. Add Food Items");
            System.out.println("2. Print  Starters");
            System.out.println("3. Print Main Course");
            System.out.println("4. Print Juices");
            System.out.println("5. Prepare Food");
            System.out.println("6. Deliver Food");
            System.out.println("7. Delete Food Item");
            System.out.println("8. print all items");
            System.out.println("Enter Your Choice:");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    foodStore.addFoodItems();
                    break;
                case 2:
                    System.out.println("Starters are : ");
                    foodStore.printStarterItems();
                    break;
                case 3:
                    System.out.println("Main Courses are :");
                    foodStore.printMainCourseItems();
                    break;
                case 4:
                    System.out.println("Juices are : ");
                    foodStore.printJuicesItems();
                    break;
                case 5:
                    System.out.println("Enter Details for preparing food");
                    foodStore.addFoodItems();
                    break;
                case 6:
                    sc.nextLine();
                    System.out.println("Enter name of food to deliver");
                    break;
                case 7:
                    sc.nextLine();
                    System.out.println("Enter name of food to delete");
                    String name = sc.nextLine();
                    foodStore.deleteFoodItem(name);
                    break;
                case 8:
                    System.out.println("print food items");
                    foodStore.printFoodStore();
                    break;
                default:
                    System.out.println("You entered wrong choice choice");
                    break;
            }
        }
    }

    public static void main(String[] args) {

        //FoodStore foodStore = new FoodStore();

        System.out.println("----------------- Welcome to the FOOD DELIVERY SYSTEM ---------------------");

        Application application = new Application();
        application.createSystemMenu();
    }
}
