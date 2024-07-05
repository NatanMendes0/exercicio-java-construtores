# Exercício: Resolução sobre Construtores

## Introdução
Para reforçar a compreensão sobre construtores, propomos um exercício prático que irá aprofundar seus conhecimentos fundamentais. A atividade consiste em criar classes em Java, utilizando construtores e herança. 

Pronto para mergulhar nesse aprendizado prático?

## Descrição do Exercício
O exercício é dividido em várias etapas:

1. **Criação da Classe `Produto`**:
    - Crie uma classe `Produto` com os seguintes atributos:
        - `nome` (String)
        - `preco` (double)
        - `quantidade` (int)
    - Implemente o método `toString()` na classe `Produto` para retornar uma representação em texto do objeto.

2. **Utilização da Classe `ArrayList`**:
    - Crie uma lista de objetos `Produto` utilizando a classe `ArrayList`.
    - Adicione alguns produtos à lista.
    - Imprima o tamanho da lista.
    - Recupere um produto pelo índice e imprima seus detalhes.

3. **Modificação da Classe `Produto`**:
    - Adicione um construtor à classe `Produto` que aceite parâmetros para inicializar os atributos.
    - Crie objetos `Produto` utilizando esse novo construtor.

4. **Criação da Classe `ProdutoPerecivel`**:
    - Crie uma classe `ProdutoPerecivel` que herde de `Produto`.
    - Adicione um atributo `dataValidade` (String) à classe `ProdutoPerecivel`.
    - Crie um construtor que utilize o construtor da classe mãe (`super`) para inicializar os atributos herdados.
    - Crie um objeto `ProdutoPerecivel` e imprima seus valores.

## Solução

### Passo 1: Classe `Produto`

```java
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    // Getters e Setters podem ser adicionados aqui
}
