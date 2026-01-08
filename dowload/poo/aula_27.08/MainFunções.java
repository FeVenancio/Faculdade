public class MainFunções {
    public static void main (String[] args) {
        
        String result = enviarEmail();
        System.out.println(result);
    }

    public static String enviarEmail() {
        String assunto = "IA domina o mundo";
        String destinatario = "fabio.colombini@facens.br";
        String remetente = "eliney@facens.br";
        String corpo = "Olá deu tudo certo";
        String email = assunto + "\n" + destinatario + "\n" + remetente + "\n" + corpo;
        return email;
    }
}