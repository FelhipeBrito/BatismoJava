package NivelFacil.NivelBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;
        * */

        short numeroMissoes = 1;

        String nivel = (numeroMissoes >= 10) ? "Esta com mais de 10 missoes" : "Esta com menos de 10 missoes";

        System.out.println(nivel);



    }
}
