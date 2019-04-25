* this关键字
```
public class Chapter5Main {
    int i = 0;

    Chapter5Main increment() {
        i++;
        return this; // this返回了对当前对象的引用。用户多次调用increment()方法
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Chapter5Main x = new Chapter5Main();
        x.increment().increment().increment().print();
        // 这里执行一次x.increment()，i则会+1，执行三次则i+=3，执行之后，output：i = 3
    }
}
```
* 
```
public class Flower {
    int petalCount = 0;
    String s = "initial calue";
    // 这里是第一个Flower构造器，被Flower(String s ,int petals)调用
    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount= " + petalCount);
    }
    // 第二个Folwer没有被调用
    Flower(String ss) {
        System.out.println("Constructor w/ int arg only, s= " + ss);
        s = ss;
    }
    // 第三个Fowler被Flower()调用
    Flower(String s ,int petals) {
        this(petals); // 这里调用第一个Fowler(),并且应该放在当前构造器的最原始位置,不然
        // 不能出现两个this关键字
        // this(s);
        // 可用于另外一种this
        this.s = s;
        System.out.println("String & int args");
    }
    // 调用第一个Folwer构造器，
    Flower() {
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }
    void printPetalCount() {
        // 这里的this因为没有构造器，所以会出现编译错误
        // this(11);
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower(); // 调用Flower对象，顺序执行
        // 执行之后，petalCount = 47；s = hi
        x.printPetalCount();
    }
}
```
**执行结果**：
```
Constructor w/ int arg only, petalCount= 47
String & int args
default constructor (no args)
petalCount = 47 s = hi
 ```
 * 垃圾回收
 ```
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
            // super.finalize(); // 调用基类版本
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
```
**解释**：在调用Book的时候，原则上是左右书籍都被check in之后才能够被垃圾回收，但是在main()中，由于出现错误，被强制执行了垃圾回收，此时如果没有调用finalize()函数，则很难发现这种缺陷。但是就算不执行System.gc()，程序也将分配大量的储存空间而导致垃圾回收动作的执行。最终找到错误对象。super.finalize()需要进行异常处理，这部分先不使用。
* 初始化顺序
```
 public class OrderOfInitialization {
     public static void main(String[] args) {
         House h = new House();
         h.f();
     }
 }
 
 class House {
     Window w1 = new Window(1);
 
 
     House() {
         System.out.println("House()");
         w3 = new Window(33);
     }
 
     Window w2 = new Window(2);
 
     void f() {
         System.out.println("f()");
     }
 
     Window w3 = new Window(3);
 }
 
 class Window {
     Window(int marker) {
         System.out.println("Window(" + marker + ")");
     }
 }
```
**运行结果**： 
```
Window(1)
Window(2)
Window(3)
House()
Window(33)
f()
```
**解释**：在类的内部，变量定义的先后顺序决定了初始化的顺序，即使变量定义散布于方法定义之间，他们仍旧会在任何方法(包括构造器)被调用之前得到初始化。在House中，Window分别被定义了三次，所以在调用之前，需要初始化三次Window，之后再构造器内部，Window其中的初始化w3再次被初始化。所以此时w3被初始化了两次，在调用构造器期间(第一次初始化而引用的对象被丢弃，并且作为垃圾回收)