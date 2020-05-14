package com.person.demeter.positive;

/**
 * @author chengpopeye
 * @create 2020-05-14 12:21
 */
class Computer {
    // public修改为private 对外隐藏
    private void saveDate() {
        System.out.println("保存数据");
    }

    private void killProcess() {
        System.out.println("关闭程序");
    }

    private void closeScreen() {
        System.out.println("关闭屏幕");
    }

    private void poweroff() {
        System.out.println("断电");
    }

  public  void shutDown() {
        saveDate();
        killProcess();
        closeScreen();
        poweroff();
    }

}

class Person {
    // 关联关系  一类的对象作为另一个类的字段  人关联了电脑
    private Computer c = new Computer();

    // 此时，这个Person对于Computer的细节就知道的太多了
    // 对于Preson而言，只需要知道，关机按钮在那就行，不需要知道如何保存数据，如何关闭进程，如果断电等等这些细节。。。。。。
   // 这样的话，代码的复杂度提升了   万一用户使用不当，就有可能造成更大的损失。
   public void shutdownCompupter() {
       c.shutDown();
   }



}

public class AppTest {
}
