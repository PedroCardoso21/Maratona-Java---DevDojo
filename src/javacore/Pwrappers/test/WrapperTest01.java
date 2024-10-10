package javacore.Pwrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 10D;
        char charP = 'A';
        boolean booleanP = true;

        Byte byteW = 1;
        Short shortW = 128;
        Integer intW = 1; // Autoboxing
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 10D;
        Character charW = 'A';
        Boolean booleanW = true;

        int i = intW; // Unboxing
        Integer intW2 = Integer.parseInt("1");
        Boolean verdadeiro = Boolean.parseBoolean("TRue");
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isDigit('a'));
        System.out.println(Character.isLetterOrDigit('@'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toLowerCase('A'));
    }
}
