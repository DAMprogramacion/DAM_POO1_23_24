package ejercicios.ejercicios4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce valor del coeficiente a");
        int a = sc.nextInt();
        System.out.println("Introduce valor del coeficiente b");
        int b = sc.nextInt();
        System.out.println("Introduce valor del coeficiente c");
        int c = sc.nextInt();
        System.out.println("Introduce valor del coeficiente d");
        int d = sc.nextInt();
        System.out.println("Introduce valor del coeficiente e");
        int e = sc.nextInt();
        System.out.println("Introduce valor del coeficiente f");
        int f = sc.nextInt();
        sc.close();
        SistemaEcuaciones se1 = new SistemaEcuaciones(a, b, c, d, e, f);
        if (!se1.esResoluble()) {
            System.out.println("Sistema no resoluble");
            return;
        }
        System.out.println(se1);







    }
}
