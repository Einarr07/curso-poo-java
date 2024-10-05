package polimorfismo;

public class VehiculoDeportivo extends Vehiculo {
    private int cilindrada;

    // Constructor de VehiculoDeportivo, que incluye el atributo cilindrada además de los atributos heredados.
    public VehiculoDeportivo(String matricula, String marca, String modelo, int cilindrada) {
        super(matricula, marca, modelo);  // Llama al constructor de la clase padre.
        this.cilindrada = cilindrada;
    }

    // Sobrescritura del método "mostrarDatos()" para agregar la cilindrada del vehículo.
    @Override
    public String mostrarDatos() {
        return "Matricula: " + matricula +
                "\nMarca: " + marca +
                "\nModelo: " + modelo +
                "\nCilindrada: " + cilindrada;
    }
}
