package br.com.javaoo;

import br.com.javaoo.entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);
        Product p = new Product();


        System.out.println("Enter product data");

        System.out.print("name: ");
        p.setName(s.next());
        System.out.print("price: ");
        p.setPrice(s.nextDouble());
        System.out.print("quantity: ");
        p.setQuantity(s.nextInt());


        System.out.println("Product data: " + p.getNAME() + ", $ " + p.getPrice() + ", " +
                p.getQuantity() + " units, total: $ " + p.totalValueInStock() );


        System.out.println("enter the number of products to be added in stock: ");
        p.addProduct(s.nextInt());

        System.out.println("Product data: " + p.getNAME() + ", $ " + p.getPrice() + ", " +
                p.getQuantity() + " units, total: $ " + p.totalValueInStock() );

        System.out.print("enter the number of products to be removed from stock: ");
        p.removeProduct(s.nextInt());

        System.out.println("Product data: " + p.getNAME() + ", $ " + p.getPrice() + ", " +
                p.getQuantity() + " units, total: $ " + p.totalValueInStock() );

    }
}
