package com.thinkinjava.learn.chapter8.question;

/**
 * Created by hx on 2019/5/6.
 */
public class Music {
    public static void tune(Instrument i) {// ������Instrument�����ã�ͬʱҲ�����κε�����instrument���ࡣ
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);// ���ﲻ��Ҫ�κ����͵�ת����
    }
}
