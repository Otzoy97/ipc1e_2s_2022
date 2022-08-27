package edu.usac.ipc1e.figura;

/**
 * Para calcular el area y el perimetro de un cuadrado
 * basta con conocer uno de sus lados
 * 
 * Cuando se "implementa" desde una clase, es obligatorio
 * definir el comportamiento de los método definidos en la interface usada
 */
public class Cuadrado implements Figura {
    /**
     * Este atributo no es visible para ninguna clase externa
     * Únicamente se puede acceder desde dentro de esta misma clase
     */
    private double base;

    /**
     * Este es el constructor del Cuadrado
     * Para crear una nueva instancia de Cuadrado es obligatorio
     * indicar la base
     * 
     * @param base
     */
    public Cuadrado(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return base;

    }

    @Override
    public double calcularPerimetro() {
        return 4 * base;
    }

    /**
     * Este método sobreescribe el comportamiento de "toString"
     * 
     * toString es un método que todas las clases traen por defecto, por esa razon
     * no se encuentra definida en la interface Figura
     */
    @Override
    public String toString() {
        return "Cuadrado";
    }
}
