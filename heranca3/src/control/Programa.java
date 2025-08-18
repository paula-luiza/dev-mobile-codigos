package control;

import model.Falcao;
import model.PicaPau;
import model.Pinguim;

public class Programa {

    public static void main(String[] args) {
        PicaPau picapau = new PicaPau();
        System.out.println(picapau.bicar());
        System.out.println(picapau.voar());
        System.out.println(" ");

        Pinguim pinguim = new Pinguim();
        System.out.println(pinguim.bicar());
        System.out.println(pinguim.nadar());
        System.out.println(" ");

        Falcao falcao = new Falcao();
        System.out.println(falcao.voar());
        System.out.println(falcao.bicar());
    }
}
