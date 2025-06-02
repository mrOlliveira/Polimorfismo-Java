package matematica;

public abstract class FormaTrigonometrica {
    double angulo;

    public FormaTrigonometrica(double angulo) {
        this.angulo = angulo;
    }

    public abstract void exibirExemplo();
    public abstract void calcular();
    public abstract void exibirResultado();
}
