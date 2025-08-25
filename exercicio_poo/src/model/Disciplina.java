package model;

import java.util.HashSet;
import java.util.Set;

public class Disciplina {

    private Curso curso;
    private Set<Turma> listaTurmas = new HashSet<>();

    public Disciplina(Curso curso, Turma turma) {
        this.curso = curso;
        this.listaTurmas.add(turma);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
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
}
