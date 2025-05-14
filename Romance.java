public class Romance extends GenTextual {
    private String autor;

    public Romance(String exemplo, String descricao, String autor) {
        super(exemplo, descricao);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public void explicarGenero() {
        System.out.println("Romance: " + getExemplo() + " - " + getDesc());
        System.out.println("O Romance é uma narrativa longa com diversos personagens e enredo complexo.");
        System.out.println("Autor: " + getAutor());
    }
}
