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


        int maisBarato = 0;
        for(int i = 0; i <= 4; i++) {
            if(produtos[i].getPreco() < produtos[maisBarato].getPreco()) {
                maisBarato = i;
            }
        }

        System.out.println("O Veiculo mais barato e: " + produtos[maisBarato].getNome());
        System.out.println("O valor e R$:" + produtos[maisBarato].getPreco());

    }
}
