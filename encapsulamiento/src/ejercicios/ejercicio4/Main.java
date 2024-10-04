package ejercicios.ejercicio4;

import java.util.Scanner;

public class Main {

    // Método que determina el índice del atleta con el mejor tiempo (ganador de la competencia).
    public static int indiceGanador(Atleta atletas[]) {
        float tiempo;
        int indice = 0;

        // Se toma el tiempo del primer atleta como referencia.
        tiempo = atletas[0].getTiempo();

        // Recorremos el arreglo para encontrar el atleta con el menor tiempo.
        for (int i = 1; i < atletas.length; i++) {
            if (atletas[i].getTiempo() < tiempo) {
                tiempo = atletas[i].getTiempo();  // Actualiza el tiempo más bajo.
                indice = i;  // Guarda el índice del atleta con el mejor tiempo.
            }
        }

        return indice;  // Retorna el índice del atleta ganador.
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, participantes, ganador;
        String nombre;
        float tiempo;

        // Se solicita al usuario que ingrese el número de participantes en la competencia.
        System.out.print("Ingrese la cantidad de participantes: ");
        participantes = entrada.nextInt();

        // Se crea un arreglo de objetos de tipo Atleta, con el tamaño especificado por el usuario.
        Atleta atletas[] = new Atleta[participantes];

        // Se capturan los datos de cada atleta (número, nombre y tiempo).
        for (int i = 0; i < atletas.length; i++) {
            System.out.println("\nIngrese los datos del participante " + (i + 1));
            System.out.print("Número del atleta: ");
            numero = entrada.nextInt();  // Número de atleta.
            entrada.nextLine();  // Limpiar el buffer de entrada.
            System.out.print("Nombre del atleta: ");
            nombre = entrada.nextLine();  // Nombre del atleta.
            System.out.print("Tiempo realizado: ");
            tiempo = entrada.nextFloat();  // Tiempo del atleta.

            // Se crea un nuevo objeto Atleta y se agrega al arreglo.
            atletas[i] = new Atleta(numero, nombre, tiempo);
        }

        // Se obtiene el índice del atleta que tiene el mejor tiempo.
        ganador = indiceGanador(atletas);

        // Se muestran los datos del atleta ganador.
        System.out.println("\nEl ganador de la competencia es: ");
        System.out.println(atletas[ganador].mostrarGanador());

        entrada.close();  // Cerramos el Scanner para liberar recursos.
    }
}
