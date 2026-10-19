/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajador; // Paquete donde se encuentra la clase

public class Administrativo extends Trabajador { // Extiende la clase padre Trabajador
    private String grado; // Grado del administrativo
    private String documento; // Documento del administrativo

    // Constructor
    public Administrativo() {
        super(); // Llamada al constructor de la clase padre (opcional)
        this.grado = "licenciatura"; // Asignación en el constructor
        this.documento = "carta de pasante"; // Asignación en el constructor
    }

    // Método para mostrar los datos del administrativo
    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); // Muestra los datos heredados de Trabajador
        System.out.println("Grado: " + grado);
        System.out.println("Documento: " + documento);
    }
}
