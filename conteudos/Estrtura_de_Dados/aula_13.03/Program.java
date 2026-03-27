public class Program {
    public static void main (String[] args) {

        LinkedList listaDeTarefas = new LinkedList();
        listaDeTarefas.insert("Trabalhar");
        listaDeTarefas.insert("Comer");
        listaDeTarefas.insert("Dormir");
        listaDeTarefas.print();
        listaDeTarefas.printRe(listaDeTarefas.head);
    }
}
