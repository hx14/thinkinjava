* ��������˽��
```
class Soup1 {
    private Soup1() { // ������
    }

    // ���Դ���һ����̬����
    public static Soup1 makeSoup() {// ����һ���µ�Soup1�����ҷ���һ��Soup1������
        return new Soup1();
    }

}

class Soup2 {
    private Soup2() {
    }

    // ����һ����̬���󲢷�������
    private static Soup2 ps1 = new Soup2();// ����һ��Soup2�Ķ���ͨ��static private��Ա��������Щ����һ�������ǽ�����ps1(����)
    private static Soup2 ps2 = new Soup2();// ���������ͬ���ķ���������һ��ps2����ô����Ӱ��

    public static Soup2 access() {//����ͨ��access()������ps1,ͬ���ģ������дһ����̬��ʵ�֣�����ps2,Ҳ�ǿ��Եġ�
        return ps1;
    }

    public void f() {
    }
}

public class Lunch {
    void testPrivate() {
        // ���ܽ������²���������Ϊ��˽�еĹ��캯��
        // Soup1 soup1 = new Soup1();
    }

    void testStatic() {
        Soup1 soup1 = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }
}
```
**����1**��`private Soup1() {}`��������ָ��Ϊprivate����ֱֹ�Ӵ���ĳ�����ʵ�������û����ȷ�����ٴ���һ���������Ļ����ᴴ��һ��Ĭ�ϵĹ�����(�������κβ���)������Լ���д��Ĭ�ϵĹ���������ô�Ͳ����Զ�����������ù�����ָ��Ϊprivate����ô˭Ҳ�޷���������Ķ���

**����2**��`class Soup2() {}`�õ������ģʽ(����),�����ض�ģʽ����Ϊsingleton(����)��ԭ����ʼ�ն�ֻ�ܴ�������һ������Soup2��Ķ�������ΪSoup2��һ��static private��Ա�������ġ����ҽ���һ��������ͨ��public����access()�������޷�����   