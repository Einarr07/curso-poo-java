package herencia;

/*
 * Clase Main: Se utiliza para probar la herencia entre las clases Persona y Estudiante.
 * Se crea un objeto de tipo Estudiante y se muestran sus datos.
 */
public class Main {
    public static void main(String[] args) {
        // Se crea un objeto de tipo Estudiante con los datos necesarios.
        Estudiante pedrito = new Estudiante("Pedrito", "Cordova", 15, 345, 7.5f);

        // Se llama al método mostrarDatos() para imprimir la información del estudiante.
        pedrito.mostrarDatos();
    }
}
