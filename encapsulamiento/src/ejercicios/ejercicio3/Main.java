package ejercicios.ejercicio3;

import java.util.Scanner;

public class Main {

    // Método que encuentra el índice del vehículo más barato dentro de un arreglo de vehículos.
    // Recorre el arreglo y compara los precios para devolver el índice del vehículo con el menor precio.
    public static int indiceCarroMBarato(Vehiculo carros[]) {
        float precio;
        int indice = 0;

        // Se toma el precio del primer vehículo como referencia.
        precio = carros[0].getPrecio();

        // Se recorre el resto del arreglo comparando los precios de los vehículos.
        for (int i = 1; i < carros.length; i++) {
            if (carros[i].getPrecio() < precio) {
                precio = carros[i].getPrecio();  // Actualiza el precio más bajo.
                indice = i;  // Guarda el índice del vehículo con el precio más bajo.
            }
        }
        return indice;  // Retorna el índice del vehículo más barato.
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos, indiceBarato;

        // Se solicita al usuario ingresar el número de vehículos.
        System.out.print("Ingrese la cantidad de vehiculos: ");
        numeroVehiculos = entrada.nextInt();

        // Se crea un arreglo de objetos de la clase Vehiculo con el tamaño especificado por el usuario.
        Vehiculo carros[] = new Vehiculo[numeroVehiculos];

        // Se capturan las características de cada vehículo ingresado por el usuario.
        for (int i = 0; i < carros.length; i++) {
            entrada.nextLine();  // Limpiar el buffer del scanner.
            System.out.println("\nIngrese las características del vehículo " + (i + 1) + ":");
            System.out.print("Ingrese la Marca: ");
            marca = entrada.nextLine();
            System.out.print("Ingrese el Modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Ingrese el Precio: ");
            precio = entrada.nextFloat();

            // Se crea un nuevo objeto Vehiculo con los datos ingresados y se guarda en el arreglo.
            carros[i] = new Vehiculo(marca, modelo, precio);
        }

        // Se obtiene el índice del vehículo más barato.
        indiceBarato = indiceCarroMBarato(carros);

        // Se muestra la información del vehículo más barato.
        System.out.println("\nEl vehículo más barato es: ");
        System.out.println(carros[indiceBarato].mostrarDatos());

        entrada.close();  // Se cierra el scanner para liberar recursos.
    }
}
