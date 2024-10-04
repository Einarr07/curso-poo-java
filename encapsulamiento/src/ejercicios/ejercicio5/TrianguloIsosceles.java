package ejercicios.ejercicio5;

/* Diseñar un programa para trabajar con triángulos isóceles. Para ello defina los atributos necesarios que se
* requieren, proporcione métodos de consulta, un método constructor e implemente métodos para calcular el
* perímetro y el área de un triángulo, además implementar un método que a partir de un arreglo de triángulos
* devuelva el área del triangulo de mayor superficie.*/

public class TrianguloIsosceles {
    // Atributos privados: La base y los lados iguales del triángulo isósceles.
    private double base;
    private double lado;

    // Constructor: Inicializa los atributos de la clase con los valores proporcionados.
    public TrianguloIsosceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }

    // Método que calcula y devuelve el perímetro del triángulo.
    public double obtenerPerimetro() {
        // El perímetro de un triángulo isósceles es 2 * lado + base.
        double perimetro = (2 * lado) + base;
        return perimetro;
    }

    // Método que calcula y devuelve el área del triángulo.
    public double obtenerArea() {
        // El área de un triángulo isósceles se calcula con la fórmula:
        // (base * √(lado² - (base² / 4))) / 2.
        double area = (base * Math.sqrt((lado * lado) - ((base * base) / 4))) / 2;
        return area;
    }

    // Método que muestra los datos del triángulo (base, lado, perímetro y área).
    public String mostrarDatos() {
        return "Base: " + base + "\nLado: " + lado + "\nPerímetro: " + obtenerPerimetro() + "\nÁrea: " + obtenerArea();
    }
}
