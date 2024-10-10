package javacore.Oexception.exception.dominio;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{
    @Override
    public void salvar() throws LoginInvalidoException, ArithmeticException {
        // Não é necessário colocar as mesmas exceções
        System.out.println("Salvando funcionário");
    }
}
