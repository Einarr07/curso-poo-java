package herencia;

/*
 * La herencia en Programación Orientada a Objetos (POO):
 *
 * La herencia es un mecanismo fundamental de la POO que permite crear nuevas clases a partir de clases ya existentes.
 * La clase que hereda se denomina "subclase" o "clase hija", y la clase de la que se hereda se denomina "superclase" o "clase padre".
 *
 * La herencia permite a la subclase heredar los atributos y métodos de la superclase, lo que fomenta la reutilización de código
 * y la extensión de la funcionalidad sin necesidad de duplicar código. Además, una subclase puede añadir sus propios
 * atributos y métodos, o sobrescribir los métodos heredados para ajustarlos a sus necesidades específicas.
 *
 * En este caso, la clase "Estudiante" es la subclase que hereda de la clase "Persona" (superclase). Esto significa
 * que "Estudiante" hereda los atributos y métodos de "Persona" (nombre, apellido, edad y sus getters) y además define
 * sus propios atributos específicos (código de estudiante y nota final), añadiendo su funcionalidad.
 */
public class Estudiante extends Persona {

    // Atributos propios de la clase Estudiante.
    private int codigoEstudiante;
    private float notaFinal;

    // Constructor de la clase Estudiante:
    // Utiliza la palabra clave "super" para invocar el constructor de la clase Persona.
    // Además, inicializa los atributos propios de la clase Estudiante (codigoEstudiante, notaFinal).
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
        // "super" llama al constructor de la clase padre (Persona).
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;
    }

    // Método para mostrar los datos del estudiante, incluyendo los atributos heredados de Persona
    // y los propios de Estudiante.
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre() +
                "\nApellido: " + getApellido() +
                "\nEdad: " + getEdad() +
                "\nCódigo estudiante: " + codigoEstudiante +
                "\nNota final: " + notaFinal);
    }
}
