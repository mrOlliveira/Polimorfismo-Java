public class Poema extends GenTextual {
    private String forma; // Ex: Soneto, Haicai, etc.
    private int versos;

    public Poema(String exemplo, String descricao, String forma, int versos) {
        super(exemplo, descricao);
        this.forma = forma;
        this.versos = versos;
    }

    public String getForma() {
        return forma;
    }

    public int getVersos() {
        return versos;
    }

        @Override
    public void explicarGenero() {
        System.out.println("Poema: " + getExemplo() + " - " + getDesc());
        System.out.println("O Poema é uma forma de arte literária que utiliza a linguagem de maneira estética e rítmica.");
        System.out.println("Forma: " + getForma());
        System.out.println("Número de Versos: " + getVersos());
    }
}
