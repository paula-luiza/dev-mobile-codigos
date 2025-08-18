package model;

public class Aluno extends Pessoa {

    private String matricula;

    public Aluno(String nome, String telefone, String matricula){
        this.setNome(nome);
        this.setTelefone(telefone);
        this.matricula = matricula;
    }

    public void setMatricula(String mat){
        this.matricula = mat;
    }

    public String getMatricula(){
        return this.matricula;
    }

}
