package javacore.Hheranca.test;

import javacore.Hheranca.dominio.Endereco;
import javacore.Hheranca.dominio.Funcionario;
import javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("21345-123");
        Pessoa pessoa = new Pessoa("Matheus");
        pessoa.setCpf("123.456.789-10");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Cardoso");
        funcionario.setCpf("123.456.789-10");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("-----------");
        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
