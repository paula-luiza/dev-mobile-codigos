package model;

import java.util.HashSet;
import java.util.Set;

public class Aluno extends Pessoa{

    private String matricula;
    private Set<Turma> listaTurmas = new HashSet<>();

    public Aluno(String nome, String documento, String matricula) {
        this.setNome(nome);
        this.setDocumento(documento);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Set<Turma> getListaTurmas() {
        return listaTurmas;
    }

    public void setListaTurmas(Set<Turma> listaTurmas) {
        this.listaTurmas = listaTurmas;
    }

    public void addTurma(Turma turma){
        this.listaTurmas.add(turma);
    }

    public void removeTurma(Turma turma){
        this.listaTurmas.remove(turma);
    }

    public String identificacao(){
        return "Aluno: " + this.getNome() + " (" + this.matricula + ")";
    }

}
