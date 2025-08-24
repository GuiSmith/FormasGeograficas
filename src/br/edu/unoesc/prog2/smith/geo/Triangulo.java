package br.edu.unoesc.prog2.smith.geo;

public class Triangulo extends FormaGeometrica implements FormaClassificavel,FormaPoligono {
    private final int quantidadeLados = 3;
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
        this.setNome("Triângulo");
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }
    public double getLadoA() {
        return this.ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }
    public double getLadoB() {
        return this.ladoB;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    public double getLadoC() {
        return this.ladoC;
    }

    public String getTipo() {

        boolean isTrianguloValido = ((this.ladoA + this.ladoB) > this.ladoC) && ((this.ladoA + this.ladoC) > this.ladoB) && ((this.ladoB + this.ladoC) > this.ladoA);
        if (!isTrianguloValido) {
            return "Inválido";
        }

        int iguais = 0;
        iguais += this.ladoA == this.ladoB ? 1 : 0;
        iguais += this.ladoA == this.ladoC ? 1 : 0;
        iguais += this.ladoB == this.ladoC ? 1 : 0;
        return (iguais == 0) ? "Escaleno" : (iguais == 1) ? "Isósceles" : "Equilátero";

    }

    public int getQuantidadeLados() {
        return this.quantidadeLados;
    }

    public double calcularArea() {
        double s = (this.ladoA + this.ladoB + this.ladoC) / 2;
        return Math.sqrt(s * (s - this.ladoA) * (s - this.ladoB) * (s - this.ladoC));
    }

    public double calcularPerimetro () {
        return this.ladoA + this.ladoB + this.ladoC;
    }
}