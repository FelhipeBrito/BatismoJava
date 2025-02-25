package NivelIntermediario;

public class Ninja implements EstrategiaDeBatalha{
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;
    final double altura = 2.10;

    //TODO: Inlcuir 2 novos atributos: numeroDeMissoesConcluidas, rank
    //TODO: Rank: GENIN,CHUUNIN,JOUNNIN,KAGE

    public Ninja(){
    }

    //todo ninja vai fazer
    final void tacarKunai(){
        System.out.println("Eu sou um método da classe mãe!");
    }

    public Ninja(String nome,String aldeia,int idade){
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }
    //TODO: Sobrecarga do construtor chamdando os novos atributos
    //Sobrecarga de metodos nao precisa redeclarar o construtor, so os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial!");
    }

    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é "+ nome + " e essa é minha ESTRATÉGIA de combate!");
    }

    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é "+ nome + " e essa é minha INTELIGÊNCIA de combate!");
    }
    public void inteligenciaDeCombate(int qi){
        if (qi > 150){
            System.out.println("Seu QI é: "+ qi + " e voce é um GENIO!");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: "+ qi + " e voce é um ninja promissor!");
        }else {
            System.out.println("Seu QI é: "+ qi + " e voce precisa treinar mais suas habilidades!");
        }
    }
    public void meotdoProvisorio(){
        System.out.println("Teste");
    }
}
