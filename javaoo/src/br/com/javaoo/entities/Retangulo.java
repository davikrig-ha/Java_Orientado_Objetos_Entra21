package br.com.javaoo.entities;

public class Retangulo {

    private double altura;
    private double largura;

    public void setAltura(double altura){
        this.altura = altura;
    }
    public void setLargura(double largura){
        this.largura = largura;
    }

    public double area(){
        return altura * largura;
    }

    public double perimetro(){
        return (altura * 2) + (largura * 2);
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));
    }


}


