import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        // runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        // runEjerccios();
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

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
