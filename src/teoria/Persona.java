package teoria;

/**
 *
 */
public class Persona {
    private String nombreCompleto;
    private float altura;
    private float peso;
    private int edad;

    /**
     *
     * @param nombreCompleto
     * @param altura
     * @param peso
     * @param edad
     */
    public Persona(String nombreCompleto, float altura, float peso, int edad) {
        this.nombreCompleto = nombreCompleto;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
    }

    /**
     *
     */
    public Persona() {
    }

    /**
     *
     * @return
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     *
     * @param nombreCompleto
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     *
     * @return
     */
    public float getAltura() {
        return altura;
    }

    /**
     *
     * @param altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     *
     * @return
     */
    public float getPeso() {
        return peso;
    }

    /**
     *
     * @param peso
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     *
     * @return
     */
    public int getEdad() {
        return edad;
    }

    /**
     *
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return String.format("Nonbre: %S%nEdad: %d%nPeso: %.2f%nAltura: %.2f",
                nombreCompleto, edad, peso, altura );
    }
}
