package javacore.Kenum.aprendendomais;

public class Planetas {
    NomesPlanetas planeta;

    public Planetas(String planeta) {
        this.planeta = NomesPlanetas.valueOf(planeta);
    }

    public void viajarPlaneta() {
        switch(planeta) {
            case MERCURIO:
                System.out.println("Indo pra Mercurio");
                break;
            case VENUS:
                System.out.println("Indo pra Vênus");
                break;
            case TERRA:
                System.out.println("Já estamos na Terra");
                break;
        }
    }
}
