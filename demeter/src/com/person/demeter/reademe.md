1. 迪米特法则，也叫做最少知道原则（封装）
2. 一个类，对于其他类，要知道的越深越好


什么是朋友
a. 类中的字段
b. 方法的参数
c. 方法的返回值
d. 方法中实例化出来的对象

3. 只和朋友通信


百度：
如果两个类不必彼此直接通信，那么这两个类就不应当发生直接的相互作用。如果其中的一个类需要调用另一个类的某一个方法的话，可以通过第三者转发这个调用。
朋友圈的确定
“朋友”条件：
1）当前对象本身（this）
2）以参量形式传入到当前对象方法中的对象   方法中的参数
3）当前对象的实例变量直接引用的对象      public class AppTest { private String s; }
4）当前对象的实例变量如果是一个聚集，那么聚集中的元素也都是朋友  public class AppTest { private List<String> s;}  String
5）当前对象所创建的对象   new 对象
任何一个对象，如果满足上面的条件之一，就是当前对象的“朋友”；否则就是“陌生人”。
狭义的迪米特法则的缺点：
在系统里造出大量的小方法，是 这些方法仅仅传递间接的调用，与系统的业务逻辑无关。
遵循类之间的迪米特法则会是一个系统的局部设计简化，因为每一个局部都不会和远距离的对象有直接的关联。但是，这也会造成系统的不同模块之间的通信效率降低，也会使系统的不同模块之间不容易协调。
门面模式和调停者模式（中介者模式）实际上就是迪米特法则的应用。
广义的迪米特法则在类的设计上的体现：
优先考虑将一个类设置成不变类。
尽量降低一个类的访问权限。
谨慎使用Serializable。
尽量降低成员的访问权限。