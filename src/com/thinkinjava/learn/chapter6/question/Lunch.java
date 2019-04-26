package com.thinkinjava.learn.chapter6.question;

/**
 * Created by hx on 2019/4/26.
 */
class Soup1 {
    private Soup1() { // 将构造器指定为private来阻止直接创建某个类的实例，如果没有明确的至少创建一个构造器的话，会创建一个默认的构造器(不带有任何参数)
    }

    // 可以创建一个静态方法
    public static Soup1 makeSoup() {
        return new Soup1();
    }

}

class Soup2 {
    private Soup2() {
    }

    // 创建一个静态对象并返回引用
    private static Soup2 ps1 = new Soup2();

    public static Soup2 access() {
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
