package NivelIntermediario;

public class Main {
    public static void main(String[] args) {
        /*System.out.println("\n----- Naruto Uzumaki--------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki","Aldeia da Folha",16,20,NivelNinja.KAGE, Biju.KURAMA);
        naruto.habilidadeEspecial();
        System.out.println(naruto.biju);


        System.out.println("\n----- Sasuke Uchiha--------");

        Uchiha sasuke = new Uchiha("Sasuke Uchiha","Aldeia da Folha",17,20,NivelNinja.GENIN);
        sasuke.habilidadeEspecial();

        System.out.println("\n------ Itachi Uchiha -------");
        Uchiha itachi = new Uchiha("Itachi Uchiha","Aldeia da Folha",27,60, NivelNinja.JOUNNIN);
        itachi.habilidadeEspecial();
        itachi.meotdoProvisorio();

        System.out.println("\n------Madara Uchiha-------");
        Uchiha madara = new Uchiha("Madara Uchiha","Aldeia da Folha",45,900,NivelNinja.KAGE);

        madara.habilidadeEspecial();

        madara.inteligenciaDeCombate();
        madara.inteligenciaDeCombate(180);
        madara.meotdoProvisorio();

        naruto.tacarKunai();
        System.out.println(naruto.altura);

        Missoes missao1 = new Missoes("resgatar cao",RankDeMissoes.D);
        missao1.exibirDetalhes();*/


        /*List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");
        ninjasList.add("Kakashi");
        System.out.println("NinjaList: " + ninjasList);


        ninjasList.remove("Tobirama Senju");
        System.out.println("NinjaList: " + ninjasList);

        ninjasList.set(3,"Hashirama Senju");
        System.out.println("NinjaList: " + ninjasList);

        System.out.println("tamanho lista:"+ninjasList.size());

        System.out.println(ninjasList.indexOf("ashdlkj"));*/

        EquipamentoNinja kunai = new EquipamentoNinja("Kunai de ferro");
        EquipamentoNinja shuriken = new EquipamentoNinja("Shuriken");
        EquipamentoNinja pergaminho = new EquipamentoNinja("Pergaminho");

        BolsaGenerica<EquipamentoNinja> bolsaGenerica = new BolsaGenerica<>();

        bolsaGenerica.adicionarEquipamentos(kunai);
        bolsaGenerica.adicionarEquipamentos(shuriken);
        bolsaGenerica.adicionarEquipamentos(pergaminho);

        System.out.println(bolsaGenerica);
    }

}
