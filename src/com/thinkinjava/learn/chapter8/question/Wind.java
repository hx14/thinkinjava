package com.thinkinjava.learn.chapter8.question;

import static net.mindview.util.Print.print;

/**
 * Created by hx on 2019/4/29.
 */
class Instrument {
    public void play(Note n) {
        print("Instrument.play()");
    }
}

public class Wind extends Instrument {// Wind����ת�͵�Instrument��ʱ�򣬿��ܻᡰ��С���ӿڣ��������Instrument��խ��
    public void play(Note n) {
        System.out.println("Wind.play() " + n);
    }
}
