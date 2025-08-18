package sobrecarga;

public class Calculadora {

    public double somar(double a, double b) {
        return a + b;
    }

    public double somar(double a, double b, double c) {
        return a + b + c;
    }

    public double somar(int a, int b) {
        return a + b;
    }

    public double somar(int a, int b, int c) {
        return a + b + c;
    }
}
