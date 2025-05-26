package geografia;

public class Equatorial extends Clima {

    public Equatorial(String regiao) {
        super(regiao);
    }

    @Override
    public void descrever() {
        System.out.println("Clima Equatorial predominante na região: " + regiao);
    }

    @Override
    public void caracteristicas() {
        System.out.println("Altas temperaturas e muita umidade durante todo o ano.");
    }
}
