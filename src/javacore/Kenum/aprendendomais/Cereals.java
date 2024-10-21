package javacore.Kenum.aprendendomais;

public enum Cereals {
    CAPTAIN_CRUNCH(50, 5.99),
    FROOT_LOOPS(60, 10.15),
    REESES_PUFFS(100, 20.00),
    COCOA_PUFFS(75, 15);

    final int levelOfDeliciousness;
    final double price;

    Cereals (int levelOfDeliciousness, double price) {
        this.levelOfDeliciousness = levelOfDeliciousness;
        this.price = price;
    }
}
