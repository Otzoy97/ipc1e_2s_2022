package edu.usac.ipc1e.figura;

/**
 * Para calcular el area y el perimetro de un círculo
 * basta con conocer su radio
 * 
 * Cuando se "implementa" desde una clase, es obligatorio
 * definir el comportamiento de los método definidos en la interface usada
 */
public class Circulo implements Figura {
    /**
     * Este atributo no es visible para ninguna clase externa
     * Únicamente se puede acceder desde dentro de esta misma clase
     */
    private double radio;

    /**
     * Este es el constructor Circulo
     * Para crear una nueva instancia de Circulo es obligatorio
     * indicar el radio
     * @param radio
     */
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
        return radio * 2 * Math.PI;
    }

    /**
     * Este método sobreescribe el comportamiento de "toString"
     * 
     * toString es un método que todas las clases traen por defecto, por esa razon
     * no se encuentra definida en la interface Figura
     */
    @Override
    public String toString() {
        return "Circulo";
    }

}
