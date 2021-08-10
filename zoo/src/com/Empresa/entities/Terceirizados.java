package com.Empresa.entities;

public class Terceirizados extends Funcionario {


    public Terceirizados(String nome, int horas, double valorHora) {
        super(nome, horas, valorHora);
    }




    @Override
    public double salario() {
        return getValorHora() * getHoras();
    }

    @Override
    public double bonus(){
     return (salario()/ 10) + salario();
    }
}
