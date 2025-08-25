package model;

public class Prova implements IAvaliacao{

    private double acertos;
    private int total;

    public Prova(double acertos, int total) {
        this.acertos = acertos;
        this.total = total;
    }

    public double getAcertos() {
        return acertos;
    }

    public void setAcertos(double acertos) {
        this.acertos = acertos;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public double calcularNotaFinal(){
        return this.acertos/this.total;
    }

}
