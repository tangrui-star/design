package principle.segregation.improve;

public class Segregation1 {
    public static void main(String[] args) {
        // use once
        A a = new A();
        // A类 通过接口去依赖 B类
        a.depend1(new B());
        a.depend2(new B());
        a.depend3(new B());

        C c = new C();
        // C 类通过接口去依赖（使用） D类
        c.depend1(new D());
        c.depend4(new D());
        c.depend5(new D());

    }
}

interface InterFace1 {
    void operation1();
}
interface InterFace2 {
    void operation2();
    void operation3();
}

interface InterFace3 {
    void operation4();
    void operation5();
}

class B implements InterFace1,InterFace2 {

    @Override
    public void operation1() {
        System.out.println("B 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了 operation3");
    }

}

class D implements InterFace1,InterFace3{

    @Override
    public void operation1() {
        System.out.println("D 实现了 operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了 operation5");
    }
}

class A {
    // A 类通过接口 InterFace1,InterFace2 依赖（使用） B类，但是只会用到 1,2,3 方法
    public void depend1(InterFace1 i) {
        i.operation1();
    }
    public void depend2(InterFace2 i) {
        i.operation2();
    }
    public void depend3(InterFace2 i) {
        i.operation3();
    }
}

class C {
    // C 类通过接口 InterFace1,InterFace3 依赖（使用） D类，但是只会用到 1,4,5 方法
    public void depend1(InterFace1 i) {
        i.operation1();
    }
    public void depend4(InterFace3 i) {
        i.operation4();
    }
    public void depend5(InterFace3 i) {
        i.operation5();
    }
}







