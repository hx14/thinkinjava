* ��ʼ������
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
**output**��
```
Art constructor
Drawing constructor
Cartoon constructor
```
**����**��Java���Զ��ڵ�����Ĺ������й�����Ի��๹�����ĵ��ù��ܹ����Ǵӻ���"����"��ɢ����Art <--(extends)-- Drawing <--(extends)-- Cartoon,���Ի����ڵ����๹�������Է�����֮ǰ�����Ѿ�����˳�ʼ����
* ����ͼ̳н��ʹ��
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
        super(i);// ����Knife�̳�Utensil,�����ø���Ĺ�����
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
        // sp,frk,kn,pl,ÿһ�ε��ö������һ�μ̳еĸ��ࣺUtensil,����ÿһ�δ�ӡ����ķ����������ӡһ��Utensil�е�"Utensil constructor"
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
**����**��super()�����ʾ���ø���Ĺ�����������ע��

**output**��
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
**����ת��**
```
class Instrument {
    public void play(){}
    static void tune(Instrument i) {
        i.play();
    }
}
// �̳п��Ա�֤����Instrument�е����з����ܹ��ڵ�����Wind��ͬ����Ч
// ͬ�����ܹ�����෢�͵�������ϢҲ�����򵼳��෢��
public class Wind extends Instrument{
    public static void main(String[] args) {
        Wind flute = new Wind();
        // ��Instrument��tune()���ݵ��ǳ�ʼ����Instrument�����ﴫ�ݵ���Wind������flute
        // ���Կ���Wind����Ҳ��һ��Instrument�����ǲ������κ�tune()��������ͨ��Instrument���ã�ͬʱ�ֲ�������Wind֮��
        // ��tune()�У����������Զ�Instrument�������еĵ�����������
        // ���ֽ�Wind����ת��ΪInstrument���õĶ�������֮Ϊ"����ת��"
        Instrument.tune(flute);
    }
}
```
**����**��������ת��Ϊ���࣬�̳�ͼ���������ƶ��ģ����Գ�֮Ϊ����ת�͡���һ���ӽ�ר���������ͨ�����͵�ת�������԰�ȫ���������ǻ����һ�����������ܺ��бȻ������ķ��������Ǳ������پ߱������������еķ���
