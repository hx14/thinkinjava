* this�ؼ���
```
public class Chapter5Main {
    int i = 0;

    Chapter5Main increment() {
        i++;
        return this; // this�����˶Ե�ǰ��������á��û���ε���increment()����
    }

    void print() {
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        Chapter5Main x = new Chapter5Main();
        x.increment().increment().increment().print();
        // ����ִ��һ��x.increment()��i���+1��ִ��������i+=3��ִ��֮��output��i = 3
    }
}
```
* 
```
public class Flower {
    int petalCount = 0;
    String s = "initial calue";
    // �����ǵ�һ��Flower����������Flower(String s ,int petals)����
    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor w/ int arg only, petalCount= " + petalCount);
    }
    // �ڶ���Folwerû�б�����
    Flower(String ss) {
        System.out.println("Constructor w/ int arg only, s= " + ss);
        s = ss;
    }
    // ������Fowler��Flower()����
    Flower(String s ,int petals) {
        this(petals); // ������õ�һ��Fowler(),����Ӧ�÷��ڵ�ǰ����������ԭʼλ��,��Ȼ
        // ���ܳ�������this�ؼ���
        // this(s);
        // ����������һ��this
        this.s = s;
        System.out.println("String & int args");
    }
    // ���õ�һ��Folwer��������
    Flower() {
        this("hi", 47);
        System.out.println("default constructor (no args)");
    }
    void printPetalCount() {
        // �����this��Ϊû�й����������Ի���ֱ������
        // this(11);
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower(); // ����Flower����˳��ִ��
        // ִ��֮��petalCount = 47��s = hi
        x.printPetalCount();
    }
}
```
**ִ�н��**��
```
Constructor w/ int arg only, petalCount= 47
String & int args
default constructor (no args)
petalCount = 47 s = hi
 ```
 * ��������
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
            // ���߿���ʹ������ķ���
            // super.finalize(); // ���û���汾
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
```
**����**���ڵ���Book��ʱ��ԭ�����������鼮����check in֮����ܹ����������գ�������main()�У����ڳ��ִ��󣬱�ǿ��ִ�����������գ���ʱ���û�е���finalize()����������ѷ�������ȱ�ݡ����Ǿ��㲻ִ��System.gc()������Ҳ����������Ĵ���ռ�������������ն�����ִ�С������ҵ��������super.finalize()��Ҫ�����쳣�����ⲿ���Ȳ�ʹ�á�
* ��ʼ��˳��
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
**���н��**�� 
```
Window(1)
Window(2)
Window(3)
House()
Window(33)
f()
```
**����**��������ڲ�������������Ⱥ�˳������˳�ʼ����˳�򣬼�ʹ��������ɢ���ڷ�������֮�䣬�����Ծɻ����κη���(����������)������֮ǰ�õ���ʼ������House�У�Window�ֱ𱻶��������Σ������ڵ���֮ǰ����Ҫ��ʼ������Window��֮���ٹ������ڲ���Window���еĳ�ʼ��w3�ٴα���ʼ�������Դ�ʱw3����ʼ�������Σ��ڵ��ù������ڼ�(��һ�γ�ʼ�������õĶ��󱻶�����������Ϊ��������)