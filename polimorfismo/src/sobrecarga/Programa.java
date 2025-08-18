package sobrecarga;

public class Programa {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.somar(3, 2));
        System.out.println(calc.somar(3, 2, 1));
        System.out.println(calc.somar(3.0, 2.0));
        System.out.println(calc.somar(3.0, 2.0, 1.0));
    }
}
