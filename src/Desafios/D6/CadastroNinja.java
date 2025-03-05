package Desafios.D6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CadastroNinja {
    List<Ninja> cadastroNinjas = new ArrayList<>();

    public void menu(){
        System.out.println("-------------------");
        System.out.println("1 - Cadastrar Ninja");
        System.out.println("2 - Exibir Cadastros");
        System.out.println("3 - Excluir Cadastro");
        System.out.println("4 - Sair");
        System.out.print(":");
    }

    public void adicionarNinja(Ninja ninja){
        cadastroNinjas.add(ninja);
    }

    public void removerNinja(Ninja ninja) {
        Iterator<Ninja> it = cadastroNinjas.iterator();

        while (it.hasNext()) {
            Ninja n = it.next();
            if (n.getNome().equalsIgnoreCase(ninja.getNome())) {
                it.remove(); // Remove corretamente o ninja da lista
                System.out.println("Ninja " + ninja.getNome().toUpperCase() + " removido com sucesso!");
                return;
            }
        }
        System.out.println("Ninja não encontrado!");
    }


    @Override
    public String toString() {
        return "Cadastros: " + cadastroNinjas.toString();
    }

    public int tamanhoCadastro(){
        return cadastroNinjas.size();
    }
}
