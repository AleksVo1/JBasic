package main.java.oop.homeWork10;

import java.time.LocalDateTime;
import java.time.Period;

public class NotGrocery extends Product {

    public NotGrocery(String productName, LocalDateTime productionDateTime, Period shelfLife) {

        super(productName, productionDateTime, shelfLife);
    }

}
