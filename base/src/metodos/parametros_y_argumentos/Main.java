package metodos.parametros_y_argumentos;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Se solicita al usuario que ingrese dos números mediante cuadros de diálogo.
        // Los valores ingresados se obtienen como texto y se convierten en enteros usando "Integer.parseInt".
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));

        // Se crea una instancia de la clase "Operacion" para realizar las operaciones aritméticas.
        Operacion op = new Operacion();

        // Se llaman los métodos de la clase "Operacion" para realizar las operaciones de suma, resta, multiplicación y división.
        // Los valores "n1" y "n2" se pasan como argumentos a los métodos, permitiendo que se realicen las operaciones con esos valores.
        op.sumar(n1, n2);         // Argumentos: n1, n2
        op.restar(n1, n2);        // Argumentos: n1, n2
        op.multiplicar(n1, n2);   // Argumentos: n1, n2
        op.dividir(n1, n2);       // Argumentos: n1, n2

        // Se muestra el resultado de todas las operaciones aritméticas a través del método "mostrarResultados".
        op.mostrarResultados();
    }
}
