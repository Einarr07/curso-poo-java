package clases.y.metodos.abstractos;

public class Main {
    public static void main(String[] args) {
        // Se crean instancias de las clases concretas y se llama al método alimentarse().
        Planta planta = new Planta();
        AnimalCarnivoro carnivoro = new AnimalCarnivoro();
        AnimalHerbivoro herbivoro = new AnimalHerbivoro();

        // Cada instancia invoca su propia implementación del método "alimentarse()".
        planta.alimentarse();         // La planta se alimenta a través de la fotosíntesis.
        carnivoro.alimentarse();      // El animal carnívoro se alimenta de carne.
        herbivoro.alimentarse();      // El animal herbívoro se alimenta de hierba.
    }
}
