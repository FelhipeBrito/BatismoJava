package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        Hokages hokage = new Hokages("hokage2");

        hokage.nome = "hello world";
        hokage.idade = 78;

        System.out.println(hokage.nome);
        System.out.println(hokage.idade);

    }

}
