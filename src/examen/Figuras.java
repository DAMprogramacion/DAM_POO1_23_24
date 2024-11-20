package examen;

import java.util.Scanner;

public class Figuras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menu = """
                1. Dibujar cuadrados.
                2. Dibujar rectángulos.
                3. Dibujar triángulos.
                4. Salir
                """;

        int opcion = -1;
        do{
            System.out.println(menu);
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    int lado = -1;
                    do {
                        System.out.println("Introduce el lado del cuadrado:");
                        lado = scanner.nextInt();
                    } while (lado < 1);
                    for (int i = 0; i < lado; i++) {
                        for (int j = 0; j < lado; j++) {
                            System.out.printf(" * ");
                        }
                        System.out.println();
                    }
                }
                case 2 -> {
                    int lado1 = -1, lado2 = -1;
                    do {
                        System.out.println("Introduce el lado1 del rectángulo:");
                        lado1 = scanner.nextInt();
                    } while (lado1 < 1);
                    do {
                        System.out.println("Introduce el lado2 del rectángulo:");
                        lado2 = scanner.nextInt();
                    } while (lado2 < 1);
                    for (int i = 0; i < lado1; i++) {
                        for (int j = 0; j < lado2; j++) {
                            System.out.printf(" * ");
                        }
                        System.out.println();
                    }
                }
                case 3 -> {
                    int lado = -1;
                    do {
                        System.out.println("Introduce el lado del cuadrado:");
                        lado = scanner.nextInt();
                    } while (lado < 1);
                    for (int i = 1; i <= lado; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.printf(" * ");
                        }
                        System.out.println();
                    }
                }
                case 4 -> {
                    System.out.println("¡Adios!");
                    scanner.close();
                    return;
                }
                default ->  System.out.println("Opción incorrecta");

            }
        } while (opcion != 4);


    }
}
