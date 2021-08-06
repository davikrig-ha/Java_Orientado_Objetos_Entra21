package br.com.javaoo.entities;

public class Aluno {

    private String name;
    private double testOne;
    private double testTwo;
    private double testThree;

    public void setName(String nome){
        this.name = nome;
    }


    public void setTestOne(double testOne){
        this.testOne = testOne;
    }

    public void setTestTwo(double testTwo){
        this.testTwo = testTwo;
    }

    public void setTestThree(double testThree){
        this.testThree = testThree;
    }


    public void one(double testOne){
        if (testOne > 30){ return; } this.testOne += testOne;
    }

    public void two(double testTwo){
        if (testTwo > 35){ return; } this.testTwo += testTwo;
    }

    public void three(double testThree){
        if (testThree > 35){ return; } this.testThree += testThree;
    }

    public double somaNotas(){
        return testOne + testTwo + testThree;
    }

    public double faltaPonto(){
        if (somaNotas() < 60.0) {
            return 60.0 - somaNotas();
        }
        else {
         return  0.0;
        }

    }

    public void statusAluno(){
        if (somaNotas() < 60.0){
            System.out.println("Reprovado! ");
            System.out.printf("Faltam: %.2f%n ", faltaPonto());
        } else {
            System.out.println("Aprovado");
        }
    }

   }




