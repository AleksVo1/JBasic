package oop.homeWork10;

import java.time.LocalDateTime;
import java.time.Period;

public class ProductFactory {

    private static int totalProductCount;
    private static int totalFoodCount;
    private static int totalNonFoodCount;

    private ProductFactory() {
    }

    public static Products createFoodProduct (String productName, LocalDateTime productionDateTime, Period shelfLife){

        totalFoodCount++;
        totalProductCount++;

            return new Grocery(productName, productionDateTime, shelfLife);
    }

    public static Products createNonFoodProduct (String productName, LocalDateTime productionDateTime,
                                                 Period shelfLife){

        totalNonFoodCount++;
        totalProductCount++;

            return new NotGrocery(productName, productionDateTime, shelfLife);
    }

    public static int getTotalProductCount() {

        return totalProductCount;
    }

    public static int getTotalFoodCount() {

        return totalFoodCount;
    }

    public static int getTotalNonFoodCount() {

        return totalNonFoodCount;
    }

    public static int getTotalProductCountByType(ProductType type){

        switch (type){
            case FOOD:
                return totalFoodCount;
            case NON_FOOD:
                return totalNonFoodCount;
            default:
                return Integer.parseInt(("Invalid product type: " + type));

        }

    }

}





