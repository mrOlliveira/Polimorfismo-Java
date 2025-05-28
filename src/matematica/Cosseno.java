package Matematica;

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

    @Override
    public void exibirExemplo(){
        System.out.println("Cosseno é a razão entre o cateto adjacente e a hipotenusa.\n" +"Fórmula: cos(θ) = adjacente / hipotenusa");
    }
}
