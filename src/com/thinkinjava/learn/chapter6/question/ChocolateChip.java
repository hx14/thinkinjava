package com.thinkinjava.learn.chapter6.question;

import com.thinkinjava.learn.chapter6.question2.Cookie;

/**
 * Created by hx on 2019/4/26.
 */
public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("ChocolateChip constructor");
    }
    public void chomp() {
       // biteNoExtends(); // 如果Cookie和ChocolateChip不在同一个package下面的话，biteNoExtends()仅仅是Cookie中的private方法(尽管没有private关键字)，此时不能直接调用
        biteHasExtends();  //在Cookie中biteHasExtends()使用了关键字protected,说明可以被继承，此时可以被调用
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}
