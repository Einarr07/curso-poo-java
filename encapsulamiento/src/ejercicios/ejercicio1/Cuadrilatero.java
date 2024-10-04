package ejercicios.ejercicio1;

/*
* Construir un programa que calcule el área y el perímetro de un cuadrilatero dada la longitud de sus dos lados.
* Los valores de esa longitud deberán introducirse por linea de ordenes. Si es un cuadrado, sólo se proporcionará la
* longitud de uno de los lados al constructor.
* */
public class Cuadrilatero {
    // Atributos
    private float lado1;
    private float lado2;



    // Métodos

    // Método Constructor 1 (Cuadrialtero)
    public Cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    // Método constructor 2 (Cuadrado)
    public Cuadrilatero(float lado1){
        this.lado1 = this.lado2 = lado1;
    }

    public float getPerimetro(){
        float perimetro = 2 * (lado1+lado2);
        return perimetro;
    }

    public float getArea(){
        float area = (lado1*lado2);
        return area;
    }

}
