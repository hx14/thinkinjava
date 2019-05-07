package com.thinkinjava.learn.chapter8.question;

/**
 * Created by hx on 2019/5/6.
 */
public class Music {
    public static void tune(Instrument i) {// 接受了Instrument的引用，同时也接受任何导出自instrument的类。
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        tune(flute);// 这里不需要任何类型的转换。
    }
}
