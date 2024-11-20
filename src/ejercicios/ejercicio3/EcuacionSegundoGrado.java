package ejercicios.ejercicio3;

import java.util.Scanner;

/**
 * <p>Record para resolver ecuanciones de segundo grado</p>
 * <p>a · x² + b · x + c = 0</p>
 * @param a valor entero del coeficiente a
 * @param b valor entero del coeficiente b
 * @param c valor entero del coeficiente c
 */
public record EcuacionSegundoGrado(int a, int b, int c) {

    /**
     * Metodo que lee coeficientes enteros, usa un Scanner
     * @return el coeficiente leído
     */
    public static int leerCoeficiente() {
        Scanner scanner = new Scanner(System.in);
        int coeficiente = scanner.nextInt();
    //    scanner.close();
        return coeficiente;
    }

    /**
     * <p>Metodo que nos dice si la ecuación es resolule o no</p>
     * <p>Se resuelve si:</p>
     * <p> b * b - 4 * a * c >= 0</p>
     * @return si es resoluble o no
     */
    public boolean esResoluble() {
        return b * b - 4 * a * c >= 0;
    }

    /**
     * <p>Metodo que nos devuelve un double con el valor de una de las soluciones</p>
     * @return primera solución
     */
    public double resolverX1 () {
        return (-b + Math.sqrt(b * b - 4 * a * c )) / (2 * a);
    }

    /**
     * <p>Metodo que nos devuelve un double con el valor de una de las soluciones</p>
     * @return primera solución
     */
    public double resolverX2 () {
        return (-b - Math.sqrt(b * b - 4 * a * c )) / (2 * a);
    }
    //

    /**
     * Sobreescrituro de metodo toString
     * @return a · x² + b · x + c = 0
     */
    @Override
    public String toString() {
        char signoB = b >= 0 ? '+' : ' ';
        char signoC = c >= 0 ? '+' : ' ';
        return String.format("%d · x² %c %d · x %c %d = 0", a, signoB, b, signoC, c  );
    }
}
