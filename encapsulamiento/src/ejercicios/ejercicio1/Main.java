package ejercicios.ejercicio1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Cuadrilatero objeto1;
        float lado1, lado2;

        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado1 del cuadrilatero: "));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el lado2 del cuadrilatero: "));

        if (lado1 == lado2){ // Es un cuadrado
            objeto1 = new Cuadrilatero(lado1);
            System.out.println("Es un cuadrado");
        }
        else {
            objeto1 = new Cuadrilatero(lado1, lado2);
        }

        System.out.println("El perimetro es: " + objeto1.getPerimetro());
        System.out.println("El area es: " + objeto1.getArea());
    }
}
