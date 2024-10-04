package miembros.estaticos;

public class Estatico {
    /*
     * Atributo estático:
     * Al declarar "static", el atributo pertenece a la clase y no a los objetos creados de ella.
     * Esto significa que cualquier cambio en el valor del atributo afectará a todas las instancias de la clase.
     * En este caso, "frase" es un atributo estático, por lo que cualquier modificación se reflejará en todas
     * las referencias a "Estatico.frase", independientemente de los objetos creados.
     */
    private static String frase = "Primera frase";

    /*
     * Método estático:
     * Un método estático se puede llamar sin necesidad de crear una instancia de la clase.
     * Pertenece directamente a la clase, lo que significa que se puede acceder a él a través del nombre de la clase.
     * En este caso, el método "sumar" recibe dos parámetros y retorna la suma de ambos.
     */
    public static int sumar(int n1, int n2) {
        int suma = n1 + n2;
        return suma;
    }

    public static void main(String[] args) {
        /*
         * Si descomentamos este código, veríamos que aunque se creen dos objetos diferentes (objeto1 y objeto2),
         * la variable "frase" es compartida entre ambos debido a que es estática.
         * Cualquier cambio hecho en "frase" a través de uno de los objetos (como objeto2) se reflejará en ambos.
         *
         * Estatico objeto1 = new Estatico();
         * Estatico objeto2 = new Estatico();
         * objeto2.frase = "Segunda frase"; // Modifica el valor estático compartido
         * System.out.println(objeto1.frase); // Imprime "Segunda frase"
         * System.out.println(objeto2.frase); // Imprime "Segunda frase"
         */

        // Aquí accedemos directamente al atributo y al método estáticos usando el nombre de la clase.
        // No es necesario crear instancias de "Estatico" para usarlos.
        System.out.println(Estatico.frase); // Imprime la frase estática.
        System.out.println("La suma es: " + Estatico.sumar(3, 4)); // Llama al método estático "sumar".
    }
}
