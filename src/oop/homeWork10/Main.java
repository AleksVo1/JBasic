package oop.homeWork10;

import java.time.LocalDateTime;
import java.time.Period;

import static oop.homeWork10.ProductFactory.createNonFoodProduct;

public class Main {

    public static void main(String[] args){

        Products orange = ProductFactory.createFoodProduct("orange", LocalDateTime.now(),
                                                            Period.ofDays(6));
        Products potatoes = ProductFactory.createFoodProduct("potatoes", LocalDateTime.now(),
                                                            Period.ofDays(9));
        Products apple = ProductFactory.createFoodProduct("apple", LocalDateTime.now(), Period.ofDays(7));

        Products pen = createNonFoodProduct("pen", LocalDateTime.now(), Period.ofYears(5));
        Products pencil = createNonFoodProduct("pencil", LocalDateTime.now(), Period.ofYears(9));
        Products cup = createNonFoodProduct("cup", LocalDateTime.now(), Period.ofYears(5));


        System.out.println("Загалом створено товарів: " + ProductFactory.getTotalProductCount());
        System.out.println("Фабрика виготовила: " + ProductFactory.getTotalFoodCount() + " продуктових товарів.");
        System.out.println("Фабрика виготовила: " + ProductFactory.getTotalNonFoodCount() + " непродуктових товарів.");
        System.out.println("Загалом створено: " + ProductFactory.getTotalProductCountByType(ProductType.FOOD) +
                            " продуктових товарів");
        System.out.println("Загалом створено: " + ProductFactory.getTotalProductCountByType(ProductType.NON_FOOD) +
                            " непродуктових товарів.");

    }
}
