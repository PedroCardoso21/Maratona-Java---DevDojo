package Exercicios.OrientacaoObjetos.Dominio;

public class Seminario {
    private String titulo;
    SeminariosAlunos[] alunos;
    SeminariosLocal local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, SeminariosAlunos[] alunos, SeminariosLocal local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public void imprime() {
        if (this.alunos == null) {
            return;
        }
        for (SeminariosAlunos aluno : this.alunos) {
            System.out.println(aluno.getNome() + " - " + aluno.getIdade() + " anos");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public SeminariosAlunos[] getAlunos() {
        return alunos;
    }

    public void setAlunos(SeminariosAlunos[] alunos) {
        this.alunos = alunos;
    }

    public SeminariosLocal getLocal() {
        return local;
    }

    public void setLocal(SeminariosLocal local) {
        this.local = local;
    }
}
