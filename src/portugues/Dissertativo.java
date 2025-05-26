package portugues;

public class Dissertativo extends GeneroTextual {

    public Dissertativo(String titulo, String conteudo) {
        super(titulo, conteudo);
    }

    @Override
    public void apresentarCaracteristicas() {
        System.out.println("Gênero Dissertativo: defende uma ideia com argumentos.");
    }

    @Override
    public void exibirExemplo() {
        System.out.println("Título: " + titulo);
        System.out.println("Exemplo: " + conteudo);
    }
}
