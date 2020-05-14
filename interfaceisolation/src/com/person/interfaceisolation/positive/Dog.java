package com.person.interfaceisolation.positive;

/**
 * @author chengpopeye
 * @create 2020-05-07 12:25
 */
public class Dog implements EatAble,SwimAble {
    @Override
    public void eat() {
        System.out.println("狗会吃");
    }

    @Override
    public void swim() {
        System.out.println("狗会游泳");
    }
}
