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
       // biteNoExtends(); // ���Cookie��ChocolateChip����ͬһ��package����Ļ���biteNoExtends()������Cookie�е�private����(����û��private�ؼ���)����ʱ����ֱ�ӵ���
        biteHasExtends();  //��Cookie��biteHasExtends()ʹ���˹ؼ���protected,˵�����Ա��̳У���ʱ���Ա�����
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}
