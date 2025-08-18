package control;
import model.Aluno;
import model.Professor;

public class Programa {

    public static void main(String[] args){
        Aluno aluno = new Aluno("João","999999999","123");
        Professor prof = new Professor("Thiago","9999999999","Doutor");

        System.out.println(prof.getNome());
        System.out.println(aluno.getNome());

    }
 }
