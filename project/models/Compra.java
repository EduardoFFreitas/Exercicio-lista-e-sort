package project.models;

import java.util.Comparator;

public class Compra implements Comparable<Compra> {
    private String item;
    private double valor;

    public Compra(String item, double valor) {
        this.item = item;
        this.valor = valor;
    }

    public String getItem() {
        return item;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Item: " + item + " Valor: " + valor;
    }

    @Override
    public int compareTo(Compra outraCompra) {
        return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
    }

    //outro jeito de fazer o compareTo tambem.
//    @Override
//    public int compareTo(Compra outraCompra) {
//        if(this.valor < outraCompra.getValor()){
//            return -1;
//        }
//        if (this.valor > outraCompra.getValor()){
//            return 1;
//        }
//        return 0;
//    }
}
