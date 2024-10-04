package metodos.parametros_y_argumentos;

public class Operacion {
    // Atributos: Variables de instancia que almacenarán los resultados de las operaciones aritméticas.
    int suma;
    int resta;
    int multiplicacion;
    int division;

    // Método para sumar dos números.
    // Los parámetros "numero1" y "numero2" son los valores que se pasan al método,
    // y el resultado se guarda en el atributo "suma".
    public void sumar(int numero1, int numero2) {
        suma = numero1 + numero2;
    }

    // Método para restar dos números.
    // Los parámetros "numero1" y "numero2" se utilizan para realizar la operación de resta,
    // y el resultado se almacena en el atributo "resta".
    public void restar(int numero1, int numero2) {
        resta = numero1 - numero2;
    }

    // Método para multiplicar dos números.
    // Los parámetros "numero1" y "numero2" son multiplicados y el resultado se asigna al atributo "multiplicacion".
    public void multiplicar(int numero1, int numero2) {
        multiplicacion = numero1 * numero2;
    }

    // Método para dividir dos números.
    // Se realiza la división de "numero1" entre "numero2" y el resultado se almacena en el atributo "division".
    // Nota: Este método no maneja la división por cero, lo que podría causar un error si "numero2" es 0.
    public void dividir(int numero1, int numero2) {
        division = numero1 / numero2;
    }

    // Método para mostrar los resultados de las operaciones aritméticas.
    // Se imprime el valor de cada operación almacenado en los atributos.
    public void mostrarResultados() {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicacion es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
}
