package CalculadoraIMC;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Persona {

    private float peso;
    private float estatura;

    // Constructor que inicializa el peso y la estatura
    public Persona(float peso, float estatura) {
        this.peso = peso;
        this.estatura = estatura;
    }

    // Método para calcular el IMC
    public float calcularIMC() {
        if (estatura <= 0) {
            System.out.println("Error: La estatura debe ser un valor mayor que 0.");
            return -1; // Indica un error
        }
        return peso / (estatura * estatura); // Fórmula del IMC
    }

    // Método para determinar el estado de peso según el IMC
    public String determinarEstadoPeso(float imc) {
        if (imc < 0) {
            return "Error: No se ha calculado el IMC. Verifique los valores ingresados.";
        }

        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Saludable";
        } else if (imc >= 25 && imc <= 29.9) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }

    // Método para obtener datos de entrada del usuario
    private static float obtenerDato(Scanner entrada, String tipo) {
        float dato = -1;
        boolean entradaValida = false;

        while (!entradaValida) {
            try {
                System.out.print("Ingrese su " + tipo + ": ");
                dato = entrada.nextFloat();
                if (dato <= 0) {
                    System.out.println("Error: " + tipo + " debe ser un valor mayor que 0.");
                } else {
                    entradaValida = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Entrada no válida. Asegúrese de ingresar un número.");
                entrada.next(); // Limpiar el buffer
            }
        }
        return dato;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Obtener el peso y la estatura
        float peso = obtenerDato(entrada, "peso en kilogramos");
        float estatura = obtenerDato(entrada, "estatura en metros");

        // Crear una instancia de la clase Persona
        Persona persona = new Persona(peso, estatura);

        // Calcular el IMC
        float imc = persona.calcularIMC();
        // Determinar el estado de peso
        String estadoPeso = persona.determinarEstadoPeso(imc);

        // Mostrar el resultado
        System.out.printf("Su IMC es: %.2f - Estado: %s%n", imc, estadoPeso);

        entrada.close(); // Cerrar el Scanner
    }
}
