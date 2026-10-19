package cajadeahorros;
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author doria
 */

import java.util.Scanner;
public class CajaDeAhorros {
    // Atributos privados
    private String idTitular;
    public String titular;
    private String domicilio;
    private String telefono;  
    protected float saldo;
    
    // Constructor de la clase
    public CajaDeAhorros(String idTitular, String titular, String domicilio, String telefono, float saldoInicial) {
        this.idTitular = idTitular;
        this.titular = titular;
        this.domicilio = domicilio;
        this.telefono = telefono; 
        this.saldo = saldoInicial;
    }

    // Métodos de la clase
    public void depositar(float cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se han depositado " + cantidad + ". El nuevo saldo es " + saldo);
        } else {
            System.out.println("El monto a depositar debe ser positivo.");
        }
    }

    public void retirar(float cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se han retirado " + cantidad + ". El nuevo saldo es " + saldo);
        } else {
            System.out.println("Fondos insuficientes o cantidad no válida.");
        }
    }
    
    public void mostrarSaldo() {
        System.out.println("El saldo actual es: " + saldo);
    }

    public String getTitular() {
        return titular;
    }
}
    // Programa principal
 public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Seleccione el tipo de cuenta a crear:");
        System.out.println("1. Cuenta de Ahorros Básica");
        System.out.println("2. Cuenta de Ahorros con Interés");
        int tipoCuenta = entrada.nextInt();
        entrada.nextLine();
        
        System.out.println("Ingrese el ID del titular: ");
        String idTitular = entrada.nextLine();
        
        System.out.println("Ingrese el nombre del titular: ");
        String titular = entrada.nextLine();
        
        System.out.println("Ingrese el domicilio del titular: ");
        String domicilio = entrada.nextLine();
        
        System.out.println("Ingrese el teléfono del titular: ");
        String telefono = entrada.nextLine();
        
        System.out.println("Ingrese el saldo inicial: ");
        float saldoInicial = entrada.nextFloat();

        CajaDeAhorros cuenta;
        if (tipoCuenta == 1) {
            cuenta = new CajaDeAhorros(idTitular, titular, domicilio, telefono, saldoInicial);
        } else if (tipoCuenta == 2) {
            System.out.println("Ingrese la tasa de interés anual: ");
            float tasaDeInteres = entrada.nextFloat();
            cuenta = new CajaDeAhorrosConInteres(idTitular, titular, domicilio, telefono, saldoInicial, tasaDeInteres);
        } else {
            System.out.println("Opción no válida.");
            entrada.close();
            return;
        }

        boolean continuar = true;
        while (continuar) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Depositar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Mostrar saldo");
            System.out.println("4. Mostrar saldo con intereses (si aplica)");
            System.out.println("5. Salir");

            int opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad a depositar: ");
                    float cantidadDeposito = entrada.nextFloat();
                    cuenta.depositar(cantidadDeposito);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a retirar: ");
                    float cantidadRetiro = entrada.nextFloat();
                    cuenta.retirar(cantidadRetiro);
                    break;
                case 3:
                    cuenta.mostrarSaldo();
                    break;
                case 4:
                    if (cuenta instanceof CajaDeAhorrosConInteres) {
                        ((CajaDeAhorrosConInteres) cuenta).mostrarSaldoConIntereses();
                    } else {
                        System.out.println("Esta cuenta no genera intereses.");
                    }
                    break;
                case 5:
                    continuar = false;
                    System.out.println("Gracias por usar nuestros servicios.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
        entrada.close();
    }
}