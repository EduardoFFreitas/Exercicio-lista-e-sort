package project.principal;


import project.models.CartaoDeCredito;
import project.models.Compra;

import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double limite;
        String item;
        double preco;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o limite do cartão:");
        limite = input.nextDouble();
        CartaoDeCredito cartao = new CartaoDeCredito(limite);

        int contador = 1;
        while (contador != 0){
            System.out.println("Qual o nome do item: ");
            item = input.next();
            System.out.println("Qual o valor do item: ");
            preco = input.nextDouble();
            Compra compra = new Compra(item, preco);
            if(cartao.transacao(compra)){
                System.out.println("Compra realizada");
                System.out.println("1 para fazer outra compra e 0 para sair:");
                contador = input.nextInt();
            } else{
                System.out.println("Sem limite!");
                contador = 0;
            }

            Collections.sort(cartao.getCompra());
            if(contador == 0){
                System.out.println("extrato: ");
                System.out.println(cartao.getCompra());
            }

        }


    }
}