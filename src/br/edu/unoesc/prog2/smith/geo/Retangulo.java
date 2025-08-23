package br.edu.unoesc.prog2.smith.geo;

public class Retangulo extends FormaGeometrica{
    private static final int quantidadeLados = 4;
    private Double altura;
    private Double largura;

    public Retangulo(Double altura, Double largura) {
        this.altura = altura;
        this.largura = largura;
        this.setNome("Retângulo");
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getAltura() {
        return this.altura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getLargura() {
        return this.largura;
    }

    public static int getLados() {
        return quantidadeLados;
    }

    @Override
    public Double calcularArea() {
        return (this.altura*this.largura);
    }

    @Override
    public Double calcularPerimetro() {
        return (this.altura*2) + (this.largura*2);
    }
}
