package controllers;

import java.util.HashMap;
import java.util.Map;

import models.Empleado;

public class EmpleadoContoller {

    private Map<Integer, Empleado> empleados;

    public EmpleadoContoller() {
        empleados = new HashMap<>();

    }

    /**
     * Ingresar el empleado donde la clave sea el id del Empleado
     * 
     * @param Empleado a ingresar al mapa
     * @return False si no ingreso porque ya exisite
     *         True si ingreso correctamente
     */

    public boolean addEmpleado(Empleado empleado) {

        if (empleados.containsKey(empleado.getId())) {
            return false;
        }

        empleados.put(empleado.getId(), empleado);
        return true;
    }

    /**
     * Buscar el empleado por si id
     * 
     * @param int id del empleado a busacr
     * @return emplead segun id
     */
    public Empleado getEmpleadoById(int id) {
        return empleados.get(id);
    }

    public void displayEmpleados() {
        for (Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()) {
            System.out.println(empleadoEntry.getKey() + " - " + empleadoEntry.getValue());
        }
    }

    public void displayEmpleadosSoloNombres() {
        for (Map.Entry<Integer, Empleado> empleadoEntry : empleados.entrySet()) {
            System.out.println(empleadoEntry.getKey() + " - " + empleadoEntry.getValue().getName());
        }
    }

    public void displayLlaves() {
        for (Integer key : empleados.keySet()) {
            System.out.println(key);
        }
    }

    public void displayEmpleados2() {
        for (Empleado valor : empleados.values()) {
            System.out.println(valor);
        }
    }
}