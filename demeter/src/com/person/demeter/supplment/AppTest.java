package com.person.demeter.supplment;

import java.util.Date;
import java.util.List;

/**
 * @author chengpopeye
 * @create 2020-05-14 12:50
 */

class Foo {
    public Bar get() {
        return new Bar();
    }
}

class Bar {

}



public class AppTest {

    private List list;

    public String f1() {
        Date d = new Date();

        String s = new String();


        //  反例
        Foo f = new Foo(); // 是朋友
        Bar bar = f.get();  // 不是朋友



        return s;
    }
}
