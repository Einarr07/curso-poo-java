package ejercicios.ejercicio2;

/* Construir un programa que permita dirigir el movimiento de un objeto dentro de un tablero y acutualice su posición
* dentro del mismo. Los movimientos posibles son ARRIBA, ABAJO, IZQUIERDA y DERECHA. Tras cada movimiento el programa
* mostrará la nueva dirección elegida y las coordenadas de situación del objeto dentro del tablero*/
public class Objeto {
    private int x; // Coordenada X del objeto en el tablero.
    private int y; // Coordenada Y del objeto en el tablero.

    // Constructor que inicializa las coordenadas del objeto.
    public Objeto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Método para mover el objeto hacia arriba (incrementa la coordenada Y).
    public void moverArriba() {
        y++;
        System.out.println("---------------------------------------------------------");
        System.out.println("Moviendo ARRIBA. Nueva posición: (" + x + ", " + y + ")");
        System.out.println("---------------------------------------------------------");
    }

    // Método para mover el objeto hacia abajo (decrementa la coordenada Y).
    public void moverAbajo() {
        y--;
        System.out.println("---------------------------------------------------------");
        System.out.println("Moviendo ABAJO. Nueva posición: (" + x + ", " + y + ")");
        System.out.println("---------------------------------------------------------");
    }

    // Método para mover el objeto hacia la izquierda (decrementa la coordenada X).
    public void moverIzquierda() {
        x--;
        System.out.println("---------------------------------------------------------");
        System.out.println("Moviendo IZQUIERDA. Nueva posición: (" + x + ", " + y + ")");
        System.out.println("---------------------------------------------------------");
    }

    // Método para mover el objeto hacia la derecha (incrementa la coordenada X).
    public void moverDerecha() {
        x++;
        System.out.println("---------------------------------------------------------");
        System.out.println("Moviendo DERECHA. Nueva posición: (" + x + ", " + y + ")");
        System.out.println("---------------------------------------------------------");
    }

    // Método para mostrar la posición actual del objeto.
    public void mostrarPosicion() {
        System.out.println("----------------------------");
        System.out.println("| Posición actual: (" + x + ", " + y + ")  |");
        System.out.println("----------------------------");
    }
}
