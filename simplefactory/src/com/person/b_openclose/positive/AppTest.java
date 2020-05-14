package com.person.b_openclose.positive;

/**
 * @author chengpopeye
 * @create 2020-05-07 11:42
 */
public class AppTest {

    public static void main(String[] args) {
        Car car = new DisconutCar();
        car.setBrand("奔驰");
        car.setColor("黑色");
        car.setLouyou(true);
        car.setPrice(666666);

        // println 默认会调用toString方法
        System.out.println(car.getPrice());
    }
}

// 变化   现在所有汽车  需要打八折
// 符合开闭原则的做法是 始终保证Car的源代码不会被修改，我们
// 创建一个Car的子类重写Car的getPrice方法