package control;

import model.Carro;
import model.Moto;

public class Programa {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Moto moto1 = new Moto();

        System.out.println(carro1.acelerar());
        System.out.println(carro1.frear());

        System.out.println(moto1.acelerar());
        System.out.println(moto1.frear());
    }
}
