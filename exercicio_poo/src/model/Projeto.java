package model;

public class Projeto implements IAvaliacao{

    private double entregas;
    private double pesos;

    public Projeto(double entregas, double pesos) {
        this.entregas = entregas;
        this.pesos = pesos;
    }

    public double getEntregas() {
        return entregas;
    }

    public void setEntregas(double entregas) {
        this.entregas = entregas;
    }

    public double getPesos() {
        return pesos;
    }

    public void setPesos(double pesos) {
        this.pesos = pesos;
    }

    public double calcularNotaFinal() {
        return this.entregas / this.pesos;
    }

}
