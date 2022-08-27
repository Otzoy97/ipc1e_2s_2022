package edu.usac.ipc1e.figura;

/**
 * Para calcular el area y el perimetro de un rectángulo
 * se necesita conocer su base y su altura
 * 
 * Cuando se "implementa" desde una clase, es obligatorio
 * definir el comportamiento de los método definidos en la interface usada
 */
public class Rectangulo implements Figura {

    /**
     * Estos atributos no son visibles para ninguna clase externa
     * Únicamente se pueden acceder desde dentro de esta misma clase
     */
    private double base;
    private double altura;

    /**
     * Este es el constructor del Rectangulo
     * Para crear una nueva instancia de Rectangulo es obligatorio
     * indicar la base y la altura
     * 
     * @param base
     * @param altura
     */
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return base * 2 + altura * 2;
    }

    /**
     * Este método sobreescribe el comportamiento de "toString"
     * 
     * toString es un método que todas las clases traen por defecto, por esa razon
     * no se encuentra definida en la interface Figura
     */
    @Override
    public String toString() {
        return "Rectangulo";
    }

}
