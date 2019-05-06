package com.thinkinjava.learn.chapter7.question;

/**
 * Created by hx on 2019/5/6.
 */
class SmallBrian{}
// 当某个类定义为final的时候，则说明不允许继承这个类，也可以说明这个类不允许做任何变动，出于安全的考虑，即不希望他有子类(a extends b，b为父类，即不能extends Dinosuar)
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
