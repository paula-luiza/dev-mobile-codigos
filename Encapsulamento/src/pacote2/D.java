package pacote2;

import pacote1.A;
import pacote1.B;

public class D extends B {
    private String d1;
    protected String d2;

    public void md1(){
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        a.ma1();

        b.ma1();
        b.mb1();

        c.c2 = "D mudou";
        c.mc1();
        c.mc2();
    }

    void md2(){

    }
}
