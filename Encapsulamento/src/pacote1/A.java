package pacote1;

import pacote2.C;
import pacote2.D;

public class A {

    private String a1;
    protected String a2;

    public void ma1(){
        B b = new B();
        b.a2 = "A mudou";
        b.b2 = "A mudou";
        b.mb1();
        b.mb2();
        b.ma1();
        b.ma2();

        C c = new C();
        c.mc1();

        D d = new D();
        d.a2 = "A mudou";
        d.b2 = "A mudou";
        d.ma1();
        d.mb1();
        d.md1();

        A a = new A();
        a.a1 = "";
    }

    void ma2(){

    }
}
