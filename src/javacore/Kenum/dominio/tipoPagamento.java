package javacore.Kenum.dominio;

public enum tipoPagamento {
    DEBITO {
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    },
    CREDITO {
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public double calcularDesconto(double valor) {
        return 0;
    }
}
