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
        // �˴����ܳ�ʼ����g = new Gizmo(),g��final
    }

    void without(Gizmo g) {
        g = new Gizmo();
        g.spin();
    }

    // void f(final int i){i++;}����Ĳ���Ҳ��final������i���ܸı䣬i++������
    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }
}
