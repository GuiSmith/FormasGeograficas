package br.edu.unoesc.prog2.smith.geo;

public class Retangulo extends FormaGeometrica implements FormaPoligono {
    private static final int quantidadeLados = 4;
    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
        this.setNome("Retângulo");
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getLargura() {
        return this.largura;
    }

    public int getQuantidadeLados() {
        return quantidadeLados;
    }

    @Override
    public double calcularArea() {
        return (this.altura*this.largura);
    }

    @Override
    public double calcularPerimetro() {
        return (this.altura*2) + (this.largura*2);
    }
}
