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
        SeminariosLocal local = new SeminariosLocal("Maricá");
        SeminariosAlunos aluno1 = new SeminariosAlunos("Pedro", 20);
        SeminariosProfessores professor = new SeminariosProfessores("Fred", "Biologia");
        SeminariosAlunos[] alunosSeminario = {aluno1};

        Seminario seminario = new Seminario("Combate a covid", alunosSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}