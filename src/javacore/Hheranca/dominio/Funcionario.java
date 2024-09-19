package javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Funcionário");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático de Funcionário");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático de Funcionário 2");
    }

    public Funcionario (String nome) {
        super(nome);
        System.out.println("Dentro do construtor de Funcionário");
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + salario);
    }

    public void relatorioPagamento() {
        System.out.println("O funcionário " + this.nome + " Recebeu o pagamento de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
