package Objetos;

public class CuentaBancaria {
    // Atributos
    private String nombre;
    private String apellido;
    private String iban;
    private double saldo;

    // Constructor con saldo inicial 0
    public CuentaBancaria(String nombre, String apellido, String iban) throws IllegalArgumentException {
        if (iban == null || iban.trim().length() != 24) {
            throw new IllegalArgumentException("El IBAN debe tener exactamente 24 caracteres.");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.iban = iban;
        this.saldo = 0; // Saldo inicial en 0
    }

    // Constructor con saldo inicial definido
    public CuentaBancaria(String nombre, String apellido, String iban, double saldo) throws IllegalArgumentException {
        if (iban == null || iban.trim().length() != 24) {
            throw new IllegalArgumentException("El IBAN debe tener exactamente 24 caracteres.");
        }
        if (saldo < 0) {
            throw new IllegalArgumentException("El saldo no puede ser negativo.");
        }
        this.nombre = nombre;
        this.apellido = apellido;
        this.iban = iban;
        this.saldo = saldo;
    }

    // Métodos
    public void retirar(double cantidad) throws IllegalArgumentException {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("La cantidad a retirar debe ser positiva.");
        }
        if (cantidad > this.saldo) {
            throw new IllegalArgumentException("No puedes retirar más saldo del que tienes.");
        }
        this.saldo -= cantidad;
    }

    public void ingresar(double cantidad) throws IllegalArgumentException {
        if (cantidad <= 0) {
            throw new IllegalArgumentException("No puedes ingresar una cantidad negativa o cero.");
        }
        this.saldo += cantidad;
    }

    public double getSaldo() {
        return saldo;
    }
}