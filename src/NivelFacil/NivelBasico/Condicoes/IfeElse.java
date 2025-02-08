package NivelFacil.NivelBasico.Condicoes;

public class IfeElse {

    public static void main(String[] args) {

        String nome = "Naruto";
        String ranking;
        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 10;

        if (numeroDeMissoes == 10 && idade > 15){
            System.out.println(nome + ",Rank: Chunin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println(nome + "Rank: Jounin");
        } else {
            System.out.println(nome + "Rank: Gennin");
        }

    }
}
