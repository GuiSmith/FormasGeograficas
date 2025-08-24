package br.edu.unoesc.prog2.smith.geo;

public class Circulo extends FormaGeometrica{
    private double raio;

    public Circulo(double raio){
        this.raio = raio;
        this.setNome("Círculo");
    }

    public void setRaio(double raio){
        this.raio = raio;
    }
    public double getRaio(){
        return this.raio;
    }

    public double calcularArea() {
        return Math.PI*(Math.pow(this.raio,2));
    }
    public double calcularPerimetro() {
        return 2*Math.PI*this.raio;
    }
}