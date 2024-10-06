public abstract class Poligono {
    protected int numeroLados;

    // Constructor de la clase abstracta Poligono
    public Poligono(int numeroLados){
        this.numeroLados = numeroLados;
    }

    // Método getter para obtener el número de lados del polígono
    public int getNumeroLados() {
        return numeroLados;
    }

    // Método toString que devuelve una descripción del polígono
    @Override
    public String toString(){
        return "Número de lados: " + numeroLados;
    }

    // Método abstracto que debe ser implementado por las subclases para calcular el área
    public abstract double Area();
}