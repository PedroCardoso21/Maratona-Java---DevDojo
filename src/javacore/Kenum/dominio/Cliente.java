package javacore.Kenum.dominio;

public class Cliente {
    private String nome;
    private TipoCliente tipoCliente;
    public static tipoPagamento tipoPagamento;

    public Cliente (String nome, TipoCliente tipoCliente, tipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        Cliente.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNomeRelatorio() +
                ", tipoPagamento=" + tipoPagamento +
                ", tipoClienteInt=" + tipoCliente.getVALOR() +
                '}';
    }
}
