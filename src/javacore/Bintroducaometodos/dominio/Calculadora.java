package javacore.Bintroducaometodos.dominio;

public class Calculadora {
    // Void = Não retorna nada
    public void somaDoisNumeros() {
        System.out.println(10 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(10 - 5);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do altera 2 números");
        System.out.println("Num 1 -> " + num1);
        System.out.println("Num 2 -> " + num2);
    }
}
