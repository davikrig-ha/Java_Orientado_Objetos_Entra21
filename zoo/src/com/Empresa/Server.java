package com.Empresa;


import com.Empresa.entities.Funcionario;
import com.Empresa.entities.Terceirizado;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Funcionario> fl = new ArrayList<>();

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Funcionario " + i + " data: ");
            System.out.println("Tercerizado (y/n) ");
            char ch = scanner.next().charAt(0);
            System.out.println("Name: ");
            scanner.next();

            String nome = scanner.nextLine();

            System.out.println("Horas: ");

            int horas = scanner.nextInt();

            System.out.println("Valor por hora");
            double valorHora = scanner.nextDouble();

            if (ch == 'y'){
                System.out.println("Bonus ");
                double bonus = scanner.nextDouble();
                fl.add(new Terceirizado(nome, valorHora, horas, bonus));

            }else {
                fl.add(new Funcionario(nome, valorHora, horas));
            }

            System.out.println(
            );

            System.out.println("salarios");


            for (Funcionario funcionario : fl){


            }
        }



        scanner.close();

    }

}