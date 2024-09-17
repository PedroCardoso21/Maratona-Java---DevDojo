package Exercicios.OrientacaoObjetos.Dominio;

public class SeminariosProfessores {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

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
        System.out.println("--------------");
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if (this.seminarios != null) {
            return;
        }
        System.out.println("## Seminários cadastrados ##");
        for(Seminario seminario : this.seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            System.out.println("** Alunos **");
            for (SeminariosAlunos aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome());
                System.out.println("Idade: " + aluno.getIdade());
            }
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
