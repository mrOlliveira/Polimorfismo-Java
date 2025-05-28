package Portugues;

public abstract class GeneroTextual {
    String conteudo;

    public GeneroTextual(String conteudo) {
        this.conteudo = conteudo;
    }

    public abstract void apresentarCaracteristicas();
    public abstract void exibirExemplo();
}
