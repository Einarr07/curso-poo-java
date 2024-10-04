package ejercicios.ejercicio5;

import java.util.Scanner;

public class Main {

    // Método que encuentra el área del triángulo con la mayor superficie en un arreglo de triángulos.
    public static double mayorArea(TrianguloIsosceles triangulos[]) {
        double area;

        // Se toma el área del primer triángulo como referencia.
        area = triangulos[0].obtenerArea();

        // Se recorre el arreglo para comparar las áreas de los triángulos.
        for (int i = 1; i < triangulos.length; i++) {
            if (triangulos[i].obtenerArea() > area) {
                area = triangulos[i].obtenerArea();  // Actualiza el área mayor encontrada.
            }
        }

        return area;  // Retorna el área del triángulo de mayor superficie.
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base, lado;
        int nTriangulos;

        // Se solicita al usuario que ingrese la cantidad de triángulos.
        System.out.print("Ingrese la cantidad de triángulos: ");
        nTriangulos = entrada.nextInt();

        // Se crea un arreglo de objetos de tipo TriánguloIsósceles de tamaño especificado.
        TrianguloIsosceles triangulos[] = new TrianguloIsosceles[nTriangulos];

        // Se capturan los datos de cada triángulo ingresado por el usuario.
        for (int i = 0; i < triangulos.length; i++) {
            System.out.println("\nIngrese los valores del triángulo " + (i + 1) + ":");
            System.out.print("Introduzca la base: ");
            base = entrada.nextDouble();  // Captura la base del triángulo.
            System.out.print("Introduzca el lado: ");
            lado = entrada.nextDouble();  // Captura el lado igual del triángulo.

            // Se crea un nuevo objeto TrianguloIsosceles y se guarda en el arreglo.
            triangulos[i] = new TrianguloIsosceles(base, lado);

            // Muestra el perímetro y el área del triángulo ingresado.
            System.out.println("El perímetro del triángulo es: " + triangulos[i].obtenerPerimetro());
            System.out.println("El área del triángulo es: " + triangulos[i].obtenerArea());
        }

        // Se encuentra y muestra el área del triángulo con mayor superficie.
        System.out.println("\nEl área del triángulo de mayor superficie es: " + mayorArea(triangulos));

        entrada.close();  // Cierra el objeto Scanner para liberar recursos.
    }
}
