package com.zoo.entities;

public class Cachorro  extends Animal{

    public Cachorro() {
    }

    public Cachorro(String nome, String especie, int idade, String sexo) {
        super(nome, especie, idade, sexo);
    }

    @Override
    public boolean isAdulto(){
        return super.getIdade() >= 24;
    }

    @Override
    public void emitirSom(){
        System.out.println("Latindo");
    }

}
