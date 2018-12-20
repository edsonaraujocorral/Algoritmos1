package com.company;

public class Main {

    public static void main(String[] args) {

        Produto produtos[] = {
                new Produto("Lamborghini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Brasilia", 16000),
                new Produto("Smart", 46000)
        };

        int maisBarato = buscaMenor(produtos, 4);
        System.out.println("O Veiculo mais barato e: " + produtos[maisBarato].getNome());
        System.out.println("O valor e R$:" + produtos[maisBarato].getPreco());

    }

    public static int buscaMenor(Produto[] produtos, int termino) {
        int maisBarato = 0;
        //int termino = produtos.length - 1;

        for(int i = 0; i < termino; i++) {
            if(produtos[i].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = i;
            }
        }

        return maisBarato;
    }
}
