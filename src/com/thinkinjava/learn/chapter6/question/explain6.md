* 构造器的私有
```
class Soup1 {
    private Soup1() { // 见解释
    }

    // 可以创建一个静态方法
    public static Soup1 makeSoup() {// 创建一个新的Soup1对象并且返回一个Soup1的引用
        return new Soup1();
    }

}

class Soup2 {
    private Soup2() {
    }

    // 创建一个静态对象并返回引用
    private static Soup2 ps1 = new Soup2();// 这里一个Soup2的对象通过static private成员创建，有些仅有一个，但是仅限于ps1(见下)
    private static Soup2 ps2 = new Soup2();// 如果这里用同样的方法创建了一个ps2，那么互不影响

    public static Soup2 access() {//这里通过access()返回了ps1,同样的，如果再写一个静态的实现，返回ps2,也是可以的。
        return ps1;
    }

    public void f() {
    }
}

public class Lunch {
    void testPrivate() {
        // 不能进行如下操作，是因为是私有的构造函数
        // Soup1 soup1 = new Soup1();
    }

    void testStatic() {
        Soup1 soup1 = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }
}
```
**解释1**：`private Soup1() {}`将构造器指定为private来阻止直接创建某个类的实例，如果没有明确的至少创建一个构造器的话，会创建一个默认的构造器(不带有任何参数)，如果自己编写了默认的构造器，那么就不会自动创建。如果该构造器指定为private，那么谁也无法创建该类的对象。

**解释2**：`class Soup2() {}`用到了设计模式(？？),此种特定模式被称为singleton(单例)，原因是始终都只能创建他的一个对象。Soup2类的对象是作为Soup2的一个static private成员而创建的。有且仅有一个。除非通过public方法access()，否则无法访问   