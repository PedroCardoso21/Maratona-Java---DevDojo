package Introducao;

public class aula05EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // While, Do While, For
        int count = 0;

        while (count < 10) {
            System.out.println(count);
            count++;
        }

        count = 0;
        do {
            System.out.println("Dentro do do-while");
            count++;
        }
        while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For "+i);
        }
    }
}
