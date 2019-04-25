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
            // 或者可以使用下面的方法
            // super.finalize(); // 调用积累基类版本
        }
    }
}

public class TerminationCondition {
    public static void main(String[] args) {
        Book novel = new Book(true);
        // 进行适当清理
        novel.checkIn();
        // 删除引用，忘记清理
        new Book(true);
        // 强制垃圾回收
        System.gc();
    }
}