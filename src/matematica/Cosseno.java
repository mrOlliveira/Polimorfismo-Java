package matematica;

public class Cosseno extends FormaTrigonometrica {
    private double resultado;

    public Cosseno(double angulo) {
        super(angulo);
    }

    @Override
    public void calcular() {
        resultado = Math.cos(Math.toRadians(angulo));
    }

    @Override
    public void exibirResultado() {
        System.out.printf("Cosseno de %.2f graus é %.4f%n", angulo, resultado);
    }
}
