package com.Empresa.entities;

public class Terceirizado extends Funcionario {

    private Double bonus;

    public  Terceirizado(){
        super();
    }


    public Terceirizado(Double bonus) {
        this.bonus = bonus;
    }

    public Terceirizado(String nome, Integer valorHora, Double horas, Double bonus) {
        super(nome, valorHora, horas);
        this.bonus = bonus;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }

}
