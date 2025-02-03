import java.util.Scanner;

import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        // runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        // runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjercicos();
    }

    private static void runEmpleadoExample() {

        EmpleadoContoller empleadoContoller = new EmpleadoContoller();

        boolean result = empleadoContoller.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        System.out.println("Ingreso " + result);
        result = empleadoContoller.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        System.out.println("Ingreso " + result);

        empleadoContoller.addEmpleado(new Empleado(1, "Pablo", "Senior"));
        empleadoContoller.addEmpleado(new Empleado(2, "Juan", "Senior"));
        empleadoContoller.addEmpleado(new Empleado(3, "Andres", "Senior"));
        System.out.println();
        System.out.println("Empleado por id: ");
        System.out.println(empleadoContoller.getEmpleadoById(2));
        System.out.println();
        System.out.println("Lista de Empleados: ");
        empleadoContoller.displayEmpleados();
        System.out.println();
        System.out.println("Empleados solo por el nombre: ");
        empleadoContoller.displayEmpleadosSoloNombres();
        System.out.println();
        System.out.println("Empleados por Llave: ");
        empleadoContoller.displayLlaves();
        System.out.println();
        System.out.println("Lista de empleados(sin usar entrySet): ");
        empleadoContoller.displayEmpleados2();
    }

    private static void runMapExamlpe() {
        new Mapa();

    }

    private static void runEjercicos() {
        System.out.println(" EJERCICIO 1 ");
        Ejercicios ejercicios = new Ejercicios();
        Scanner entrada = new Scanner(System.in);

        System.out.print("Escriba la primera palabra: ");
        String palabra1 = entrada.nextLine();
        System.out.print("Escriba la segunda palabra: ");
        String palabra2 = entrada.nextLine();

        boolean esAnagrama = Ejercicios.areAnagrams(palabra1, palabra2);
        System.out.println("¿Son anagramas? " + esAnagrama);

        System.out.println(" EJERCICIO 2 ");

        System.out.print("¿Cuántos elementos tendrá el arreglo? ");
        int tamano = entrada.nextInt();
        int[] numeros = new int[tamano];

        System.out.println("Ingrese los números del arreglo:");
        for (int i = 0; i < tamano; i++) {
            numeros[i] = entrada.nextInt();
        }

        System.out.print("Ingrese el valor objetivo: ");
        int objetivo = entrada.nextInt();

        int[] indices = ejercicios.sumatoriaDeDos(numeros, objetivo);
        if (indices != null) {
            System.out.println("Índices encontrados: [" + indices[0] + ", " + indices[1] + "]");
        } else {
            System.out.println("No se encontraron números que sumen el valor objetivo.");
        }

        entrada.close();
    }

}
