public class NumerosPares {

    public static void main(String[] args){

        for(int cont = 1; cont <= 100; cont++){
            if (cont % 2 == 0) {
                System.out.println(cont + " eh par");
            }
        }

        for(int cont = 2; cont <= 100; cont += 2){
            System.out.println(cont + " eh par");
        }

        


    }



}