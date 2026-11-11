
import java.util.Scanner;

public class Persona {

    public float peso;
    public float estatura;
    public float imc;

    // Constructor que inicializa el peso y la estatura
    public Persona(float peso, float estatura) {
        this.peso = peso;
        this.estatura = estatura;
        this.imc = 0;
    }

    // Método para calcular el IMC
    public void calcularIMC() {
        if (estatura <= 0) {
            System.out.println("Error: La estatura debe ser un valor mayor que 0.");
            return;
        }
        imc = peso / (estatura * estatura); // Fórmula del IMC
    }

    // Método para determinar el estado de peso según el IMC
    public void mostrarEstadoPeso() {
        if (imc == 0) {
            System.out.println("Error: No se ha calculado el IMC. Verifique los valores ingresados.");
        } else if (imc < 18.5) {
            System.out.println("Su IMC es " + imc + ": está en bajo peso.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Su IMC es " + imc + ": saludable.");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Su IMC es " + imc + ": tiene sobrepeso.");
        } else if (imc >= 30) {
            System.out.println("Su IMC es " + imc + ": tiene obesidad.");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        try {
            // Pedir al usuario que introduzca su peso y estatura
            System.out.println("Ingrese su peso en kilogramos:");
            float peso = entrada.nextFloat();

            System.out.println("Ingrese su estatura en metros:");
            float estatura = entrada.nextFloat();

            // Crear una instancia de la clase Persona usando el constructor
            Persona persona = new Persona(peso, estatura);

            // Calcular el IMC y mostrar el estado de peso
            persona.calcularIMC();
            persona.mostrarEstadoPeso();
        } catch (Exception e) {
            System.out.println("Error: Entrada no válida. Asegúrese de ingresar números correctamente.");
        }
    }
}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
