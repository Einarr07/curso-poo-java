package metodos.metodo_constructor;

public class Persona {
    // Atributos de la clase: Estos representan las propiedades de un objeto de tipo Persona.
    String nombre;
    int edad;

    // Método constructor: Se utiliza para inicializar objetos de la clase.
    // Nota: Un constructor no tiene un tipo de retorno (como void, int, etc.), solo se define con el mismo nombre de la clase.
    // En este caso, el constructor recibe como parámetros un "nombre" y una "edad", los cuales se asignan a los atributos del objeto.
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para mostrar los datos de la persona.
    // "this" se utiliza para referirse al atributo del objeto actual (en caso de que los nombres de los parámetros y atributos sean iguales).
    public void mostrarDatod() {
        System.out.println("El nombre es: " + this.nombre);
        System.out.println("La edad es: " + this.edad);
    }
}
