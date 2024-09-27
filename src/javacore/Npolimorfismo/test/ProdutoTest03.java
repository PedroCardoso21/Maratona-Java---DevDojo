package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Televisao;
import javacore.Npolimorfismo.dominio.Tomate;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("SKALA", 1400);
        Tomate tomate = new Tomate("Vermelho", 15);
        tomate.setDataValidade("05/10/2024");
        Produto produto3 = new Televisao("HG", 2000);

        CalculadoraImposto.calculaImposto(tomate);
    }
}
