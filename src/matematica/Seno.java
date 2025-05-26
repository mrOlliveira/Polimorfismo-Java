package matematica;

public class Seno extends FormaTrigonometrica {
    private double resultado;

    public Seno(double angulo) {
        super(angulo);
    }

    @Override
    public void calcular() {
        resultado = Math.sin(Math.toRadians(angulo));
    }

    @Override
    public void exibirResultado() {
        System.out.printf("Seno de %.2f graus é %.4f%n", angulo, resultado);
    }
}
