import br.edu.unoesc.prog2.smith.geo.*;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica[] formas = new FormaGeometrica[] {
                new Retangulo(2.0,3.0),
                new Triangulo(2.0,3.0,2.0),
                new Circulo(2.0)
        };

        for (FormaGeometrica forma : formas) {
            System.out.println("\nNome: " + forma.getNome());
            System.out.println("Tipo: " + (forma instanceof FormaClassificavel fc ? fc.getTipo() : "Não aplicável"));
            System.out.println("Quantidade de lados: " + (forma instanceof FormaPoligono fp ? fp.getQuantidadeLados() : "Não aplicável"));
            System.out.println("Área: " + forma.calcularArea());
            System.out.println("Perímetro: " + forma.calcularPerimetro());
        }
    }
}