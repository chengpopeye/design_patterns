package com.person;

/**
 * @author chengpopeye
 * @create 2020-05-10 19:27
 */
// 下列程序输出什么？？
    // 4 1  2 3 12 100
public class TestClassInit {
    public static void main(String[] args) {
        TestClassInit.f1();
    }

    // 第一个被执行 静态代码块  本质 调用构造器
    static TestClassInit t = new TestClassInit();
    static {  // 静态代码块
        System.out.println("1");
    }
    {    // 类里面   构造代码快
        // 构造代码块 优先于 构造器执行
        System.out.println("2");
    }
    TestClassInit () {  // 构造器
        System.out.println("3");
        System.out.println("a=" + a + "；b=" + b);
    }
    private static void f1() {
        System.out.println("4");
    }
    int a = 100;  // 构造代码块
    static int b = 12;  // 静态代码块  类一加载空间生成了，代码没有执行 没有被赋值
}

/*
* 1. 类加载
* 2. 代码块执行顺序
*解决方案   1. 找构造器  2.往上推导
*1. 执行静态块
*2. 执行构造代码块
*3. 执行构造器
*
* TestClassInit.f1(); 类加载
* 实例的实例化顺序
* 3个静态代码块
*  1. static TestClassInit t = new TestClassInit();
*  2. static {  // 静态代码块
        System.out.println("1");
    }
   3. static int b = 12;
   *
   * 先执行
   * static TestClassInit t = new TestClassInit();
   *
   * new TestClassInit(); 调用构造器
   *
   *
*
*
* */