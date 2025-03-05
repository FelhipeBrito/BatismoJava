package praTestes;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        String[] nomeNinjaArray = new String[3];

        System.out.println("---------Array----------");
        nomeNinjaArray[0] = "Naruto Uzumaki";
        nomeNinjaArray[1] = "Sasuke Uchiha";
        nomeNinjaArray[2] = "Sakura Haruno";
        System.out.println(nomeNinjaArray);
        System.out.println(nomeNinjaArray[0]);

        System.out.println("---------Lista----------");
        List<String> nomeNinjaList = new ArrayList<>();

        nomeNinjaList.add("Naruto Uzumaki");
        nomeNinjaList.add("Sasuke Uchiha");
        nomeNinjaList.add("Sakura Haruno");
        System.out.println(nomeNinjaList);

        System.out.println("---------Stack----------");
        Stack<String> nomeNinjaStack = new Stack<>();
        nomeNinjaStack.push("Naruto Uzumaki");
        nomeNinjaStack.push("Sasuke Uchiha");
        nomeNinjaStack.push("Sakura Haruno");
        System.out.println(nomeNinjaStack);

        System.out.println("---------Queue----------");

        Queue<String> nomeNinjaQueue = new LinkedList<>();

        nomeNinjaQueue.add("Naruto Uzumaki");
        nomeNinjaQueue.add("Sasuke Uchiha");
        nomeNinjaQueue.add("Sakura Haruno");

        System.out.println(nomeNinjaQueue);

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("meusZovo");
        System.out.println(linkedList);
        linkedList.add("cauraulho");
        System.out.println(linkedList);
        linkedList.pop();
        System.out.println(linkedList);
        linkedList.push("hello ");
        System.out.println(linkedList);
        linkedList.push("one");
        linkedList.push("two");
        linkedList.push("three");
        System.out.println(linkedList);
        linkedList.poll();
        System.out.println(linkedList);
        System.out.println(linkedList.peek());

        HashSet<String> aldeias = new HashSet<>();

        // Adicionando aldeias
        aldeias.add("Konoha");
        aldeias.add("Suna");
        aldeias.add("Kiri");
        aldeias.add("Konoha"); // Tentativa de duplicata

        // Exibindo as aldeias
        System.out.println("Aldeias participantes:");
        for (String aldeia : aldeias) {
            System.out.println(aldeia);
        }

        // Verificando se uma aldeia está presente
        System.out.println("Konoha está no torneio? " + aldeias.contains("Konoha"));

        // Removendo uma aldeia
        aldeias.remove("Kiri");
        System.out.println("Após remover Kiri: " + aldeias);

        // LinkedHashSet: Ordem de inserção
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Naruto");
        linkedHashSet.add("Sasuke");
        linkedHashSet.add("Sakura");
        linkedHashSet.add("Kakashi");

        System.out.println("LinkedHashSet (Ordem de Inserção):");
        System.out.println(linkedHashSet);

        // TreeSet: Ordem natural
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Naruto");
        treeSet.add("Sasuke");
        treeSet.add("Sakura");
        treeSet.add("zoio");
        treeSet.add("Kakashi");

        System.out.println("\nTreeSet (Ordem Natural):");
        System.out.println(treeSet);





    }
}
