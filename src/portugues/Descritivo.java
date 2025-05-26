package portugues;

public class Descritivo extends GeneroTextual {

    public Descritivo(String titulo, String conteudo) {
        super(titulo, conteudo);
    }

    @Override
    public void apresentarCaracteristicas() {
        System.out.println("Gênero Descritivo: descreve características de pessoas, lugares ou objetos.");
    }

    @Override
    public void exibirExemplo() {
        System.out.println("Título: " + titulo);
        System.out.println("Exemplo: " + conteudo);
    }
}
