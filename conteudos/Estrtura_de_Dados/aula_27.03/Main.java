import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Alunos aluno1 = new Alunos("Felipe", 251670, "08/09/2006");
        Alunos aluno2 = new Alunos("Eduardo", 251671, "14/10/2006");
        Alunos aluno3 = new Alunos("Guilherme", 251672, "12/06/2006");

        Alunos aluno4 = new Alunos("João", 251673, "23/06/2005");
        Alunos aluno5 = new Alunos("Thiago", 251674, "17/04/2006");
        Alunos aluno6 = new Alunos("Daniel", 251675, "09/01/2006");

        LinkedList listaAlunos = new LinkedList();
        LinkedList listaAlunos2 = new LinkedList();

        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        listaAlunos.add(aluno3);

        listaAlunos2.add(aluno4);
        listaAlunos2.add(aluno5);
        listaAlunos2.add(aluno6);

        System.out.println("Lista 01");
        listaAlunos.print();
        System.out.println("Lista 02");
        listaAlunos2.print();
        
        System.out.println("Lista juntada");
        LinkedList listaAlunos3 = listaAlunos.juntar(listaAlunos, listaAlunos2);
        listaAlunos3.print();

        scn.close();
    }
}
