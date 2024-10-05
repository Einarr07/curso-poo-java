package sobre.escritura.de.metodos;

public class Persona extends Animal {

    /*
     * Sobrescritura de métodos (override):
     *
     * La sobrescritura de métodos es un mecanismo en la Programación Orientada a Objetos (POO) que permite
     * a una subclase proporcionar una implementación específica de un método que ya ha sido definido en su superclase.
     *
     * Esto permite modificar o adaptar el comportamiento de un método heredado según las necesidades de la subclase.
     * Para sobrescribir un método, se debe usar la misma firma del método que se desea sobrescribir.
     *
     * En este caso, la clase "Persona" sobrescribe el método "comer()" de la clase "Animal", adaptando el comportamiento
     * para que muestre cómo una persona come utilizando cubiertos, en contraste con la implementación genérica del método en "Animal".
     *
     */
    @Override
    public void comer() {
        System.out.println("Utilizo los cubiertos para comer.");
    }
}
