package Exercicios.OrientacaoObjetos.Dominio;

public class ImpressoraFuncionario {
    public void imprime(Funcionario funcionario) {
        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Idade: " + funcionario.idade);
        System.out.println("Salario: " + funcionario.salario);
        System.out.println("----------------------------");
    }
}
