package clases.y.metodos.abstractos;

public class Planta extends SerVivo {

    /*
     * Implementación del método abstracto "alimentarse()" de la clase "SerVivo".
     * En este caso, la planta se alimenta a través de la fotosíntesis.
     */
    @Override
    public void alimentarse() {
        System.out.println("La planta se alimenta a través de la fotosíntesis.");
    }
}
