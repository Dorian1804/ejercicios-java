/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajador; // Paquete donde se encuentra la clase

public class Docente extends Trabajador { // Extiende la clase padre Trabajador
    private int añoTitulo; // Año en que se obtuvo el título
    private int cedula; // Cédula del docente
    public String carrera; // Carrera que imparte

    // Constructor
    public Docente(int añoT, int ced, String carr) {
        super(); // Llamada al constructor de la clase padre (opcional)
        this.añoTitulo = añoT; // Asignación del año del título
        this.cedula = ced; // Asignación de la cédula
        this.carrera = carr; // Asignación de la carrera
    }

    // Método para mostrar los datos del docente
    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); // Muestra los datos heredados de Trabajador
        System.out.println("Año de Título: " + añoTitulo);
        System.out.println("Cédula: " + cedula);
        System.out.println("Carrera: " + carrera);
    }
}
