package javacore.Gassosiacao.test;

import javacore.Gassosiacao.dominio.Escola;
import javacore.Gassosiacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Han");
        Professor professor2 = new Professor("Felix");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Escola de Seul", professores);

        escola.imprime();
    }
}
