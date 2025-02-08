package Desafios.D4;

public class NinjaAvancado implements Ninja{
    String nome;
    int idade;
    String habilidade;
    String especialidade;

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: "+ nome);
        System.out.println("Idade: "+idade);
        System.out.println("Habilidade: "+ habilidade);
        System.out.println("Especialidade: "+ especialidade);
    }

    @Override
    public void executarHabilidade() {

    }
}
