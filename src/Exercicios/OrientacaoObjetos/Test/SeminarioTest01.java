package Exercicios.OrientacaoObjetos.Test;

// Crie um sistema que gerencie seminários
// O sistema deverá cadastrar seminários, estudantes, professores e local onde será realizado

// Um aluno poderá estar em apenas um seminário
// Um seminário poderá ter vários ou nenhum aluno
// Um professor poderá ter vários seminários
// Um seminário deve ter um local

// Campos básicos (Excluindo relacionamento)
// Seminário: título
// Aluno: nome e idade
// Professor: nome e especialidade
// Local: endereço

import Exercicios.OrientacaoObjetos.Dominio.Seminario;
import Exercicios.OrientacaoObjetos.Dominio.SeminariosAlunos;
import Exercicios.OrientacaoObjetos.Dominio.SeminariosLocal;
import Exercicios.OrientacaoObjetos.Dominio.SeminariosProfessores;

public class SeminarioTest01 {
    public static void main(String[] args) {
        SeminariosLocal local = new SeminariosLocal("Rio de Janeiro");
        SeminariosAlunos aluno1 = new SeminariosAlunos("Pedro", 19);
        SeminariosAlunos aluno2 = new SeminariosAlunos("Ana", 21);
        SeminariosAlunos[] alunos = {aluno1, aluno2};
        Seminario seminario = new Seminario("Combate a covid 19", alunos, local);
        Seminario[] seminarios = {seminario};
        SeminariosProfessores professor = new SeminariosProfessores("Fred", "Biologia", seminarios);
        professor.imprime();
    }
}