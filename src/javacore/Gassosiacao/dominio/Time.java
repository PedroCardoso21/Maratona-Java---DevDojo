package javacore.Gassosiacao.dominio;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String time) {
        this.nome = time;
    }

    public Time(String time, Jogador[] jogadores) {
        this.nome = time;
        this.jogadores = jogadores;
    }

    public void imprimir() {
        System.out.println(this.nome);
        if(jogadores == null) {
            return;
        }
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }
}
