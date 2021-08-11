package com.Empresa.entities;

public class Funcionario {

      protected String nome;
      protected Integer valorHora;
      protected Double horas;

    public Funcionario() {
    }

    public Funcionario(String nome, Integer valorHora, Double horas) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.horas = horas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getValorHora() {
        return valorHora;
    }

    public void setValorHora(Integer valorHora) {
        this.valorHora = valorHora;
    }

    public Double getHoras() {
        return horas;
    }

    public void setHoras(Double horas) {
        this.horas = horas;
    }

    public Double pagamento(){
        return this.horas * this.valorHora;
    }

}
