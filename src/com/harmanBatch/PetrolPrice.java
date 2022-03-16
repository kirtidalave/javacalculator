package com.harmanBatch;

import java.sql.SQLOutput;

abstract class PetrolPrice{

    abstract void changePrice(); //Hide it from enduser
}

class Govt extends PetrolPrice {
    void changePrice() {
        System.out.println("Increased by 2%");
    }

    public static void main(String[] args) {

        PetrolPrice price = new Govt();
        price.changePrice();


    }
}