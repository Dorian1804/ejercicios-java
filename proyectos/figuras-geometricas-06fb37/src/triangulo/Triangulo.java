package triangulo;  // Paquete 

import java.util.Scanner;

/**
 *
 * @author doria
 */


public class Triangulo {

    public double base; 
    public double altura;
    public double area;
    public double perimetro;
    Scanner entrada = new Scanner(System.in); // Corregido: se eliminó el error de sintaxis

    // Constructor por defecto
    public Triangulo() {
        base = 0;
        altura = 0;
        area = 0;
        perimetro = 0;
    }

    // Método para calcular el área del triángulo
    public void calcularAr() {
        System.out.println("Ingrese la base:"); // Mensaje para ingresar la base
        base = entrada.nextDouble();   // Se lee el valor de la base
        System.out.println("Ingrese la altura:"); // Mensaje para ingresar la altura
        altura = entrada.nextDouble(); // Se lee el valor de la altura
        area = (base * altura) / 2; // Cálculo del área
        System.out.println("El área es: " + String.format("%.2f", area)); // Se muestra el área con dos decimales
    }

    // Método para calcular el perímetro del triángulo
    public void calcularPer(double lado1, double lado2, double lado3) {
        perimetro = lado1 + lado2 + lado3; // Cálculo del perímetro
        System.out.println("El perímetro es: " + String.format("%.2f", perimetro)); // Se muestra el perímetro con dos decimales
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        Triangulo tri = new Triangulo();
        tri.calcularAr(); // Calcula y muestra el área
        
        // Ejemplo de cálculo del perímetro; se deben proporcionar los valores reales de los lados
        System.out.println("Ingrese el lado 1:"); // Mensaje para ingresar el primer lado
        double lado1 = tri.entrada.nextDouble(); // Se lee el valor del primer lado
        System.out.println("Ingrese el lado 2:"); // Mensaje para ingresar el segundo lado
        double lado2 = tri.entrada.nextDouble(); // Se lee el valor del segundo lado
        System.out.println("Ingrese el lado 3:"); // Mensaje para ingresar el tercer lado
        double lado3 = tri.entrada.nextDouble(); // Se lee el valor del tercer lado
        
        tri.calcularPer(lado1, lado2, lado3); // Calcula y muestra el perímetro
    }
}