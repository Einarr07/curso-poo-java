package polimorfismo;

public class Main {
    public static void main(String[] args) {

        /*
        * El polimorfismo es un principio de la Programación Orientada a Objetos (POO) que permite que los objetos
        * de diferentes clases derivadas de una clase base puedan ser tratados de manera uniforme a través
        * de referencias a la clase base. En otras palabras, una referencia de la clase padre puede utilizar métodos
        * de las clases hijas, lo que permite que un mismo método pueda comportarse de diferentes formas dependiendo
        * del tipo de objeto que lo llame. Esto es posible gracias a la sobrescritura de métodos.

         El polimorfismo permite que una clase padre (Vehiculo) use instancias de las clases hijas (VehiculoTurismo,
         * VehiculoDeportivo, VehiculoFurgoneta) de manera uniforme. Aquí se crea un arreglo de tipo Vehiculo que
         * puede almacenar objetos de cualquier subclase de Vehiculo.
         */
        Vehiculo misVehiculos[] = new Vehiculo[4];

        // Se crean instancias de las clases hijas y se almacenan en el arreglo como objetos del tipo padre (Vehiculo).
        misVehiculos[0] = new Vehiculo("gds-123", "Ferrari", "A34");
        misVehiculos[1] = new VehiculoTurismo("sfe-435", "Audi", "P14", 6);
        misVehiculos[2] = new VehiculoDeportivo("joi-456", "Toyota", "kj8", 500);
        misVehiculos[3] = new VehiculoFurgoneta("mvj-358", "Chevrolet", "ol3", 2000);

        // Gracias al polimorfismo, se puede recorrer el arreglo de Vehiculo y llamar al método "mostrarDatos()"
        // que es sobrescrito por las clases hijas, obteniendo el comportamiento específico de cada clase.
        for (Vehiculo vehiculos : misVehiculos) {
            System.out.println(vehiculos.mostrarDatos());  // Llama al método sobrescrito en cada clase hija.
            System.out.println();
        }
    }
}
