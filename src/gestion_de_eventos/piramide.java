package gestion_de_eventos;

public class piramide extends figura_geometrica{
    private double base; 
    private double altura; 
    private double apotema;
    
    public piramide(double base, double altura, double apotema) {
    this.base = base;
    this.altura = altura;
    this.apotema = apotema;
    this.setVolumen(calcular_volumen());
    this.setSuperficie(calcular_superficie());
    }
    public double calcular_volumen() {
    double volumen = (Math.pow(base, 2.0) * altura) / 3.0;
    return volumen;
}

    public double calcular_superficie() {
    double áreaBase = Math.pow(base, 2.0);
    double áreaLado = 2.0 * base * apotema;
    return áreaBase + áreaLado;
    }
}
