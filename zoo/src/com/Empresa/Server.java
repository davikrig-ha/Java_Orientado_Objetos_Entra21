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

        List<Funcionario> employeeList = new ArrayList<>();
        System.out.println("Enter the number of employees");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + i + " data:");
            System.out.println("Outsourced (y/n)");
            char ch = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.next();
            String nome = scanner.nextLine();

            System.out.print("Hours: ");
            int horas = scanner.nextInt();

            System.out.println("Value per hour");
            double valorHora = scanner.nextDouble();

            if(ch == 'y'){
                System.out.print("Aditional charge: ");
                double bonus = scanner.nextDouble();
                employeeList.add(new Terceirizado(nome, horas, valorHora, bonus));
            }else{
                employeeList.add(new Funcionario(nome, horas, valorHora));
            }
        }

        System.out.println();
        System.out.print("Payments: ");

        for (Funcionario employee : employeeList){
            System.out.println(employee.getNome() + " - $ " + String.format("%.2f", employee.pagamento()));
        }
        scanner.close();




    }

}