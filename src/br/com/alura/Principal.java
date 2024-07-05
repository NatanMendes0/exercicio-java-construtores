package br.com.alura;

import br.com.alura.modelos.Produto;
import br.com.alura.modelos.ProdutoPerecivel;

import java.sql.Array;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        //exercicio 3 (já havia o realizado anteriormente)
        var produto1 = new Produto("sabão", 5, 3.20);
        var produto2 = new Produto("esponja", 5, 3.20);
        var produto3 = new Produto("lápis", 5, 3.20);

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        //exercício 1
        System.out.println("\nExercício 1:\n O tamanho da lista de produtos é: " + listaDeProdutos.size());
        for (int i = 0; i < listaDeProdutos.size(); i++) {
            System.out.println("O item da lista de produtos da "+(i+1)+"ª posição é: "+listaDeProdutos.get(i).getNome());
        }

        //exercicio 2
        System.out.println("\nExercício 2:\nA lista completa de produtos estocados é:\n"+listaDeProdutos.toString());

        //exercicio 4
        var produto4 = new ProdutoPerecivel("leite", 7, 8.9, "29/02/09");
        System.out.println("\nExercício 4:\nA visão geral do produto perecível é a seguinte:\n"+produto4);
    }
}
