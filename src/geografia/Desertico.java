package geografia;

public class Desertico extends Clima {

    public Desertico(String regiao) {
        super(regiao);

    }

    @Override
    public void descrever() {
        System.out.println("Clima Desértico predominante na região: " + regiao);
    }

    @Override
    public void caracteristicas() {
        System.out.println("Altas temperaturas de dia, frio à noite e quase nenhuma precipitação.");
    }
}
