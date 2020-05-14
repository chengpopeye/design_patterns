package com.person.dependencyreverse.negtive;

/**
 * @author chengpopeye
 * @create 2020-05-07 12:39
 */

// 变化来了，客户端不仅仅需要喂狗，还需要喂猫！
    // 客户端 自己定义一个猫类


class Cat{
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

public class AppTest {
    public static void main(String[] args) {
        Person person = new Person();
        Dog d = new Dog();

        Cat c = new Cat();

        person.feed(d);
      //  person.feed(c);
    }
}


class Person{
    public void feed(Dog dog) {
        System.out.println("喂养狗");
        dog.eat();
    }
}

class Dog{
    public void eat() {
        System.out.println("狗啃骨头");
    }
}

// 此时，这种代码违反了依赖倒置，因为，每当下层变动时，上层都要跟着一起变动。

// 我们希望的是，当下层新增一个动物时，上层应该”不知道“，上层代码应该不用改动！