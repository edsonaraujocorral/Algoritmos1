package com.company;

public class Main {

    public static void main(String[] args) {

        Produto produtos[] = {
                new Produto("Lamborghini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Brasilia", 16000),
                new Produto("Smart", 46000),
                new Produto("Fusca", 17000)
        };

        selectionSort(produtos, produtos.length);
        for(Produto produto : produtos) {
            System.out.println(produto.getNome() + " " + produto.getPreco());
        }

    }
    private static void insertionSort(Produto[] produtos, int quantidadeDeElementos) {
        for(int atual = 0; atual < quantidadeDeElementos; atual++) {
            int analise = atual;
            while(analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {
                troca(produtos, analise, analise - 1);
                analise--;
            }
        }
    }
    private static void selectionSort(Produto[] produtos, int quantidadeDeElementos) {
        for(int atual = 0; atual < quantidadeDeElementos - 1; atual++) {
            int menor = buscaMenor(produtos, atual, quantidadeDeElementos - 1);
            troca(produtos, atual, menor);
        }
    }


    public static int buscaMenor(Produto[] produtos, int inicio, int termino) {
        int maisBarato = inicio;
        //int termino = produtos.length - 1;

        for(int atual = inicio; atual <= termino; atual++) {
            if(produtos[atual].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = atual;
            }
        }

        return maisBarato;
    }

    public static void troca(Produto[] produtos, int primeiro, int segundo) {
        Produto primeiroProduto = produtos[primeiro];
        Produto segundoProduto = produtos[segundo];

        produtos[primeiro] = segundoProduto;
        produtos[segundo] = primeiroProduto;
    }
}
