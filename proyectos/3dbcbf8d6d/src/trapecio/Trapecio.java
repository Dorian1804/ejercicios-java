 package trapecio; // Paquete


author dorian 
/**
 * Clase principal para representar un trapecio.
 * Calcula el perímetro del trapecio y determina sus propiedades.
 */
public class Trapecio {

    // Atributos privados
    private double baseMayor;
    private double baseMenor;
    private double lado1;
    private double lado2;
    private double perimetro;

    // Constructor por defecto
    public Trapecio() {
        this.baseMayor = 0;
        this.baseMenor = 0;
        this.lado1 = 0;
        this.lado2 = 0;
    }

    // Constructor con parámetros
    public Trapecio(double baseMayor, double baseMenor, double lado1, double lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.lado1 = lado1;
        this.lado2 = lado2;
        calcularPerimetro(); // Calcular el perímetro al inicializar
    }

    // Métodos getters y setters
    public double getBaseMayor() {
        return baseMayor;
    }

    public void setBaseMayor(double baseMayor) {
        this.baseMayor = baseMayor;
        calcularPerimetro(); // Recalcular el perímetro si la base mayor cambia
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
        calcularPerimetro(); // Recalcular el perímetro si la base menor cambia
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
        calcularPerimetro(); // Recalcular el perímetro si el lado 1 cambia
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
        calcularPerimetro(); // Recalcular el perímetro si el lado 2 cambia
    }

    public double getPerimetro() {
        return perimetro;
    }

    // Método privado para calcular el perímetro del trapecio
    private void calcularPerimetro() {
        this.perimetro = baseMayor + baseMenor + lado1 + lado2;
    }

    // Método para mostrar el perímetro
    public void mostrarResultados() {
        System.out.println("El perímetro del trapecio es: " + perimetro);
    }

    // Método principal para ejecutar el programa
    public static void main(String[] args) {
        Trapecio trapecio = new Trapecio(10.0, 6.0, 5.0, 7.0); // Crear objeto con parámetros específicos
        trapecio.mostrarResultados(); // Mostrar el perímetro

        // Ejemplo de uso con el constructor por defecto y setters
        Trapecio trapecioDefecto = new Trapecio();
        trapecioDefecto.setBaseMayor(8.0);
        trapecioDefecto.setBaseMenor(4.0);
        trapecioDefecto.setLado1(6.0);
        trapecioDefecto.setLado2(5.0);
        trapecioDefecto.mostrarResultados(); // Mostrar el perímetro
    }
}