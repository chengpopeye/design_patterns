package com.person.interfaceisolation.negtive;

/**
 * @author chengpopeye
 * @create 2020-05-07 12:20
 */
public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("狗啃骨头");
    }

    @Override
    public void swim() {
        System.out.println("狗刨");
    }

    @Override
    public void fly() {
        System.out.println("狗 不会飞");
    }
}
