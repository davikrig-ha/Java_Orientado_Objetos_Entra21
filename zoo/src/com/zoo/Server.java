package com.zoo;

import com.zoo.entities.Animal;

public class Server {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.setNome("Zico");
        animal.setEspecie("Gato vira lata");
        animal.setIdade(1);
        animal.emitirSom();

                System.out.println("Olá, seu animal é um " + animal.getEspecie() +
                " O nome dele é " + animal.getNome() + " e Tem "
                        + animal.getIdade() +  " Anos");

                if (animal.isAdulto()){
                    System.out.println("É adulto");
                }
                else {
                    System.out.println("É filhote");
                }


    }
}
