package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Samsung", 3200);
        System.out.println("Nome: " + produto.getNome());
        System.out.println("Valor: " + produto.getValor());
        System.out.println("Imposto: " + produto.calcularImposto());
        System.out.println("---------------------");
        Produto produto1 = new Tomate("Americano", 20);
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Valor: " + produto1.getValor());
        System.out.println("Imposto: " + produto1.calcularImposto());
    }
}
