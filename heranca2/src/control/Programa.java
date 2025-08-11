package control;

import model.B;
import model.C;

public class Programa {

    public static void main(String[] args) {
        C ex1 = new C();
        B ex2 = new B();

        System.out.println(ex1.mover());
        System.out.println(ex1.falar());
        System.out.println(ex1.saudar());

        System.out.println("--------------------------------------");

        System.out.println(ex2.cumprimentar());
        System.out.println(ex2.falar());
        System.out.println(ex2.saudar());
    }
}
