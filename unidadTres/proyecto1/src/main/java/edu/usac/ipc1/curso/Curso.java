package edu.usac.ipc1.curso;

import edu.usac.ipc1.estudiante.Estudiante;

public class Curso {

    protected int id;

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante(201602782, "Sergio", "Otzoy");
        Estudiante estudiante2 = new Estudiante(202100111, "Nombre", "Apellido");
        System.out.println(estudiante.getNombre());
    }
}
