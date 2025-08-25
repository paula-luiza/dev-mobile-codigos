package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TurmaPresencial extends Turma {

    private Set<Aluno> listaAlunos = new HashSet<>();
    private List<IAvaliacao> listaAvaliacoes = new ArrayList<>();
}
