package portugues;

public class Narrativo extends GeneroTextual {

    public Narrativo(String titulo, String conteudo) {
        super(titulo, conteudo);
    }

    @Override
    public void apresentarCaracteristicas() {
        System.out.println("Gênero Narrativo: apresenta enredo, personagens e tempo.");
    }

    @Override
    public void exibirExemplo() {
        System.out.println("Título: " + titulo);
        System.out.println("Exemplo: " + conteudo);
    }
}
