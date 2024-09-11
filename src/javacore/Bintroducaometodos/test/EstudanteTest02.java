package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Renato";
        estudante01.idade = 42;
        estudante01.sexo = 'M';

        estudante02.nome = "Renata";
        estudante02.idade = 32;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
