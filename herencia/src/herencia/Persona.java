package herencia;

/*
 * Clase padre o superclase que define los atributos y métodos comunes para las clases que heredan de ella.
 * Representa una persona con atributos básicos como nombre, apellido y edad.
 */
public class Persona {

    // Atributos privados: Estos atributos son propios de la clase Persona.
    private String nombre;
    private String apellido;
    private int edad;

    // Constructor de la clase Persona: Inicializa los atributos nombre, apellido y edad.
    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // Métodos Getters: Permiten acceder a los atributos privados de la clase Persona.
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
}
