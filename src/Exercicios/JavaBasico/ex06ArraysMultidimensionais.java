package Exercicios.JavaBasico;

public class ex06ArraysMultidimensionais {
    public static void main(String[] args) {
        // Tabuada

        int [][] arrayInt = new int[10][];
        arrayInt[0] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayInt[1] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayInt[3] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayInt[4] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayInt[5] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayInt[6] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayInt[7] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayInt[8] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        arrayInt[9] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for(int i = 1; i < arrayInt.length; i++){
            System.out.println("\nTabuada de "+i);
            for(int j = 1; j <= arrayInt[i].length; j++){
                System.out.print(i * j + " ");
            }
        }
    }
}
