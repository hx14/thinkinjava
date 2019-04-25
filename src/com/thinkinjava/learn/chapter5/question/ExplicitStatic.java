package com.thinkinjava.learn.chapter5.question;

/**
 * Created by hx on 2019/4/25.
 */
class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }

    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;

    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);// 不论在这里调用cup1还是cup2,都会初始化两次Cup，所以执行结果会出现两次Cup，即Cup(1),Cup(2)
    }

    Cups() {
        System.out.println("Cups()");
    }
}

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99);
    }
}
