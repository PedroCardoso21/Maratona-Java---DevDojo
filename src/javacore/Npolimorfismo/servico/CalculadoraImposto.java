package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.dominio.Produto;

public class CalculadoraImposto {
    public static void calculaImposto(Produto produto) {
        System.out.println("Relatório de imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor do produto: " + produto.getValor());
        System.out.println("Imposto do produto: " + imposto);
        double valorFinal = produto.getValor() - imposto;
        System.out.println("Valor final do produto: " + valorFinal);
    }
}
