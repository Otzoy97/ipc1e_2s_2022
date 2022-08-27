package edu.usac.ipc1e.animal;

/**
 * La clase Animal funciona como una clase padre de Vertebrado
 */
public class Animal {
    /**
     * Este atributo no es visible para ninguna clase externa
     * Únicamente se puede acceder desde dentro de esta misma clase
     */
    private String nombre;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
