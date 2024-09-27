package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Televisao;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Lenovo", 4200);
        Tomate tomate = new Tomate("Vermelhão", 20);
        Televisao televisao = new Televisao("LG", 6000);

        CalculadoraImposto.calculaImposto(computador);
        System.out.println("--------------------");
        CalculadoraImposto.calculaImposto(tomate);
        System.out.println("--------------------");
        CalculadoraImposto.calculaImposto(televisao);
    }
}
