package br.edu.unoesc.prog2.smith.geo;

public abstract class FormaGeometrica implements Forma {
    private String nome;
    private String cor;

    public void setNome (String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor(){
        return this.cor;
    }

    public abstract Double calcularArea();
    public abstract Double calcularPerimetro();
}
