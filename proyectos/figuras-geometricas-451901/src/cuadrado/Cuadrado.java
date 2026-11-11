package figura;

/**
 * Clase Figura que representa una figura geométrica con base y altura.
 */
public class Figura {
    public double base;
    public double altura;
    public double area;

    // Constructor por defecto
    public Figura() {
        base = 0;
        altura = 0;
    }

    // Constructor con parámetros
    public Figura(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Método para calcular el área y determinar el tipo de figura
    public void calcularArea() {
        area = base * altura;
        if (base == altura) {
            System.out.println("La figura es un cuadrado");
        } else {
            System.out.println("La figura es un rectángulo");
        }
        System.out.println("El área es: " + area);
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        Figura figura1 = new Figura(); // Creación del objeto usando el constructor por defecto
        Figura figura2 = new Figura(15.2, 15.1); // Creación del objeto con parámetros

        figura2.calcularArea(); // Llamada al método para calcular el área y determinar el tipo de figura
    }
}
