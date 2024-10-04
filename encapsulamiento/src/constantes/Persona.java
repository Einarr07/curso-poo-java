package constantes;

public class Persona {

    // La palabra reservada "final" se utiliza para crear constantes en Java.
    // Una variable marcada como "final" no puede cambiar su valor una vez que ha sido inicializada.
    private final String nombre;

    // Este atributo no es constante, por lo que puede ser modificado a lo largo del ciclo de vida del objeto.
    private int edad;

    // Constructor de la clase Persona.
    // El parámetro "nombre" es asignado al atributo "nombre", el cual es constante (final) y no puede cambiar.
    // El parámetro "edad" es asignado al atributo "edad", el cual es modificable.
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar los datos de la persona.
    // Se imprime el valor de "nombre" (que es constante) y de "edad" (que puede cambiar).
    public void mostrarDatos() {
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
    }

    // Método Setter para modificar el valor del atributo "edad".
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método Getter para obtener el valor actual del atributo "edad".
    public int getEdad() {
        return edad;
    }
}
