public class Triangulo extends Poligono {
    private double lado1;
    private double lado2;
    private double lado3;

    // Constructor que inicializa los lados de un triángulo y llama al constructor de la clase padre Poligono
    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);  // Un triángulo siempre tiene 3 lados
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // Métodos getter para obtener los lados del triángulo
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    // Sobrescritura del método toString para describir un triángulo
    @Override
    public String toString() {
        return "Triangulo: \n" + super.toString() +
                "\nLado 1 = " + lado1 +
                "\nLado 2 = " + lado2 +
                "\nLado 3 = " + lado3;
    }

    // Implementación del método abstracto Area usando la fórmula de Herón
    @Override
    public double Area() {
        double p = (lado1 + lado2 + lado3) / 2;  // semiperímetro
        return Math.sqrt(p * (p - lado1) * (p - lado2) * (p - lado3));  // Fórmula de Herón
    }
}
