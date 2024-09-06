package Introducao;

public class aula07ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[]{1, 2, 3};
        arrayInt[1] = new int[]{1, 2, 3, 4, 5};
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6, 7};

        for (int[] arrBase : arrayInt) {
            System.out.println("\n-------------------");
            for (int i : arrBase) {
                System.out.print(i);
            }
        }
    }
}
