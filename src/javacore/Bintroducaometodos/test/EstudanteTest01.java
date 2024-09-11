package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Estudante;
import javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Estudante estudante03 = new Estudante();
        Estudante estudante04 = new Estudante();
        Estudante estudante05 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Pedro";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "Lucas";
        estudante02.idade = 29;
        estudante02.sexo = 'M';

        estudante03.nome = "Ana";
        estudante03.idade = 20;
        estudante03.sexo = 'F';

        estudante04.nome = "Andrea";
        estudante04.idade = 54;
        estudante04.sexo = 'F';

        estudante05.nome = "Edem";
        estudante05.idade = 74;
        estudante05.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        impressora.imprime(estudante03);
        impressora.imprime(estudante04);
        impressora.imprime(estudante05);
    }
}
