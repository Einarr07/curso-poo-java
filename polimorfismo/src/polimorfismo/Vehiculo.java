package polimorfismo;

public class Vehiculo {
    protected String matricula;
    protected String marca;
    protected String modelo;

    // Constructor de la clase Vehiculo que inicializa los atributos comunes a todas las subclases.
    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    // Métodos Getters para acceder a los atributos.
    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    // Método que será sobrescrito en las clases hijas. Aquí se define una versión básica para la clase padre.
    public String mostrarDatos() {
        return "Matricula: " + matricula +
                "\nMarca: " + marca +
                "\nModelo: " + modelo;
    }
}
