package Portugues;

public class Dissertativo extends GeneroTextual {

    public Dissertativo(String conteudo) {
        super(conteudo);
    }

    @Override
    public void apresentarCaracteristicas() {
        System.out.println("Gênero Dissertativo: defende uma ideia com argumentos");
    }

    @Override
    public void exibirExemplo() {
        System.out.println("Exemplo: " + "A educação digital é essencial porque...");
    }
}
