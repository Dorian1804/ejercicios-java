/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author doria
 */
import java.util.Scanner;

// Clase principal que contiene el menú y las operaciones
public class CajaDeAhorrosConMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los datos del usuario antes de mostrar el menú
        System.out.println("Ingrese los datos de la cuenta de ahorros:");
        System.out.print("ID del titular: ");
        String idTitular1 = scanner.nextLine();
        System.out.print("Nombre del titular: ");
        String titular1 = scanner.nextLine();
        System.out.print("Domicilio: ");
        String domicilio1 = scanner.nextLine();
        System.out.print("Teléfono: ");
        String telefono1 = scanner.nextLine();

        // Crear una cuenta de ahorro sin interés
        CajaDeAhorros cuenta1 = new CajaDeAhorros(idTitular1, titular1, domicilio1, telefono1);

        // Solicitar la tasa de interés para la cuenta con interés
        System.out.print("Ingrese la tasa de interés anual para la cuenta con interés (%): ");
        double tasaDeInteres = scanner.nextDouble();
        // Crear una cuenta de ahorro con interés
        CajaDeAhorrosConInteres cuenta2 = new CajaDeAhorrosConInteres(idTitular1, titular1, domicilio1, telefono1, tasaDeInteres);

        // Bucle para el menú de opciones
        boolean salir = false;
        while (!salir) {
            // Mostrar el menú de opciones
            System.out.println("\nMenú:");
            System.out.println("1 - Depositar saldo");
            System.out.println("2 - Retirar saldo");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            // Evaluar la opción seleccionada
            switch (opcion) {
                case 1:
                    // Opción para depositar dinero
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDeposito = scanner.nextDouble();
                    cuenta1.depositar(montoDeposito);
                    cuenta2.depositar(montoDeposito); // Se deposita también en la cuenta con intereses
                    break;
                case 2:
                    // Opción para retirar dinero
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetiro = scanner.nextDouble();
                    cuenta1.retirar(montoRetiro);
                    cuenta2.retirar(montoRetiro); // Se retira también de la cuenta con intereses
                    break;
                case 3:
                    // Opción para consultar saldos e intereses
                    System.out.println("\nResumen de la cuenta de ahorros:");
                    System.out.println("Titular: " + cuenta1.getTitular());
                    System.out.println("Saldo actual: " + cuenta1.mostrarSaldo());

                    System.out.println("\nResumen de la cuenta de ahorros con interés:");
                    System.out.println("Titular: " + cuenta2.getTitular());
                    System.out.println("Saldo actual (sin intereses): " + cuenta2.mostrarSaldo());
                    System.out.println("Intereses generados: " + cuenta2.mostrarIntereses());
                    System.out.println("Saldo final (con intereses): " + cuenta2.mostrarSaldoConInteres());
                    break;
                case 4:
                    // Opción para salir del menú
                    salir = true;
                    break;
                default:
                    // Manejo de opciones no válidas
                    System.out.println("Opción no válida, por favor intente nuevamente.");
            }
        }

        // Mensaje de despedida al salir del menú
        System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
        scanner.close(); // Cerrar el scanner al finalizar
 }
}