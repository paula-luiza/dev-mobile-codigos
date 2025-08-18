package pacote2;

import pacote1.A;
import pacote1.B;

public class C {

    private String c1;
    protected String c2;

    public void mc1(){
        A a = new A();
        B b = new B();
        D d = new D();

        a.ma1();

        b.ma1();
        b.mb1();

        d.d2 = "C mudou";
        d.ma1();
        d.mb1();
        d.md1();
        d.md2();
    }

    void mc2(){

    }
}
