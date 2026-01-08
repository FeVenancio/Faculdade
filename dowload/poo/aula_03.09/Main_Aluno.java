public class Main_Aluno {
    public static void main(String[] args) {

        Aluno a = new Aluno();
        Aluno b = new Aluno();

        a.setRa("11111");
        a.setNome("Fabio");
        a.setCurso("ADS");
        b.setRa("222222");
        b.setNome("Gisele");
        b.setCurso("ADS");

        System.out.println(a.getNome());
        System.out.println(a.getRa());
        System.out.println(a.getCurso());
        System.out.println(b.getNome());
        System.out.println(b.getRa());
        System.out.println(b.getCurso());
        

    }
}
