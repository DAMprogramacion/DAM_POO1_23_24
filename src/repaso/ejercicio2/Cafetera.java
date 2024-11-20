package repaso.ejercicio2;

public class Cafetera {
    private int capacidadMaxima;
    private int capacidadActual;

    public Cafetera() {
        capacidadMaxima = 1_000;
        capacidadActual = 0;
    }
    public Cafetera(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        capacidadActual = capacidadMaxima;
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
        if (capacidadActual > capacidadMaxima)
            this.capacidadActual = capacidadMaxima;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        if (capacidadActual > capacidadMaxima)
            capacidadActual = capacidadMaxima;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
        if (capacidadActual > capacidadMaxima)
            this.capacidadActual = capacidadMaxima;
    }
    public void llenarCafetera () {
        capacidadActual = capacidadMaxima;
    }

    public void vaciarCafetera () {
        capacidadActual = 0;
    }
    public void agregarCafe (int cantidad) {
        capacidadActual += cantidad;
        if (capacidadActual > capacidadMaxima)
            this.capacidadActual = capacidadMaxima;
    }
    public void servirTaza (int capacidadTaza) {
        capacidadActual -= capacidadTaza;
        if (capacidadActual < 0)
            capacidadActual = 0;

    }





}
