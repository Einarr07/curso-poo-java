package getters.y.setters;

/*
 * El encapsulamiento es una técnica para ocultar los datos de una clase,
 * de modo que solo puedan ser accedidos o modificados a través de métodos
 * específicos (getters y setters). Esto protege los datos internos de una
 * clase y asegura que sean manipulados de manera controlada.
 *
 * - Setters: Son métodos usados para asignar un valor a un atributo privado.
 * - Getters: Son métodos que permiten acceder al valor de un atributo privado.
 *
 * Estos métodos son útiles para manejar los atributos encapsulados y agregar
 * validaciones o lógica adicional si es necesario.
 */

public class Clase1 {
    // Atributo privado: Solo es accesible dentro de esta clase.
    private String nombre;

    // Atributo privado: Solo es accesible dentro de esta clase.
    private int edad;

    // Método Setter: Asigna un valor al atributo 'edad'.
    // Usamos 'this' para referirnos al atributo de la clase.
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método Getter: Devuelve el valor actual del atributo 'edad'.
    public int getEdad() {
        return edad;
    }

    // Método Setter: Asigna un valor al atributo 'nombre'.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método Getter: Devuelve el valor actual del atributo 'nombre'.
    public String getNombre() {
        return nombre;
    }
}
