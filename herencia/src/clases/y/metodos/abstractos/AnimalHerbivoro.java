package clases.y.metodos.abstractos;

public class AnimalHerbivoro extends Animal {

    /*
     * Implementación del método abstracto "alimentarse()" en la subclase "AnimalHerbivoro".
     * En este caso, los animales herbívoros se alimentan de hierba.
     */
    @Override
    public void alimentarse() {
        System.out.println("El animal herbívoro se alimenta de hierba.");
    }
}
