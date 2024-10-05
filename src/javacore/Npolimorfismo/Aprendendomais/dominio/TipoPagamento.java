package javacore.Npolimorfismo.Aprendendomais.dominio;

public enum TipoPagamento {
    PIX("Pix"),
    DEBITO("Débito"),
    CREDITO("Crédito");
    private String tipo;

    TipoPagamento(String tipo) {
        this.tipo = tipo;
    }
}
