package metodos.retorno_de_valores;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));

        Operacion op = new Operacion();

        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1,n2);
        int mult = op.multiplicar(n1,n2);
        int div = op.dividir(n1, n2);

        op.mostrarResultados(suma, resta, mult, div);

        /* Otra forma en la que se pueden imprimir los valores sin utilizar variables auxiliares es:
        System.out.println("La suma es: " + op.sumar(n1,n2));
        * */
    }
}