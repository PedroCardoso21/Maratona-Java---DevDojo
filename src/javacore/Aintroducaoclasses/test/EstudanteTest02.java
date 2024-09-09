package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        estudante2.nome = "Sandy";
        // A preferência de variável vai ser a que está no mesmo arquivo
        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println("----------------");
        System.out.println(estudante2.idade);
        System.out.println(estudante2.nome);
        System.out.println(estudante2.sexo);
    }
}
