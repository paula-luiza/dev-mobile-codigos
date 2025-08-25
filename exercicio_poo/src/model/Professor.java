package model;

public class Professor extends Pessoa{

    private String siape;

    public Professor(String nome, String documento, String siape) {
        this.siape = siape;
        this.setNome(nome);
        this.setDocumento(documento);
    }

    public String getSiape() {
        return siape;
    }

    public void setSiape(String siape) {
        this.siape = siape;
    }

    public String identificacao(){
        return "Professor: " + this.getNome() + " (" + this.siape + ")";
    }

}
