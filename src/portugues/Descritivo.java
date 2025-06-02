package portugues;

public class Descritivo extends GeneroTextual {

    public Descritivo(String conteudo) {
        super(conteudo);
    }

    @Override
    public void apresentarCaracteristicas() {
        System.out.println("Gênero Descritivo: descreve pessoas, lugares ou objetos");
    }

    @Override
    public void exibirExemplo() {
        System.out.println("Exemplo: " + "A praia tinha areia branca e ondas azul-turquesa...");
    }
}
