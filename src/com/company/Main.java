package com.company;

public class Main {

    public static void main(String[] args) {
        Produto produtos[] = new Produto[5];
        produtos[0] = new Produto("Lamborghini", 1000000);
        produtos[1] = new Produto("Jipe", 46000);
        produtos[2] = new Produto("Brasilia", 16000);
        produtos[3] = new Produto("Smart", 46000);
        produtos[4] = new Produto("Fusca", 17000);

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
