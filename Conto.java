public class Conto extends GenTextual {
    private int paginas;
    private String temaPrincipal;

    public Conto(String exemplo, String descricao, int paginas, String temaPrincipal) {
        super(exemplo, descricao);
        this.paginas = paginas;
        this.temaPrincipal = temaPrincipal;
    }

    public int getPaginas() {
        return paginas;
    }

    public String getTemaPrincipal() {
        return temaPrincipal;
    }

    @Override
    public void explicarGenero() {
        System.out.println("Conto: " + getExemplo() + " - " + getDesc());
        System.out.println("O Conto é uma narrativa curta com um enredo conciso e poucos personagens.");
        System.out.println("Número de Páginas (aproximado): " + getPaginas());
        System.out.println("Tema Principal: " + getTemaPrincipal());
    }
}
