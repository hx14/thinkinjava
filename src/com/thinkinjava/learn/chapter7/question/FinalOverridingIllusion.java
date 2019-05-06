package com.thinkinjava.learn.chapter7.question;

/**
 * Created by hx on 2019/5/6.
 */
class WithFinals {
    // private��ʽָ��final
    private final void f() {
        System.out.println("WithFinals.f()");
    }
    private void g() {
        System.out.println("WithFinals.g()");
    }
}
class OverridingPrivate extends WithFinals {
    private final void f(){
        System.out.println("OverridingPrivate.f()");
    }
    private void g(){
        System.out.println("OverridingPrivate.g()");
    }
}
class OverridingPrivate2 extends OverridingPrivate {
    public final void f(){
        System.out.println("OverridingPrivate2.f()");
    }
    public void g() {
        System.out.println("OverridingPrivate2.g()");
    }
}
public class FinalOverridingIllusion {
    public static void main(String[] args) {
        OverridingPrivate2 op2 = new OverridingPrivate2();
        op2.f();
        op2.g();
        // �ڴ˴��������³�ʼ��OverridingPrivate
        OverridingPrivate op = op2;
        // ���ǲ��ܵ���OverridingPrivate�еķ�������Ϊ��private
        // op.f();
        // op.g();
        // ͬ����
        WithFinals wf = op2;
        // wf.f();
        // wf.g();
    }
}
