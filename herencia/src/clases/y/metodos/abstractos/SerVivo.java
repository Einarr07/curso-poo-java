package clases.y.metodos.abstractos;

public abstract class SerVivo {

    /*
     * Un método abstracto es un método que se declara sin una implementación en una clase abstracta.
     * Esto significa que las clases hijas o subclases que hereden de la clase abstracta deben proporcionar
     * su propia implementación del método abstracto.
     *
     * Los métodos abstractos permiten definir un comportamiento común que debe ser implementado en todas
     * las subclases, pero cada una puede tener una implementación diferente según sus necesidades.
     *
     * En este caso, "alimentarse()" es un método abstracto, lo que significa que cada ser vivo
     * tiene una manera diferente de alimentarse, por lo que las clases que hereden de "SerVivo" deben
     * implementar este método con su propio comportamiento específico.
     */
    public abstract void alimentarse();
}
