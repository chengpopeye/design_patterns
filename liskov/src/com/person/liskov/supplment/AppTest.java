package com.person.liskov.supplment;

/**
 * @author chengpopeye
 * @create 2020-05-14 13:09
 */

/**
 * 方法重写： 在子类和父类中，出现了返回类型相同，方法相同、方法参数相同的方法时，构成方法重写。
 * 方法重写的两个限制：
 *  1. 子类重写父类的方法时，子类方法的访问修饰符不能比父类的更严格
 *  2. 子类重写父类的方法时，子类方法不能抛出比父类更多的异常
 *
 *  为什么要有以上2个限制，就是为了保证，在子类对象替换父类对象后，语法不会报错！
 *
 */
 class Fu {
    public void f1() {

    }
}

class Zi extends Fu {
    @Override
    public void f1() { // throws Exception {
        super.f1();
    }
}
public class AppTest {
}
