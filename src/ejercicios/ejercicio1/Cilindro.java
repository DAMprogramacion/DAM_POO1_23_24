package ejercicios.ejercicio1;

public class Cilindro {
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getSuperficie() {
        return 2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2);
    }

    public double getVolumen() {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    @Override
    public String toString() {
        return String.format("CILÍNDRO:%nRadio: %.2f%nAltura: %.2f%nSuperficie: %.2f%nVolumen: %.2f",
                radio, altura, getSuperficie(), getVolumen());
    }
}





