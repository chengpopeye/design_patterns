package com.person.dependencyreverse.test;

/**
 * @author chengpopeye
 * @create 2020-05-07 20:09
 */

class A{


}

class B {

    // 字段  属性
    // A a = new A(); B关联A 关联 空心菱形 作为另外一个类的字段
    // 关联  = 组合 / 聚合

    /*void fan() {      方法里面的参数  fan(A a)
        A a = new A();  方法里面的局部变量  依赖
      依赖  一个类的对象作为另一个类的局部变量   依赖 以方法的结构存在 所以是一个动作
      被依赖是被指向的  虚线加箭头
    }*/
}

public class AppTest {
    public static void main(String[] args) {

    }
}
