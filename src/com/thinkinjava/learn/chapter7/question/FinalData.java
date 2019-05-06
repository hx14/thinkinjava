package com.thinkinjava.learn.chapter7.question;

import java.util.Random;

/**
 * Created by hx on 2019/4/29.
 */
class Value {
    int i;

    public Value(int i) {
        this.i = i;
    }
}

public class FinalData {
    private static Random random = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    private final int valueOne = 9;
    // ����static��final�����ô�д��ʶ��ʹ���»��߷ָ�ÿ������
    private static final int VALUE_TWO = 99;
    // ����Ϊpublic������������֮��
    // ����Ϊstatic��ǿ��ֻ��һ��
    // ����Ϊfinal��˵����һ������
    public static final int VALUE_THREE = 39;
    private final int i4 = random.nextInt(20);
    static final int INT_5 = random.nextInt(20);
    private Value v1 = new Value(11);
    // ������Ϊv2��final�ģ�����Ϊ�޷��ı�����ֵ����������һ�����ã�final��ζ���޷���v2�ٴ�ָ����һ���µĶ��󡣶����������ͬ�����壬��������һ�����á�
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    private final int[] a = {1, 2, 3, 4, 5, 6};

    public String toString() {
        return id + ": " + "i4 = " + i4 + ". INT_5 = " + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
        fd1.v2.i++;
        fd1.v1 = new Value(9);
        for (int i = 0; i < fd1.a.length; i++) {
            fd1.a[i]++;
        }
        System.out.println("fd1");
        System.out.println("Creating new FinalData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);
    }
    // ��FinalData���г�ʼ����ʱ��i4��Ϊprivate���ڷ���ÿ�γ�ʼ����ʱ���Ѿ���ɳ�ʼ�������������ŷ����ĳ�ʼ�����仯��
    // ���Ƕ���INT_5��˵����Ϊstatic final��ֻ���״γ�ʼ����ʱ�����װ�أ�����fd2��ʼ����ʱ��INT_5������仯
}