package com.food;


public class Application {

    public static void main(String[] args) {

        FoodStore foodStore = new FoodStore();

        System.out.println("----------------- Welcome to the FOOD DELIVERY SYSTEM ---------------------");

        PaneerTikka paneerTikka = new PaneerTikka();
        paneerTikka.setPrice(180);
        paneerTikka.setTaste(Taste.SPICY);

        CobbieManchurian cobbieManchurian = new CobbieManchurian();
        cobbieManchurian.setPrice(10);
        cobbieManchurian.setTaste(Taste.SALTY);

        TandooriChicken tandooriChicken = new TandooriChicken();
        tandooriChicken.setPrice(280);
        tandooriChicken.setTaste(Taste.SPICY);

        DalFry dalFry = new DalFry();
        dalFry.setPrice(90);
        dalFry.setTaste(Taste.SWEET);

        MasalaPapad masalaPapad = new MasalaPapad();
        masalaPapad.setPrice(20);
        masalaPapad.setTaste(Taste.SALTY);

        Drink drink = new Drink();
        drink.setPrice(20);
        drink.setTaste(Taste.SWEET);

        // adding the foods items
        foodStore.prepare(paneerTikka);
        foodStore.prepare(cobbieManchurian);
        foodStore.prepare(tandooriChicken);
        foodStore.prepare(dalFry);
        foodStore.prepare(masalaPapad);
        foodStore.prepare(drink);

        //print the menu
        foodStore.createSystemMenu();

    }
}
