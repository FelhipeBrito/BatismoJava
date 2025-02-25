package NivelIntermediario;

public class Uchiha extends Ninja {

    public Uchiha(){
    }

    public Uchiha(String nome,String aldeia,int idade){
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um ataque de fogo! Eu já completei: "+ numeroDeMissoesConcluidas + " missões.");
    }
    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é "+ nome + " e essa é minha INTELIGÊNCIA de combate!");
    }


    @Override
    public void inteligenciaDeCombate(int qi){
        if (qi > 150){
            System.out.println("Seu QI é: "+ qi + " e voce é um GENIO!");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: "+ qi + " e voce é um ninja promissor!");
        }else {
            System.out.println("Seu QI é: "+ qi + " e voce precisa treinar mais suas habilidades!");
        }
    }
}
