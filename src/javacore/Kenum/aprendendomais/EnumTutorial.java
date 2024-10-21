package javacore.Kenum.aprendendomais;

public class EnumTutorial {
    public static void main(String[] args) {
        DaysOfTheWeek day = DaysOfTheWeek.MONDAY;

        for (DaysOfTheWeek d : DaysOfTheWeek.values()) {
            System.out.println(d);
        }

        System.out.println(Cereals.REESES_PUFFS.levelOfDeliciousness);
        System.out.println(Cereals.REESES_PUFFS.price);

        for (Cereals c : Cereals.values()) {
            System.out.println(c);
        }
    }
}
