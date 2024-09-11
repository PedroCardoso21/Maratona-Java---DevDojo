package Introducao.JavaBasico;

public class aula05EstruturasDeRepeticao02 {
    // Imprima os primeiros 50 números de 1 dado valor. Por exemplo, 100
    public static void main(String[] args) {
        int valorMax = 100;

        for (int i = 0; i <= valorMax; i++){
            if (i > 50){
                break;
            }
            System.out.println("Número: "+i);
        }
    }
}
