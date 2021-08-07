package com.zoo.entities;

public class Animal {

    private String nome;
    private String especie;
    private int idade;

    //metodo construtor default
    public Animal(){}

    //metodo construtor nodefault
    public Animal(String nome, String especie, int idade){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    //metodos acessor
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void emitirSom(){
        System.out.println("Som do animal");
    }

    public boolean isAdulto(){
        return idade >= 1;
    }

}
