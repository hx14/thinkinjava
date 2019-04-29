* 初始化基类
```
class Art {
    Art() {
        System.out.println("Art constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println("Drawing constructor");
    }
}

public class Cartoon extends Drawing {
    public Cartoon() {
        System.out.println("Cartoon constructor");

    }

    public static void main(String[] args) {
        Cartoon x = new Cartoon();
    }
}
```
**output**：
```
Art constructor
Drawing constructor
Cartoon constructor
```
**解释**：Java会自动在导出类的构造器中国插入对基类构造器的调用构架过程是从基类"向外"扩散，即Art <--(extends)-- Drawing <--(extends)-- Cartoon,所以基类在导出类构造器可以访问他之前，就已经完成了初始化。
* 代理和继承结合使用
```
class Plate {
    Plate(int i) {
        System.out.println("Plate constructor");
    }
}

class DinnerPlate extends Plate {
    DinnerPlate(int i) {
        super(i);
        System.out.println("DinnerPlate constructor");
    }
}

class Utensil {
    Utensil(int i) {
        System.out.println("Utensil constructor");
    }
}

class Spoon extends Utensil {
    Spoon(int i) {
        super(i);
        System.out.println("Spoon constructor");
    }
}

class Fork extends Utensil {
    Fork(int i) {
        super(i);
        System.out.println("Fork constructor");
    }
}

class Knife extends Utensil {
    Knife(int i) {
        super(i);// 这里Knife继承Utensil,即调用父类的构造器
        System.out.println("Knife constructor");
    }
}

class Custom {
    Custom(int i) {
        System.out.println("Custom constructor");
    }
}

public class PlaceSetting extends Custom {
    private Spoon sp;
    private Fork frk;
    private Knife kn;
    private DinnerPlate pl;

    public PlaceSetting(int i) {
        super(i + 1);
        // sp,frk,kn,pl,每一次调用都会调用一次继承的父类：Utensil,所以每一次打印下面的方法，都会打印一次Utensil中的"Utensil constructor"
        sp = new Spoon(i + 2);
        frk = new Fork(i + 3);
        kn = new Knife(i + 4);
        pl = new DinnerPlate(i + 5);
        System.out.println("PlaceSetting constructor");
    }

    public static void main(String[] args) {
        PlaceSetting x = new PlaceSetting(9);
    }
}
```
**解释**：super()这里表示调用父类的构造器，如上注释

**output**：
Custom constructor
```
Utensil constructor
Spoon constructor
Utensil constructor
Fork constructor
Utensil constructor
Knife constructor
Plate constructor
DinnerPlate constructor
PlaceSetting constructor
```
**向上转型**
```
class Instrument {
    public void play(){}
    static void tune(Instrument i) {
        i.play();
    }
}
// 继承可以保证基类Instrument中的所有方法能够在导出类Wind中同样有效
// 同样的能够像基类发送的所有信息也可以向导出类发送
public class Wind extends Instrument{
    public static void main(String[] args) {
        Wind flute = new Wind();
        // 在Instrument中tune()传递的是初始化的Instrument，这里传递的是Wind的引用flute
        // 可以看做Wind对象也是一种Instrument，但是不存在任何tune()方法可以通过Instrument调用，同时又不存在于Wind之中
        // 在tune()中，程序代码可以对Instrument和它所有的导出类起作用
        // 这种将Wind引用转化为Instrument引用的动作，称之为"向上转型"
        Instrument.tune(flute);
    }
}
```
**解释**：导出类转型为基类，继承图上是向上移动的，所以称之为向上转型。是一个从较专用类型向较通用类型的转换。所以安全。导出类是基类的一个超集，可能含有比基类更多的方法。但是必须至少具备基类中所含有的方法
