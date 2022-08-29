package edu.usac.ipc1.asignacion;

/**
 * Clase que modela los atributos y comportamiento de un curso
 */
public class Curso {
    private String nombre;

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }



}
