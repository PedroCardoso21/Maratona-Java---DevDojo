package javacore.Kenum.test;

import javacore.Kenum.dominio.Cliente;
import javacore.Kenum.dominio.TipoCliente;
import javacore.Kenum.dominio.tipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA, tipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Bartolomeu", TipoCliente.PESSOA_FISICA, tipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(tipoPagamento.DEBITO.calcularDesconto(100));
    }
}
