/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author doria
 */
// Clase que extiende CajaDeAhorros, añadiendo intereses
public class CajaDeAhorrosConInteres extends CajaDeAhorros {
    // Atributo adicional
    private double tasaDeInteres;

    // Constructor
    public CajaDeAhorrosConInteres(int idTitular, String titular, String domicilio, String telefono, double saldo, double tasaDeInteres) {
        super(idTitular, titular, domicilio, telefono, saldo);
        this.tasaDeInteres = tasaDeInteres;
    }

    // Método para calcular y mostrar intereses generados
    public void calcularIntereses() {
        double interesesGenerados = mostrarSaldo() * (tasaDeInteres / 100);
        System.out.println("Intereses generados: " + interesesGenerados);
    }
}