package br.com.alura.modelos;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, int quantidade, double preco, String dataValidade) {
        super(nome, quantidade, preco);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + "Data de Validado do Produto: " + getDataValidade();
    }
}
