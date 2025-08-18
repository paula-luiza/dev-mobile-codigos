package model;

public class Professor extends Pessoa{

    private String titulo;

    public Professor(String nome, String telefone, String titulacao){
        this.setNome(nome);
        this.setTelefone(telefone);
        this.titulo = titulacao;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }
}
