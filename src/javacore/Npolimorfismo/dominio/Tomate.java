package javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    public static final double IMPOSTO = 0.10;
    private String dataValidade;

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    public double calcularImposto() {
        System.out.println("Calculando imposto do Tomate");
        return this.valor * IMPOSTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
