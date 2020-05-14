package com.person;

/**
 * @author chengpopeye
 * @create 2020-05-11 09:47
 */

/**
 * 静态的本质  类一加载就有空间
 * 非静态的本质： 实例化才有空间
 *有空间的调用有空间的
 *
 * 让类加载
 * 有四种可能：
 * 1. 调用构造器
 * 2. classFormname
 * 3. 调用静态字段
 * 4. 调用静态方法
 * 构造代码块，总是随着构造器的执行而执行
 *
 *
 * 类的实例化顺序  先加载类  后执行
 * 1. 执行静态块
 * 2. 执行构造代码块
 * 3. 执行构造器
 * 注意：类中的实例成员，等价于构造代码块.也就是说，构造代码块该执行的时候，也就会执行实例成员的代码
 *       类中的静态成员，等价于静态块。也就是说，静态块该执行的时候，也就是执行静态成员的代码
 */
class Foo {

  //  int a = 5; // 实例成员变量
    int a = f1();  // 构造代码块

    private int f1() {
        System.out.println("f1");
        return 5;
    }


    // static int b = 10;
    static int b = f2();
   // int b = f2();  // 属于构造代码块

    private static int f2() {
        System.out.println("f2");
        return 10;
    }

    static {  // 静态代码块 一个类只执行一次
        System.out.println("0");
    }

    {   // 构造 代码块
        System.out.println("1");
    }
    public Foo() {
        System.out.println("2");
    }
}


public class Test01 {

    public static void main(String[] args) {
        Foo f = new Foo();
      //  Foo f = null;

        // new  Foo();
        // new  Foo();
    }

}
