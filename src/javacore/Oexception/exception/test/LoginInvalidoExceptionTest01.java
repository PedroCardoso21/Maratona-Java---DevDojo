package javacore.Oexception.exception.test;

import javacore.Oexception.exception.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoExceptionTest01 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            throw new RuntimeException(e);
        }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner input =  new Scanner(System.in);
        String usernameDB = "Jiraya";
        String passwordDB = "Sensei";
        System.out.print("Usuário: ");
        String usernameDigitado = input.nextLine();
        System.out.print("Senha: ");
        String passwordDigitado = input.nextLine();
        if(!usernameDB.equals(usernameDigitado) || !passwordDB.equals(passwordDigitado)) {
            throw new LoginInvalidoException("Usuário ou Senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");
    }
}
