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
        cup2 = new Cup(2);// �������������cup1����cup2,�����ʼ������Cup������ִ�н�����������Cup����Cup(1),Cup(2)
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
