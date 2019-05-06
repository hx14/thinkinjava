package com.thinkinjava.learn.chapter7.question;

import static net.mindview.util.Print.print;

/**
 * Created by hx on 2019/5/6.
 */
class Insect {
    private int i = 9;

    protected int j;
    // �����Insect()����Ϊ����Insect{}��������࣬����Insect{}�Ѿ���Beetle�̳У�����Insect(){}Ҳ�ᱻ��ʼ��
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
// ����Beetle��ʱ�򣬽���ͼ����Beetle.main()��һ��static������,�ҳ���������ͬʱ�����м��ص�ʱ���ɹؼ���extends��֪��Beetle��һ�����࣬���Ǽ������ء�������õ�һ�������ұ�Ȼ�õ���
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
