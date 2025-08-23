package br.edu.unoesc.prog2.smith.geo;

public class Triangulo extends FormaGeometrica{
    private static final int quantidadeLados = 3;
    private Double ladoA;
    private Double ladoB;
    private Double ladoC;

    public Triangulo(Double ladoA, Double ladoB, Double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.setNome("Triângulo");
    }

    public void setLadoA(Double ladoA) {
        this.ladoA = ladoA;
    }
    public Double getLadoA() {
        return this.ladoA;
    }

    public void setLadoB(Double ladoB) {
        this.ladoB = ladoB;
    }
    public Double getLadoB() {
        return this.ladoB;
    }

    public void setLadoC(Double ladoC) {
        this.ladoC = ladoC;
    }
    public Double getLadoC() {
        return this.ladoC;
    }

    public String getTipo() {

        boolean isTrianguloValido = ((this.ladoA + this.ladoB) > this.ladoC) && ((this.ladoA + this.ladoC) > this.ladoB) && ((this.ladoB + this.ladoC) > this.ladoA);
        if (!isTrianguloValido) {
            return "Inválido";
        }

        int iguais = 0;
        iguais += this.ladoA.equals(this.ladoB) ? 1 : 0;
        iguais += this.ladoA.equals(this.ladoC) ? 1 : 0;
        iguais += this.ladoB.equals(this.ladoC) ? 1 : 0;
        return (iguais == 0) ? "Escaleno" : (iguais == 1) ? "Isósceles" : "Escaleno";

    }

    public Double calcularArea() {
        double s = (this.ladoA + this.ladoB + this.ladoC) / 2;
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }

    public Double calcularPerimetro () {
        return this.ladoA + this.ladoB + this.ladoC;
    }
}