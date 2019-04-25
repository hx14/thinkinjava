package com.thinkinjava.learn.chapter5.question;

/**
 * Created by hx on 2019/4/23.
 */
class Book {
    boolean checkedOut = false;

    Book(boolean checkOut) {
        checkedOut = checkOut;
    }

    void checkIn() {
        checkedOut = false;
    }

    protected void finalize() {
        if (checkedOut) {
            System.out.println("Error: checked out");
            // ���߿���ʹ������ķ���
            // super.finalize(); // ���û��ۻ���汾
        }
    }
}

public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // �����ʵ�����
        novel.checkIn();
        // ɾ�����ã���������
        new Book(true);
        // ǿ����������
        System.gc();
    }
}