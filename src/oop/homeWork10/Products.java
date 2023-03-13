package oop.homeWork10;

import java.time.LocalDateTime;
import java.time.Period;

public abstract class Products {

    private final String productName;
    private final LocalDateTime productionDateTime;
    private final Period shelfLife;

    public Products(String productName, LocalDateTime productionDateTime, Period shelfLife) {

        this.productName = productName;
        this.productionDateTime = productionDateTime;
        this.shelfLife = shelfLife;
    }

    public LocalDateTime getProductionDateTime() {

        return productionDateTime;
    }

    public Period getShelfLife() {

        return shelfLife;
    }

    public String getProductName() {

        return productName;
    }

    public boolean isExpired() {

        LocalDateTime expirationDateTime = productionDateTime.plus(shelfLife);
        return expirationDateTime.isBefore(LocalDateTime.now());
    }

}
