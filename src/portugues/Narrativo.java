package portugues;

public class Narrativo extends GeneroTextual {

    public Narrativo(String conteudo) {
        super(conteudo);
    }

    @Override
    public void apresentarCaracteristicas() {
        System.out.println("Gênero Narrativo: apresenta enredo, personagens e tempo");
        System.out.println("- Conta uma história com início, meio e fim");
    }

    @Override
    public void exibirExemplo() {
        System.out.println("Exemplo: " + "João investigou os sons na mansão...");
        System.out.println(conteudo);
    }
}
