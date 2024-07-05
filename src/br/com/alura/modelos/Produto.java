package br.com.alura.modelos;

public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
       return nome;
    }

    @Override
    public String toString() {
        return "{" +
                "nome = '" + nome + '\'' +
                ", quantidade = " + quantidade +
                ", preco = R$" + preco +
                "}";
    }
}
