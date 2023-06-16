package gestion_de_eventos;

public class cilindro extends figura_geometrica{
    private double radio;
    private double altura; 
    
    public cilindro(double radio, double altura) {
    this.radio = radio;
    this.altura = altura;
    this.setVolumen(calcular_volumen());
    this.setSuperficie(calcular_superficie());
    }
    
    public double calcular_volumen() {
    double volumen = Math.PI * altura * Math.pow(radio, 2.0);
    return volumen;
}
    public double calcular_superficie() {
    double áreaLadoA = 2.0 * Math.PI * radio * altura;
    double áreaLadoB = 2.0 * Math.PI * Math.pow(radio, 2.0);
    return áreaLadoA + áreaLadoB;
    }
}
