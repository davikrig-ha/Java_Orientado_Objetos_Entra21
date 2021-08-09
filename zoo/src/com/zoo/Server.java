package com.zoo;

import com.zoo.entities.Animal;
import com.zoo.entities.Cachorro;
import com.zoo.entities.Gato;
import com.zoo.entities.Passaro;

public class Server {
    public static void main(String[] args) {
        Animal gato = new Gato("Zico", "Gato", 13, "Macho");

                System.out.println("Olá, seu animal é um " + gato.getEspecie() +
                " O nome dele é " + gato.getNome() + " e Tem "
                + gato.getIdade() +  " Meses" + " ele é um " + gato.getSexo());



                if (gato.isAdulto()){
                    System.out.println("É adulto");
                }
                else {
                    System.out.println("É filhote");
                }

        gato.emitirSom();

        System.out.println(" ");

           Animal passaro = new Passaro("Zu", "Ave", 36, "Femea");


                System.out.println("Olá, seu animal é uma " + passaro.getEspecie() +
                " O nome dele é " + passaro.getNome() + " e Tem "
                + passaro.getIdade() +  " Meses" + " Ela é uma " + passaro.getSexo());

        if (passaro.isAdulto()){
            System.out.println("É adulto");
        }
        else {
            System.out.println("É filhote");
        }

        passaro.emitirSom();

        System.out.println(" ");

        Animal cachorro = new Cachorro("Todinho", "Cachorro", 6, "Macho");


        System.out.println("Olá, seu animal é um " + cachorro.getEspecie() +
                " O nome dele é " + cachorro.getNome() + " e Tem "
                + cachorro.getIdade() +  " Meses" + " Ele é um " + cachorro.getSexo());

        if (cachorro.isAdulto()){
            System.out.println("É adulto");
        }
        else {
            System.out.println("É filhote");
        }

        cachorro.emitirSom();

    }
}
