package ejercicios.ejercicio4;

/*Construir un programa para una competencia de atletismo, el programa debe gestionar una serie de atletas
* caracterizados por su número de atleta, nombre y tiempo de carrera, al final el programa debe mostrar los
* datos del atleta ganador de lar carrera*/
public class Atleta {
    // Atributos privados: Cada atleta tiene un número, un nombre y un tiempo de carrera.
    private int numero;
    private String nombre;
    private float tiempo;

    // Constructor: Inicializa los atributos de cada atleta (número, nombre y tiempo).
    public Atleta(int numero, String nombre, float tiempo) {
        this.numero = numero;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    // Método Getter: Devuelve el tiempo realizado por el atleta.
    public float getTiempo() {
        return tiempo;
    }

    // Método que muestra los detalles del atleta que ganó la carrera.
    public String mostrarGanador() {
        return "Número: " + numero + "\nNombre: " + nombre + "\nTiempo: " + tiempo;
    }
}
