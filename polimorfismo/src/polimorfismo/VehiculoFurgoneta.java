package polimorfismo;

public class VehiculoFurgoneta extends Vehiculo {
    private int carga;

    // Constructor de la subclase VehiculoFurgoneta, que añade el atributo carga.
    public VehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
        super(matricula, marca, modelo);  // Llama al constructor de la clase padre (Vehiculo).
        this.carga = carga;
    }

    // Sobrescritura del método "mostrarDatos()" para incluir el atributo carga, además de la información básica.
    @Override
    public String mostrarDatos() {
        return "Matricula: " + matricula +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nCarga: " + carga;
    }
}
