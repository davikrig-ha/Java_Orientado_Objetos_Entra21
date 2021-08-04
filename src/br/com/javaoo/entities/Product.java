package br.com.javaoo.entities;

public class Product {

    //declaração.
    private String name;
    private double price;
    private int quantity;
    private String color;


    //Setando e Capturando o objeto.
    public void setName(String nome){
        this.name = nome;
    }
    public String getNAME(){
       return name;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public double getPrice(){ return price; }

    public void setQuantity(int quantity){ this.quantity = quantity;
    } public int getQuantity(){ return quantity; }


    public void setColor(String color){ this.color = color; }
    public String getColor(){ return color; }

    public double totalValueInStock(){ return   quantity * price; }

    public void addProduct(int quantity){
        if (quantity < 0){ return; } this.quantity += quantity; }

    public void removeProduct(int quantity){
        if (this.quantity < quantity){ return; } this.quantity -= quantity; }
}
