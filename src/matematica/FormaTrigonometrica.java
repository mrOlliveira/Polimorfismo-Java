package matematica;

public abstract class FormaTrigonometrica {
    protected double angulo;

    public FormaTrigonometrica(double angulo) {
        this.angulo = angulo;
    }

    public abstract void calcular();
    public abstract void exibirResultado();
}
