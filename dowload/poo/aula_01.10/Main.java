public class Main {
    public static void main(String[] args) {
        
        OrganizadorDeMusicas meuOrganizador = new OrganizadorDeMusicas();
       
        System.out.println("--- Adicionando Músicas por Atributos ---");
        meuOrganizador.adicionarFaixa("Bohemian Rhapsody", "Queen", 354);
        meuOrganizador.adicionarFaixa("Stairway to Heaven", "Led Zeppelin", 482);
        
        System.out.println("\n--- Adicionando Músicas por Objeto Faixa ---");
        Faixa faixa3 = new Faixa("Hotel California", "Eagles", 390);
        meuOrganizador.adicionarFaixa(faixa3);
        
        meuOrganizador.listarTodasAsFaixas();
        
        System.out.println("\n--- Teste de Reprodução ---");
        meuOrganizador.reproduzirFaixa(1);
    
        System.out.println("\n--- Teste de Remoção ---");
        meuOrganizador.removerFaixa(0);
        
        meuOrganizador.listarTodasAsFaixas();
        
        System.out.println("\n--- Teste de Reprodução Pós-Remoção ---");
        meuOrganizador.reproduzirFaixa(0);
    }
}
