package com.person.interfaceisolation.negtive;

/**
 * @author chengpopeye
 * @create 2020-05-07 12:23
 */
public class Bird implements  Animal {
    @Override
    public void eat() {
        System.out.println("鸟吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("鸟不会");
    }

    @Override
    public void fly() {
        System.out.println("鸟翱翔天空");
    }
}
