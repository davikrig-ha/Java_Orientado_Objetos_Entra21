package com.produtos.entities;

public class ProdutoImportado  extends Produto {

    private double taxaAlf;

    public ProdutoImportado(String nome, double preco, double taxaAlf) {
        super(nome, preco);
        this.taxaAlf = taxaAlf;
    }

    public double getTaxaAlf() {
        return taxaAlf;
    }

    public void setTaxaAlf(double taxaAlf) {
        this.taxaAlf = taxaAlf;
    }

    public double precoTotal() {
        return getPrice() + taxaAlf;
    }

    @Override
    public String etiquetaProduto () {
        return getName()
                + " $ "
                + String.format("%.2f", precoTotal())
                + " (Customs fee: $ "
                + String.format("%.2f", taxaAlf)
                + ")";
    }


}
