package geografia;

public abstract class Clima {
    protected String regiao;

    public Clima(String regiao) {
        this.regiao = regiao;
    }

    public abstract void descrever();
    public abstract void caracteristicas();
}
