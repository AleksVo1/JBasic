package main.java.oop.homeWork10;

import java.time.LocalDateTime;
import java.time.Period;

public class Grocery extends Product {

    public Grocery(String productName, LocalDateTime productionDateTime, Period shelfLife) {

        super(productName, productionDateTime, shelfLife);
    }
}

