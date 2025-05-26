package geografia;

public class Tropical extends Clima {

    public Tropical(String regiao) {
        super(regiao);
    }

    @Override
    public void descrever() {
        System.out.println("Clima Tropical predominante na região: " + regiao);
    }

    @Override
    public void caracteristicas() {
        System.out.println("Caracteriza-se por temperaturas altas e estação chuvosa.");
    }
}
