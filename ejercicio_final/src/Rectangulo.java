public class Rectangulo extends Poligono {
    private double lado1;
    private double lado2;

    // Constructor que inicializa los lados de un rectángulo y llama al constructor de la clase padre Poligono
    public Rectangulo(double lado1, double lado2) {
        super(4);  // Un rectángulo tiene 4 lados
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Métodos getter para obtener los lados del rectángulo
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    // Sobrescritura del método toString para describir un rectángulo
    @Override
    public String toString() {
        return "Rectangulo: \n" + super.toString() +
                "\nLado 1 = " + lado1 +
                "\nLado 2 = " + lado2 ;
    }

    // Implementación del método abstracto Area para calcular el área del rectángulo
    @Override
    public double Area() {
        return lado1 * lado2;  // Área de un rectángulo es base * altura
    }
}
