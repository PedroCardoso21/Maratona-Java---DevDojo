package javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Dentro do Array IndexOutOfBoundsException");
        } catch(NullPointerException e) {
            System.out.println("Dentro do NullPointerException");
        } catch(ClassCastException e) {
            System.out.println("Dentro do ClassCastException");
        } catch(IllegalArgumentException e) {
            System.out.println("Dentro do IllegalArgumentException");
        } catch(RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException e) {
            System.out.println("Dentro do SQLException");
        } catch (FileNotFoundException e) {
            System.out.println("Dentro do FileNotFoundException");
        }

        try {
            testandoException();
        } catch (ArithmeticException | NullPointerException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException {

    }

    private static void testandoException() throws ArithmeticException, NullPointerException {

    }
}
