package javacore.Hheranca.test;

import javacore.Hheranca.dominio.Funcionario;

public class HerancaTest02 {

    // 0 - O bloco de inicialização estático da super classe é executado quando a JVM carregar classe pai
    // 1 - O bloco de inicialização estático da subclasse é executado quando a JVM carregar classe filha
    // 2 - Alocado espaço em memória para objeto da classe pai
    // 3 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado da classe pai
    // 4 - Bloco de inicialização da super classe é executado
    // 5 - Construtor da super classe é executado
    // 6 - Bloco de inicialização da subclasse é executado
    // 7 - Construtor da subclasse é executado

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Matheus");
    }
}
