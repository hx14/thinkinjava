package com.thinkinjava.learn.chapter7.question;

/**
 * Created by hx on 2019/5/6.
 */
class Gizmo {
    public void spin() {
    }
}

public class FinalArguments {
    void with(final Gizmo g) {
        // 此处不能初始化：g = new Gizmo(),g是final
    }

    void without(Gizmo g) {
        g = new Gizmo();
        g.spin();
    }

    // void f(final int i){i++;}这里的参数也是final，所以i不能改变，i++不允许
    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}
