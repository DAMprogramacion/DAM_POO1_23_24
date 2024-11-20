package repaso.ejercicio1;

public class CuentaBancaria {
    private static long numeroCuenta = 100000;
    //atributos
    private long dniCliente;
    private double saldoActual;
    private double interesAnual;
    //constructores
    public CuentaBancaria() {
        numeroCuenta++;
    }
    public CuentaBancaria(long dniCliente, double saldoActual, double interesAnual) {
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
        this.interesAnual = interesAnual;
        numeroCuenta++;
    }
    //getters
    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }
    //setters
    public double getInteresAnual() {
        return interesAnual;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public void setInteresAnual(double interesAnual) {
        this.interesAnual = interesAnual;
    }
    //metodo actualizar el saldo: si saldo 50 e interés 2%: nuevo saldo 50 + 50 * 2 / 100
    public void actualizarSaldo() {
        saldoActual = saldoActual + saldoActual * (interesAnual / 100);
        // saldoActual += saldoActual * interesAnual / 100;
    }
    //devuelve el nuevo saldo actual
    public double ingresar (double cantidad) {
        saldoActual += cantidad;
        return saldoActual;
    }
    //devuelve el saldo actual, si superamos el saldo, no se retiara
    public double retirar(double cantidad) {
        if (cantidad > saldoActual)
            System.out.println("Saldo insuficiente");
        else
            saldoActual -= cantidad;
        return saldoActual;
    }

    @Override
    public String toString() {
        return String.format("CuentaBancaria nº %d%n" +
                        "DNI cliente: %d%n" +
                        "Saldo actual: %.2f%n",
                numeroCuenta, dniCliente, saldoActual );
    }
}
