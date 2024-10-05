package clases.y.metodos.abstractos;

public class AnimalCarnivoro extends Animal {

    /*
     * Implementación del método abstracto "alimentarse()" en la subclase "AnimalCarnivoro".
     * Aquí se especifica que los animales carnívoros se alimentan de carne.
     */
    @Override
    public void alimentarse() {
        System.out.println("El animal carnívoro se alimenta de carne.");
    }
}
