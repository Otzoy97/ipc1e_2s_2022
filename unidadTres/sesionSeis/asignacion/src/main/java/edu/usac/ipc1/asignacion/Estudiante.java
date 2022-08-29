package edu.usac.ipc1.asignacion;


/**
 * Clase que modela los atributos y comportamiento de un estudiante
 */
public class Estudiante {
    private String nombre;
    private Curso[] cursos;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.cursos = new Curso[2];
    }

    public String getNombre() {
        return nombre;
    }
    
    public void agregarCurso(Curso curso) {
        for (int i = 0; i < cursos.length; i++) {
            if(cursos[i] == null) {
                cursos[i] = curso;
                break;
            }
        }
    }

    public Curso[] getCursos() {
        return cursos;
    }

    @Override
    public String toString() {
        return nombre;
    }   
    
}
