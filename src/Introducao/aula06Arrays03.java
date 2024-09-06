package Introducao;

public class aula06Arrays03 {
    public static void main(String[] args) {
        // Foreach
        int[] num = {1, 2, 3, 4, 5};
        String[] nomes = {"Pedro", "Lucas", "Ana"};

        for (int i : num){
            System.out.println(i);
        }

        for (String j : nomes){
            System.out.println(j);
        }
    }
}
