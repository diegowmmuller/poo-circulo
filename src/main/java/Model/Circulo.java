package Model;

public class Circulo {
    
    private static final Double  PI = 3.1415;
    private Double raio;

    public Circulo() {
    }

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }
    
    public Double getArea(){
        return Math.pow(raio, 2) * PI;
    }
    
}
