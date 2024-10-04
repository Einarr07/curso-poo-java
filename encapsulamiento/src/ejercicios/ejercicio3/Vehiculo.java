package ejercicios.ejercicio3;

/*Construir un programa que dada una serie de vehículos caracterizados por su marca, modelo y precio, imprima
* las propiedades del vehículo más barato. Para ello, se deberán leer por teclado las características de cada
* vehículo y crear una clase que represente a cada uno de ellos.*/
public class Vehiculo {
    // Atributos privados: Características del vehículo.
    private String marca;
    private String modelo;
    private float precio;

    // Constructor: Inicializa los atributos de la clase Vehiculo (marca, modelo y precio).
    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Método Getter para obtener el precio del vehículo.
    public float getPrecio() {
        return precio;
    }

    // Método que devuelve una cadena con los datos del vehículo (marca, modelo y precio).
    public String mostrarDatos() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nPrecio: $" + precio + "\n";
    }
}
