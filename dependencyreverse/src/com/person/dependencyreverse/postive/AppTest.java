package com.person.dependencyreverse.postive;


/**
 * @author chengpopeye
 * @create 2020-05-07 12:39
 */

interface Animal {
    void eat();
}


class Person{
    public void feed (Animal a) {//(Dog dog) {
        System.out.println("喂养狗");
        a.eat();
    }

    /*public void feed(Cat cat) {
        System.out.println("开始喂养。。。");
        cat.eat();
    }*/

}

class Dog implements Animal{
    public void eat() {
        System.out.println("狗啃骨头");
    }
}

class Cat implements Animal{
    public void eat() {
        System.out.println("猫吃鱼");
    }
}


// 变化来了，客户端不仅仅需要喂狗，还需要喂猫！
// 客户端 自己定义一个猫类

public class AppTest {
    public static void main(String[] args) {
    Person person = new Person();
        Dog d = new Dog();

        Cat c = new Cat();

        person.feed(d);
        person.feed(c);
    }
}




// 此时，这种代码违反了依赖倒置，因为，每当下层变动时，上层都要跟着一起变动。

// 我们希望的是，当下层新增一个动物时，上层应该”不知道“，上层代码应该不用改动！