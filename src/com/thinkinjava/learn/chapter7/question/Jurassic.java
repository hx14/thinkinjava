package com.thinkinjava.learn.chapter7.question;

/**
 * Created by hx on 2019/5/6.
 */
class SmallBrian{}
// ��ĳ���ඨ��Ϊfinal��ʱ����˵��������̳�����࣬Ҳ����˵������಻�������κα䶯�����ڰ�ȫ�Ŀ��ǣ�����ϣ����������(a extends b��bΪ���࣬������extends Dinosuar)
final class Dinosaur{
    int i = 7;
    int j = 1;
    SmallBrian x = new SmallBrian();
    void f(){}
}
public class Jurassic {
    public static void main(String[] args) {
        Dinosaur n = new Dinosaur();
        n.f();
        n.i = 40;
        n.j++;
    }
}
