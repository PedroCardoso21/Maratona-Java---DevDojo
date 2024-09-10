package Exercicios.OrientacaoObjetos.Test;

import Exercicios.OrientacaoObjetos.Dominio.Funcionario;
import Exercicios.OrientacaoObjetos.Dominio.ImpressoraFuncionario;
import Exercicios.OrientacaoObjetos.Dominio.MediaSalarioFuncionario;

import java.sql.SQLOutput;

public class FuncionarioTest01 {
    // Crie uma classe funcionário com os seguintes atributos
    // Nome, Idade e Salário (Três Salários devem ser guardados)
    // Crie dois métodos
    // 1. Para imprimir os dados
    // 2. Para tirar a média dos salários e imprimir  o resultado
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();
        Funcionario funcionario03 = new Funcionario();
        ImpressoraFuncionario imprime = new ImpressoraFuncionario();
        MediaSalarioFuncionario media = new MediaSalarioFuncionario();

        funcionario01.nome = "Walter";
        funcionario01.idade = 42;
        funcionario01.salario = 9000;

        funcionario02.nome = "Vanessa";
        funcionario02.idade = 51;
        funcionario02.salario = 12000;

        funcionario03.nome = "Osvaldo";
        funcionario03.idade = 21;
        funcionario03.salario = 6000;

        imprime.imprime(funcionario01);
        imprime.imprime(funcionario02);
        imprime.imprime(funcionario03);
        System.out.println("A média salarial foi de: " + media.mediaSalarioFuncionario(funcionario01.salario,
                funcionario02.salario, funcionario03.salario));
    }
}
