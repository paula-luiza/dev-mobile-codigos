package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Turma {

    private Set<Aluno> listaAlunos = new HashSet<>();;
    private List<IAvaliacao> listaAvaliacoes = new ArrayList<>();

    public Set<Aluno> getListaAlunos() {
        return listaAlunos;
    }

    public void setListaAlunos(Set<Aluno> listaAlunos) {
        this.listaAlunos = listaAlunos;
    }

    public List<IAvaliacao> getListaAvaliacoes() {
        return listaAvaliacoes;
    }

    public void setListaAvaliacoes(List<IAvaliacao> listaAvaliacoes) {
        this.listaAvaliacoes = listaAvaliacoes;
    }
}
