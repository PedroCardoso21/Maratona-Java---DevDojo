package introducaoclasses.test;

import introducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante aaa = new Estudante();
        aaa.nome = "Pedro";
        aaa.idade = 19;
        aaa.sexo = 'M';
        System.out.println(aaa.nome);
        System.out.println(aaa.idade);
        System.out.println(aaa.sexo);
    }
}
