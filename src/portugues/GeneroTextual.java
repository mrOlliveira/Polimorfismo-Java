package portugues;

public abstract class GeneroTextual {
    protected String titulo;
    protected String conteudo;

    public GeneroTextual(String titulo, String conteudo) {
        this.titulo = titulo;
        this.conteudo = conteudo;
    }

    public abstract void apresentarCaracteristicas();
    public abstract void exibirExemplo();
}
