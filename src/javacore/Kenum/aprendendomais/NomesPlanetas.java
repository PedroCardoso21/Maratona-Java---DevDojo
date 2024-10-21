package javacore.Kenum.aprendendomais;

public enum NomesPlanetas {
    MERCURIO("Mercúrio", 1),
    VENUS("Vênus", 2),
    TERRA("Terra", 3),
    MARTE("Marte", 4),
    JUPITER("Júpiter", 5),
    SATURNO("Saturno", 6),
    URANO("Urano", 7),
    NETUNO("Netuno", 8);

    final String nomePlaneta;
    final int distanciaSol ;

    NomesPlanetas(String nomePlaneta, int distanciaSol) {
        this.nomePlaneta = nomePlaneta;
        this.distanciaSol = distanciaSol;
    }
}
