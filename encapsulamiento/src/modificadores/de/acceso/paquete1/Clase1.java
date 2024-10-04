package modificadores.de.acceso.paquete1;

public class Clase1 {

    // Atributo con modificador de acceso por defecto (package-private).
    // Este atributo es accesible solo dentro de clases del mismo paquete.
    // No será accesible desde clases en otros paquetes.
    int atributo;

    // Atributo público.
    // Es accesible desde cualquier clase, sin importar si pertenece al mismo
    // paquete o a un paquete diferente. Puede ser utilizado desde cualquier parte del código.
    public int atributo1;

    // Atributo privado.
    // Es accesible solo dentro de esta misma clase (Clase1).
    // Ninguna otra clase, ni siquiera dentro del mismo paquete, puede acceder
    // directamente a este atributo. Es útil para ocultar detalles de implementación.
    private int atributo2;

}
