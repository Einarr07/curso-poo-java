package polimorfismo;

public class VehiculoTurismo extends Vehiculo {
    private int nPuertas;

    // Constructor de la subclase VehiculoTurismo, que además de los atributos heredados,
    // inicializa el número de puertas.
    public VehiculoTurismo(String matricula, String marca, String modelo, int nPuertas) {
        super(matricula, marca, modelo);  // Llama al constructor de la clase padre (Vehiculo).
        this.nPuertas = nPuertas;
    }

    // Sobrescritura del método "mostrarDatos()" para incluir el número de puertas, además de la información básica.
    @Override
    public String mostrarDatos() {
        return "Matricula: " + matricula +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nNúmero de puertas: " + nPuertas;
    }
}
