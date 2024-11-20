package ejercicios.ejercicio2;

public record TrianguloRectangulo(int cateto1, int cateto2) {
    public double calcularHipotenusa() {
        return Math.hypot(cateto1, cateto2);
    }
    public double calcularPerimetro() {
        return cateto1 + cateto2 + calcularHipotenusa();
    }
    public double calcularArea() {
        return cateto1 * cateto2 / 2.0;
    }
    /*Triángulo rectángulo de catetos 3 y 3
      Hipotenusa: 4,24
      Perímetro: 10,24
      Área: 4,50*/

    @Override
    public String toString() {
        return String.format("TrianguloRectangulo de catetos %d y %d%n" +
                "Hipotenusa: %.2f%n" +
                "Perímetro: %.2f%n" +
                "Área: %.2f",
                cateto1, cateto2, calcularHipotenusa(), calcularPerimetro(), calcularArea());
    }
}
