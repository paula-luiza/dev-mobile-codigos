package pacote1;

import pacote2.C;
import pacote2.D;

public class B extends A {

    private String b1;
    protected String b2;

    public void mb1(){
        A a = new A();
        C c = new C();
        D d = new D();

        a.a2 = "B mudou";
        a.ma1();
        a.ma2();

        c.mc1();

        d.a2 = "B mudou";
        d.b2 = "B mudou";
        d.md1();
        d.mb1();
        d.ma1();
    }

    void mb2(){

    }
}
