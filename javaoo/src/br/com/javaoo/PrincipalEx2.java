package br.com.javaoo;

import br.com.javaoo.entities.Retangulo;

public class PrincipalEx2 {
    public static void main(String[] args) {
        Retangulo r = new Retangulo();

        r.setAltura(3.00);
        r.setLargura(4.00);

        System.out.printf("AREA = %.2f%n " , r.area());
        System.out.printf("PERIMETER =  %.2f%n ", r.perimetro());
        System.out.printf("DIAGONAL = %.2f%n ", r.diagonal());

    }
}
