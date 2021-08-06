package br.com.semoo;

import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {


        System.out.println("Entre com os valores de altura e largura do retangulo: ");

        double altura = 3.00;
        double largura = 4.00;

        double area = altura * largura;
        double perimetro = (altura * 2) + (largura * 2);
        double diagonal = Math.sqrt(Math.pow(largura, 2) + Math.pow(altura, 2));


        System.out.printf("AREA = %.2f%n ", area);
        System.out.printf("PERIMETRO = %.2f%n ", perimetro);
        System.out.printf("DIAGONAL = %.2f%n ", diagonal);

    }
}
