package promedio;

import java.util.Scanner;

public class Promedio {

     private float suma;  // Declaración de variables
    private float prom;
    private Scanner entrada;

    // Constructor
    public Promedio() {
        suma = 0;
        prom = 0;
        entrada = new Scanner(System.in); // Scanner para la entrada de datos
    }

    public void calcularP() {
        System.out.print("¿Cuántos números quieres promediar? ");
        int n = entrada.nextInt();  // Tamaño del arreglo
        float[] numeros = new float[n];  // Declaración de arreglo para n números

        System.out.println("Introduce " + n + " números:");
        for (int cont = 0; cont < n; cont++) {
            while (true) {
                System.out.print("Número " + (cont + 1) + ": ");
                if (entrada.hasNextFloat()) {
                    numeros[cont] = entrada.nextFloat();
                    suma += numeros[cont];
                    break;  // Salir del bucle si la entrada es válida
                } else {
                    System.out.println("Por favor, introduce un número válido.");
                    entrada.next();  // Limpiar entrada no válida
                }
            }
        }

        prom = suma / n;  // Calcula el promedio
        System.out.println("El promedio es " + prom);
    }

    public static void main(String[] args) {
        Promedio p = new Promedio();  // Instancia de la clase Promedio
        p.calcularP();
    }
}