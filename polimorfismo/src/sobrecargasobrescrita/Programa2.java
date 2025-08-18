package sobrecargasobrescrita;

import sobrescrita.Carro;
import sobrescrita.Moto;

public class Programa2 {
    public static void main(String[] args) {
        Carro2 carro = new Carro2();
        Moto2 moto = new Moto2();

        System.out.println(carro.acelerar());
        System.out.println(carro.frear());
        System.out.println(carro.acelerar(90));

        System.out.println(moto.acelerar());
        System.out.println(moto.frear());
        System.out.println(moto.acelerar(80));
    }
}
