package br.com.javaoo;

import br.com.javaoo.entities.Aluno;


import java.util.Locale;
import java.util.Scanner;

public class PrincipalEx1 {
    public static void main(String[] args) {


            Locale.setDefault(Locale.US);
            Scanner s = new Scanner(System.in);
            Aluno p = new Aluno();


            System.out.print("student name: ");
            p.setName(s.next());

            p.setTestOne(0.0);
            System.out.print("test one: ");
            p.one(s.nextDouble());

            p.setTestTwo(0.0);
            System.out.print("test two: ");
            p.two(s.nextDouble());

            p.setTestThree(0.0);
            System.out.print("test three: ");
            p.three(s.nextDouble());


            System.out.println("nota final:  " + p.somaNotas());

           p.statusAluno();



        }
}
