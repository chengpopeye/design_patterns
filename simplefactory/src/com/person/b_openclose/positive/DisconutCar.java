package com.person.b_openclose.positive;

/**
 * @author chengpopeye
 * @create 2020-05-07 11:55
 */
public class DisconutCar extends Car {
    @Override
    public double getPrice() {
        return super.getPrice() * 0.8;
    }
}
