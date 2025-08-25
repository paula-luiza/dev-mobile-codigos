package model;

import java.util.HashSet;
import java.util.Set;

public class Curso {

    private Set<Disciplina> listaDisciplinas = new HashSet<>();

    public Set<Disciplina> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public void setListaDisciplinas(Set<Disciplina> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }

    public void addDisciplina(Disciplina disciplina){
        this.listaDisciplinas.add(disciplina);
    }

    public void removeDisciplina(Disciplina disciplina){
        this.listaDisciplinas.remove(disciplina);
    }
}
