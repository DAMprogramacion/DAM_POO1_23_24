package ejercicios.ejercicio2;

public class Test {
    public static void main(String[] args) {
        TrianguloRectangulo trianguloRectangulo = new TrianguloRectangulo(3, 3);
        System.out.printf("Triángulo rectángulo de catetos %d y %d%n",
                trianguloRectangulo.cateto1(), trianguloRectangulo.cateto2());
        System.out.printf("Hipotenusa: %.2f%n", trianguloRectangulo.calcularHipotenusa());
        System.out.printf("Perímetro: %.2f%n", trianguloRectangulo.calcularPerimetro());
        System.out.printf("Área: %.2f%n", trianguloRectangulo.calcularArea());
        System.out.println("============================================");
        System.out.println(trianguloRectangulo);
    }
}
