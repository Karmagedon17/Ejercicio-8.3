package gestion_de_eventos;

public class esfera extends figura_geometrica{
    private double radio;
    public esfera(double radio) {
    this.radio = radio;
    this.setVolumen(calcular_volumen());
    this.setSuperficie(calcular_superficie());
}
    public double calcular_volumen() {
    double volumen = 1.333 * Math.PI * Math.pow(this.radio, 3.0);
    return volumen;
}
    public double calcular_superficie() {
    double superficie = 4.0 * Math.PI * Math.pow(this.radio, 2.0);
    return superficie;
}
}
