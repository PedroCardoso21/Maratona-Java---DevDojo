package Exercicios.OrientacaoObjetos.Dominio;

public class Seminario {
    private String titulo;
    private SeminariosAlunos[] alunos;
    private SeminariosLocal local;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario(String titulo, SeminariosAlunos[] alunos) {
        this.titulo = titulo;
        this.alunos = alunos;
    }

    public Seminario(String titulo, SeminariosAlunos[] alunos, SeminariosLocal local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public SeminariosAlunos[] getAlunos() {
        return alunos;
    }

    public void setAlunos(SeminariosAlunos[] alunos) {
        this.alunos = alunos;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public SeminariosLocal getLocal() {
        return local;
    }

    public void setLocal(SeminariosLocal local) {
        this.local = local;
    }
}
