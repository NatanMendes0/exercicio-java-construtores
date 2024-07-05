# Desafio do curso da Alura - Trabalhando com Listas e Coleções de Dados 
Nesse desafio, lido com Construtores e Herança em Java

Este repositório contém o código-fonte para o desafio proposto na aula sobre construtores e herança em Java. O objetivo é praticar a criação de classes, construtores e herança, utilizando a classe `Produto` como base.

## Descrição do Desafio

O desafio consiste em:

1. **Criar a classe `Produto`:**
   - Atributos: `nome`, `preco` e `quantidade`.
   - Criar uma lista de objetos `Produto` utilizando `ArrayList`.
   - Adicionar alguns produtos à lista.
   - Imprimir o tamanho da lista.
   - Recuperar um produto pelo índice.
   - Implementar o método `toString()` para retornar uma representação em texto do objeto.
   - Imprimir a lista de produtos utilizando `System.out.println()`.
     <br/>
2. **Criar um construtor para a classe `Produto`:**
   - O construtor deve receber parâmetros para inicializar os atributos.
   - Criar objetos `Produto` utilizando o novo construtor.
   <br/>
3. **Criar a classe `ProdutoPerecivel`:**
   - Herda da classe `Produto`.
   - Atributo: `dataValidade`.
   - Construtor que utiliza o construtor da classe mãe (`super`) para inicializar os atributos herdados.
   - Criar um objeto `ProdutoPerecivel` e imprimir seus valores.

## Como Executar o Código

1. Clone este repositório.
2. Compile o código utilizando o comando `javac *.java`.
3. Execute o código utilizando o comando `java Main`.

## Arquivos

- `Produto.java`: Classe `Produto` com seus atributos, métodos e construtor.
- `ProdutoPerecivel.java`: Classe `ProdutoPerecivel` que herda de `Produto`.
- `Main.java`: Classe principal que contém o código para testar as classes `Produto` e `ProdutoPerecivel`.