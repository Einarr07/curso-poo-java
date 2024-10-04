package ejercicios.ejercicio2;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Se inicializa un objeto de la clase "Objeto" en la posición (0, 0).
        Objeto carrito = new Objeto(0, 0);
        String comando; // Variable para almacenar el comando del usuario.

        System.out.println("Iniciando el objeto en la posición (0, 0)");

        // Bucle que permite que el usuario ingrese comandos hasta que elija salir.
        do {
            // Se solicita al usuario que ingrese un comando para mover el objeto.
            comando = JOptionPane.showInputDialog("Ingresa el movimiento (ARRIBA, ABAJO, IZQUIERDA, DERECHA) o " +
                    "ingresa SALIR para finalizar el programa: ").toUpperCase();

            // Se evalúa el comando ingresado por el usuario.
            switch (comando) {
                case "ARRIBA":
                    carrito.moverArriba(); // Mueve el objeto hacia arriba.
                    break;
                case "ABAJO":
                    carrito.moverAbajo(); // Mueve el objeto hacia abajo.
                    break;
                case "IZQUIERDA":
                    carrito.moverIzquierda(); // Mueve el objeto hacia la izquierda.
                    break;
                case "DERECHA":
                    carrito.moverDerecha(); // Mueve el objeto hacia la derecha.
                    break;
                case "SALIR":
                    System.out.println("Saliendo del programa"); // Mensaje cuando el usuario elige salir.
                    break;
                default:
                    System.out.println("Comando no válido"); // Mensaje si el usuario ingresa un comando incorrecto.
            }
            // Se muestra la nueva posición del objeto después de cada comando.
            carrito.mostrarPosicion();
        } while (!comando.equals("SALIR")); // El bucle termina cuando el usuario ingresa "SALIR".

        entrada.close(); // Se cierra el scanner para liberar los recursos.
    }
}
