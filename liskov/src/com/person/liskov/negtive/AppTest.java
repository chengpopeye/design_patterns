package com.person.liskov.negtive;

/**
 * @author chengpopeye
 * @create 2020-05-14 13:34
 */

/**
 * 继承的作用
 * 1. 提高代码重用性
 * 2. 多态的前提
 * 两个类能不能发生继承关系的依据是什么？ 主要看有没有“is a”关系
 * a. 主要看有没有“is a” 关系。
 * b. 在两个类有了is a关系之后，还要考虑子类对象在替换了父类对象之后，业务逻辑是否变化！ 如果变化，则不能发生继承关系。
 *
 * 正方形和长方形有“is a”关系，那么我们能不能让正方形类就直接去继承长方形类？现在不能了！！
 * 为什么？因为还要考虑业务场景，需要在特定的业务场景下，正方形是否能替换，正方形替换了长方形以后，业务逻辑是否变化！
 *
 */
class Utils {
    public static void transform(Rectangle r) {
        while (r.getWidth() <= r.getLength()) {
            r.setWidth(r.getWidth() + 1);
            System.out.println(r.getWidth() + ";" + r.getLength());
        }
    }
}

class Rectangle {
    private double length;
    private double width;



    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "length=" + length + ", width=" + width + '}';
    }
}

public class AppTest {
}
