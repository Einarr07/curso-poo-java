import java.util.ArrayList;
import java.util.Scanner;

/*
 * Hacer un programa para calcular el área de Polígonos (Triángulos y Rectángulos) el programa debe ser capaz de
 * almacenar un arreglo N triángulos y rectángulos, al final mostrar el área y los datos de cada uno. Para ello
 * se tredra la siguiente:
 *
 * - Una super clase llamda Poígono
 * - Una sub clase llamada Triángulo
 * - Una sub clase llamda Rectángulo*/
public class Main {
    static ArrayList<Poligono> poligonos = new ArrayList<>();  // Arreglo dinámico para almacenar polígonos
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // Llenar un polígono
        llenarPoligono();

        // Mostrar los datos y el área de cada polígono
        mostrarResultados();
    }

    // Método para llenar la lista de polígonos (triángulos o rectángulos)
    public static void llenarPoligono() {
        int op;
        char respuesta;
        do {
            do {
                System.out.println("Ingrese qué polígono desea:");
                System.out.println("1. Triángulo");
                System.out.println("2. Rectángulo");
                System.out.print("Opción: ");
                op = entrada.nextInt();
            } while (op < 1 || op > 2);

            // Dependiendo de la opción, se llama a los métodos para llenar un triángulo o rectángulo
            switch (op) {
                case 1:  // Llenar un triángulo
                    llenarTriangulo();
                    break;
                case 2:  // Llenar un rectángulo
                    llenarRectangulo();
                    break;
            }
            System.out.println("\n¿Desea introducir otro polígono? (s/n)");
            respuesta = entrada.next().toUpperCase().charAt(0);
        } while (respuesta == 'S');  // Repetir hasta que el usuario no quiera agregar más polígonos
    }

    // Método para llenar los datos de un triángulo
    public static void llenarTriangulo() {
        double lado1, lado2, lado3;

        System.out.print("\nIngrese el lado 1 del triángulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Ingrese el lado 2 del triángulo: ");
        lado2 = entrada.nextDouble();
        System.out.print("Ingrese el lado 3 del triángulo: ");
        lado3 = entrada.nextDouble();

        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);  // Crear un nuevo triángulo
        poligonos.add(triangulo);  // Añadir el triángulo al arreglo de polígonos
    }

    // Método para llenar los datos de un rectángulo
    public static void llenarRectangulo() {
        double lado1, lado2;

        System.out.print("\nIngrese el lado 1 del rectángulo: ");
        lado1 = entrada.nextDouble();
        System.out.print("Ingrese el lado 2 del rectángulo: ");
        lado2 = entrada.nextDouble();

        Rectangulo rectangulo = new Rectangulo(lado1, lado2);  // Crear un nuevo rectángulo
        poligonos.add(rectangulo);  // Añadir el rectángulo al arreglo de polígonos
    }

    // Método para mostrar los resultados: los datos y el área de cada polígono
    public static void mostrarResultados() {
        // Recorrer el arreglo de polígonos y mostrar los datos y el área de cada uno
        for (Poligono poli : poligonos) {
            System.out.println(poli.toString());  // Mostrar los datos del polígono
            System.out.println("Área = " + poli.Area());  // Mostrar el área calculada
            System.out.println();
        }
    }
}