package main.java.oop.homeWork6;

/*
1. Описати клас Product
        Поля:
        - Назва товару
        - артикул (код товару)
        - ціна
        - опис товару
        - наявність (є чи немає)
        Методи:
 - геттери
 - сеттери
 */
public class Product {
    private String name;
    private int productCode;
    private int price;
    private String productInfo;
    private boolean availability;

    public Product(String name, int productCode, int price, String productInfo, boolean availability){

        this.name = name;
        this.price = price;
        this.productCode = productCode;
        this.productInfo = productInfo;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public int getProductCode() {
        return productCode;
    }

    public int getPrice() {
        return price;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public void getInfo(){
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Product code: " + productCode);
        System.out.println("Description: " + productInfo);
        System.out.println("Product available: " + availability);
    }



}

