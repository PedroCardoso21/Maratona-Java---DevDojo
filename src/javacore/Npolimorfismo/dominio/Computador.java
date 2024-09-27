package javacore.Npolimorfismo.dominio;

public class Computador extends Produto{
    public static final double IMPOSTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    public double calcularImposto() {
        System.out.println("Calculando imposto do Computador");
        return this.valor * IMPOSTO;
    }
}
