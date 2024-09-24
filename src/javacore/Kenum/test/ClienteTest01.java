package javacore.Kenum.test;

import javacore.Kenum.dominio.Cliente;
import javacore.Kenum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Tsubasa", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente2 = new Cliente("Bartolomeu", TipoCliente.PESSOA_FISICA);
        Cliente cliente3 = new Cliente("Wallan", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente4 = new Cliente("Han", TipoCliente.PESSOA_FISICA);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
