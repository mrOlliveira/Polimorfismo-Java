package Portugues;

public class Narrativo extends GeneroTextual {

    public Narrativo(String conteudo) {
        super(conteudo);
    }

    @Override
    public void apresentarCaracteristicas() {
        System.out.println("Gênero Narrativo: apresenta enredo, personagens e tempo");
    }

    @Override
    public void exibirExemplo() {
        System.out.println("Exemplo: " + "João investigou os sons na mansão...");
    }
}
