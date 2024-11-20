package ejercicios.ejercicio3;

public class Test {
    public static void main(String[] args) {

        int a = 0, b, c;
        //leer coeficiente a hasta que sea distinto de cero
        while (a == 0) {
            System.out.println("Introduce coeficiente a (distinto de cero)");
            a = EcuacionSegundoGrado.leerCoeficiente();
        }
        //leer coeficiente b
        System.out.println("Introduce coeficiente b");
        b = EcuacionSegundoGrado.leerCoeficiente();
        //leer coeficiente c
        System.out.println("Introduce coeficiente c");
        c = EcuacionSegundoGrado.leerCoeficiente();

        EcuacionSegundoGrado esg = new EcuacionSegundoGrado(a, b, c);
        //mostrar la ecuación
        System.out.println(esg);

        //tenemos que ver si se puede resolver o no
        if (!esg.esResoluble())
            System.out.println("ecuación no resoluble");
        //si no se resuelve lo decimos: ecuación no resoluble
        //si se resuelve:
        //si x1 = x2 decimos que la solución es x = lo que sea
        //si no x1 = lo que sea
        else {
            double x1 = esg.resolverX1();
            double x2 = esg.resolverX1();
            if (x1 == x2)
                System.out.printf("x = %.2f%n", x1);
            else {
                System.out.printf("x1 = %.2fn", x1);
                System.out.printf("x2 = %.2f%n", x2);
            }
        }
        //      x2 = lo que sea
    }
}
