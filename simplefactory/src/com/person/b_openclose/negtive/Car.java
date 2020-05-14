package com.person.b_openclose.negtive;

/**
 * @author chengpopeye
 * @create 2020-05-07 11:40
 */
public class Car {
    private String brand;
    private String color;
    private boolean louyou;
    private double price;


    public Car() {
    }

    public Car(String brand, String color, boolean louyou, double price) {
        this.brand = brand;
        this.color = color;
        this.louyou = louyou;
        this.price = price;
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * 获取
     * @return louyou
     */
    public boolean isLouyou() {
        return louyou;
    }

    /**
     * 设置
     * @param louyou
     */
    public void setLouyou(boolean louyou) {
        this.louyou = louyou;
    }

    /**
     * 获取
     * @return price
     */
    public double getPrice() {
        // 这是反例，违反了开闭原则 ，需改了源代码
        return price * 0.8 ;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Car{brand = " + brand + ", color = " + color + ", louyou = " + louyou + ", price = " + price  + "}";
    }
}
