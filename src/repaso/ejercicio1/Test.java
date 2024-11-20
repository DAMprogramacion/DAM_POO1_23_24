package repaso.ejercicio1;

public class Test {
    public static void main(String[] args) {
        CuentaBancaria cb1 = new CuentaBancaria();
        cb1.setDniCliente(12345678);
        cb1.setInteresAnual(2.2);
        cb1.setSaldoActual(1_000);
        System.out.printf("Saldo actual: %.2f%n", cb1.getSaldoActual());
        double saldo = cb1.ingresar(100);
        System.out.printf("Saldo actual: %.2f%n", saldo);
        saldo = cb1.retirar(900);
        System.out.printf("Saldo actual: %.2f%n", saldo);
        saldo = cb1.retirar(900);
        System.out.printf("Saldo actual: %.2f%n", saldo);
        System.out.println("===================");
        System.out.println(cb1);
        System.out.println("******************************");
        CuentaBancaria cb2 = new CuentaBancaria(12345679, 100, 2.1);
        cb2.ingresar(500);
        cb2.actualizarSaldo();
        System.out.println(cb2);
    }
}
