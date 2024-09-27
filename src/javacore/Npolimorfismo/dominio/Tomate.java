package javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO = 0.10;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate");
        return this.valor * IMPOSTO;
    }
}
