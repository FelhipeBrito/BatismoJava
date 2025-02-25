package NivelIntermediario;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da folha";
        naruto.idade = 16;
        naruto.habilidadeEspecial();

        Uchiha sasuke = new Uchiha("Sasuke Uchiha","Aldeia da Folha",17,20,NivelNinja.GENIN);
        sasuke.habilidadeEspecial();

        Uchiha madara = new Uchiha("Madara Uchiha","Aldeia da Folha",45,900,NivelNinja.KAGE);

        madara.habilidadeEspecial();

        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(180);
        madara.meotdoProvisorio();
    }

}
