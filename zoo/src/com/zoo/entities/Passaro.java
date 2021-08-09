package com.zoo.entities;

public class Passaro extends Animal {

    public Passaro() {
    }

    public Passaro(String nome, String especie, int idade, String sexo) {
        super(nome, especie, idade, sexo);
    }

    @Override
    public boolean isAdulto() {
        return super.getIdade() >= 6;

    }

    @Override
    public void emitirSom() {
        System.out.println("Piando");
    }


}
