package javacore.Npolimorfismo.dominio;

public class Televisao extends Produto {
    public static final double IMPOSTO = 0.13;

    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    public double calcularImposto() {
        System.out.println("Calculando impostos da televisão");
        return valor * IMPOSTO;
    }
}
