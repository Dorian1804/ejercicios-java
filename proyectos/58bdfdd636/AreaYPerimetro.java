import java.util.Scanner;

public class AreaYPerimetro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Ingresa la figura a calcular:\n 1. Cuadrado\n 2. Circulo\n 3. Triangulo\n 4. Salir");
            int opcion = sc.nextInt();
            double area = 0;
            double perimetro = 0;

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la medida de un lado: ");
                    double lado = sc.nextDouble();
                    area = lado * lado;
                    perimetro = lado * 4;
                    break;
                case 2:
                    System.out.print("Ingresa el radio del circulo: ");
                    double radio = sc.nextDouble();
                    area = Math.PI * (radio * radio);
                    perimetro = radio * 2 * Math.PI;
                    break;
                case 3:
                    System.out.print("Ingresa la medida del primer lado: ");
                    double lado1 = sc.nextDouble();
                    System.out.print("Ingresa la medida del segundo lado: ");
                    double lado2 = sc.nextDouble();
                    System.out.print("Ingresa la medida del tercer lado: ");
                    double lado3 = sc.nextDouble();
                    perimetro = lado1 + lado2 + lado3;
                    double s = perimetro / 2;
                    area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Esa no es una opcion valida");
            }

            if (opcion == 1 || opcion == 2 || opcion == 3) {
                System.out.println("El area de la figura es: " + area + ", y su perimetro es: " + perimetro);
            }
        }
    }
}
