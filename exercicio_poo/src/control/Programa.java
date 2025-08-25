package control;

import model.Aluno;

public class Programa {
    public static void main(String[] args) {

        Aluno joao = new Aluno("João", "00000", "001");

        System.out.println(joao.identificacao());
    }

}
