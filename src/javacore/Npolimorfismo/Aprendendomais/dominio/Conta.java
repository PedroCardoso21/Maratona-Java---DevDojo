package javacore.Npolimorfismo.Aprendendomais.dominio;

import java.util.Scanner;

public class Conta implements ContaPagar {
    private double valor;
    private TipoPagamento tipoPagamento;

    public Conta(double valor, TipoPagamento tipoPagamento) {
        this.valor = valor;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public void pagar() {
        System.out.println("O valor da sua conta é: " + valor);
        System.out.println("A forma de pagamento selecionada foi: " + tipoPagamento);
    }
}
