package examen;

import java.util.Scanner;

public class CajaRegistradora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int precio = 0;
        do {
            System.out.println("Introduce precio del producto:");
            precio = scanner.nextInt();
        } while (precio < 1);

        int pago = 0;
        do {
            System.out.println("Introduce precio del pago:");
            pago = scanner.nextInt();
            if (pago < precio)
                System.out.println("Esa cantidad es inferior al precio del producto");
            if (pago == precio) {
                System.out.println("Cantidad exacta, no hay devolución");
                return;
            }
        } while (precio > pago);

        int cambio = pago - precio;  //aquí será mayor que cero
        int  billetes100 = cambio / 100;  cambio = cambio % 100;
        System.out.printf("Billetes de 100: %d%n", billetes100);
        if (cambio == 0) return;
        int  billetes50 = cambio / 50;  cambio = cambio % 50;
        System.out.printf("Billetes de 50: %d%n", billetes50);
        if (cambio == 0) return;
        int  billetes20 = cambio / 20;  cambio = cambio % 20;
        System.out.printf("Billetes de 20: %d%n", billetes20);
        if (cambio == 0) return;
        int  billetes10 = cambio / 10;  cambio = cambio % 10;
        System.out.printf("Billetes de 10: %d%n", billetes10);
        if (cambio == 0) return;
        int  billetes5 = cambio / 5;  cambio = cambio % 5;
        System.out.printf("Billetes de 5: %d%n", billetes5);
        if (cambio == 0) return;
        int  monedas2 = cambio / 2;  cambio = cambio % 2;
        System.out.printf("Monedas de 2: %d%n", monedas2);
        if (cambio == 0) return;
        System.out.printf("Monedas de 1: %d%n", cambio);

        scanner.close();



    }
}
