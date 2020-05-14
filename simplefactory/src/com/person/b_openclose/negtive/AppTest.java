package com.person.b_openclose.negtive;

/**
 * @author chengpopeye
 * @create 2020-05-07 11:42
 */
public class AppTest {

    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("奔驰");
        car.setColor("黑色");
        car.setLouyou(true);
        car.setPrice(666666);

        // println 默认会调用toString方法
        System.out.println(car.getPrice());
    }
}

// 变化   现在所有汽车  需要打八折