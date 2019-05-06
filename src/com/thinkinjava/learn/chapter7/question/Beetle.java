package com.thinkinjava.learn.chapter7.question;

import static net.mindview.util.Print.print;

/**
 * Created by hx on 2019/5/6.
 */
class Insect {
    private int i = 9;

    protected int j;
    // 这里的Insect()被称为对象Insect{}的自身基类，对象Insect{}已经被Beetle继承，所以Insect(){}也会被初始化
    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 = printInit("Static Insect.x1 initialized");

    static int printInit(String s) {
        print(s);
        return 47;
    }

}
// 运行Beetle的时候，将试图访问Beetle.main()（一个static方法）,找出编译代码的同时，进行加载的时候由关键字extends可知，Beetle有一个基类，于是继续加载。这样会得到一个对象，且必然得到。
public class Beetle extends Insect {
    private int k = printInit("Beetle.k initinalized");

    public Beetle() {
        print("k = " + k);
        print("j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        print("Beetle constructor");
        Beetle b = new Beetle();
    }
}
