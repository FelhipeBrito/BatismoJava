package NivelIntermediario;

public class Ninja implements EstrategiaDeBatalha{
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    //TODO: Inlcuir 2 novos atributos: numeroDeMissoesConcluidas, rank
    //TODO: Rank: GENIN,CHUUNIN,JOUNNIN,KAGE

    public Ninja(){
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

}
