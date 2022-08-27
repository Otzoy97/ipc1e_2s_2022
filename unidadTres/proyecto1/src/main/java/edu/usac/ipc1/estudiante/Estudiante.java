package edu.usac.ipc1.estudiante;

import edu.usac.ipc1.curso.Curso;

public class Estudiante {
    private int carnet;
    private String nombre = "";
    private String apellido = "";

    public Estudiante(int carnet, String nombre, String apellido) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Estudiante() {

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(201602782, "Sergio", "Otzoy");
        Estudiante estudiante2 = new Estudiante(202100111, "Nombre", "Apellido");
        Estudiante estudiante3 = new Estudiante();
    }

}
