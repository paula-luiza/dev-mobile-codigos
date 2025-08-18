package model;

public abstract class Pessoa {

    private String nome;
    private String telefone;

    public String getNome(){
        return this.nome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setTelefone(String tel){
        this.telefone = tel;
    }

}
