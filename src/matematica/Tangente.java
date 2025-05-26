package matematica;

public class Tangente extends FormaTrigonometrica {
    private double resultado;

    public Tangente(double angulo) {
        super(angulo);
    }

    @Override
    public void calcular() {
        resultado = Math.tan(Math.toRadians(angulo));
    }

    @Override
    public void exibirResultado() {
        System.out.printf("Tangente de %.2f graus é %.4f%n", angulo, resultado);
    }
}