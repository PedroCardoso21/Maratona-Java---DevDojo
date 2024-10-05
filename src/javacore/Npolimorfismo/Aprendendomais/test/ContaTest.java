package javacore.Npolimorfismo.Aprendendomais.test;

import javacore.Npolimorfismo.Aprendendomais.dominio.Conta;
import javacore.Npolimorfismo.Aprendendomais.dominio.TipoPagamento;

public class ContaTest {
    public static void main(String[] args) {
        Conta conta = new Conta(3500, TipoPagamento.DEBITO);
        Conta conta2 = new Conta(4200, TipoPagamento.PIX);

        conta.pagar();
        conta2.pagar();
    }
}
