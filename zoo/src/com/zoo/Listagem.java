package com.zoo;


import java.util.ArrayList;
import java.util.List;

public class Listagem {
    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<>();

        listaNomes.add("Rafael");
        listaNomes.add("João");
        listaNomes.add("Tiago");
        listaNomes.add("Davi");
        listaNomes.add("jota");

       for (int i = 0; i < listaNomes.size(); i++){
           System.out.println(listaNomes.get(i));
       }

        System.out.println("     ");
       //adicionando elementos a lista

        listaNomes.add(2, "Lucas");
        for (String itemLista: listaNomes) {
            System.out.println(itemLista);
        }

        System.out.println("    ");

        //removendo elementos da lista
       listaNomes.remove("Lucas");
        for (String itemLista: listaNomes) {
            System.out.println(itemLista);
        }

        System.out.println("    ");

        //remove pela primeira letra
        listaNomes.removeIf(x -> x.charAt(0) == 'D');
        for (String itemLista: listaNomes) {
            System.out.println(itemLista);
        }

        System.out.println("  ");

        //descobrindo a posição do item
        System.out.println("rafael esta na posição " + listaNomes.indexOf("Rafael"));


        System.out.println("  ");

        //lista de forma simples
        listaNomes.forEach(s -> System.out.println(s));

        System.out.println("  ");

        //pesquisa
        String nomeFiltrado = listaNomes.stream().filter(c -> c.charAt(0) == 'R').findFirst().orElse(null);

        System.out.println(nomeFiltrado);
    }
}
