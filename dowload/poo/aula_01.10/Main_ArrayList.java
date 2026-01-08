import java.util.ArrayList;

public class Main_ArrayList {
    public static void main (String[] args) {
        ArrayList<String> lstNomes = new ArrayList();
        lstNomes.add("Fabio");
        lstNomes.add("Spider Man");
        lstNomes.add("Darth Vader");

        System.out.println(lstNomes.contains("Fabio"));
        System.out.println(lstNomes.contains("Maria"));

        System.out.println(lstNomes.get(1));
        System.out.println(lstNomes.get(0));

        System.out.println(lstNomes.isEmpty());

        //System.out.println(lstNomes.remove("Fabio"));
        System.out.println(lstNomes.get(0));

        System.out.println(lstNomes.size());

        /*for(int i = 0; i < lstNomes.size(); i++) {

            System.out.println(lstNomes.get(i));
        }*/

        for(String nome : lstNomes) {
            System.out.println(nome);
        }
    }
}