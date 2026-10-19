/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cajadeahorros;

/**
 *
 * @author doria
 */
class CajaDeAhorros {
    private String idTitular;
    private String titular;
    private String domicilio;
    private String telefono;
    protected double saldo;

    // Constructor para inicializar los datos de la cuenta
    public CajaDeAhorros(String idTitular, String titular, String domicilio, String telefono) {
        this.idTitular = idTitular;
        this.titular = titular;
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.saldo = 0.0; // Inicialmente el saldo es 0
    }

    // Método para depositar dinero en la cuenta
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito realizado: " + monto);
        } else {
            System.out.println("El monto debe ser positivo.");
        }
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado: " + monto);
        } else {
            System.out.println("Monto inválido o saldo insuficiente.");
        }
    }

    // Método para mostrar el saldo actual
    public double mostrarSaldo() {
        return saldo;
    }

    // Método para obtener el nombre del titular
    public String getTitular() {
        return titular;
    }
}