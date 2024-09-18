package Exercicios.OrientacaoObjetos.Dominio;

import java.util.Arrays;

public class SeminariosProfessores {
    private String nome;
    private String especialidade;
    Seminario[] seminarios;

    public SeminariosProfessores(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public SeminariosProfessores(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("-------------------------------------");
        System.out.println("Nome do professor: " + this.nome);
        System.out.println("Especialidade do professor: " + this.especialidade);
        System.out.println("---- Seminários do professor ---- ");
        if (seminarios == null) {
            return;
        }
        for(Seminario seminario : seminarios) {
            System.out.println("Nome: " + seminario.getTitulo());
            System.out.println("Local: " + seminario.getLocal().getEndereco());
            System.out.println("---- Alunos presentes ----");
            seminario.imprime();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
