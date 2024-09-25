package javacore.Lclassesabstratas.test;

import javacore.Lclassesabstratas.dominio.Desenvolvedor;
import javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Lucas", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Pedro", 15000);
        System.out.println(gerente);
        System.out.println(desenvolvedor);
    }
}
