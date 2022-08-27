package edu.usac.ipc1e.figura;

/**
 * En una interface, únicamente se describe el comportamiento de una clase
 * Es decir, se describe qué hace la clase, pero no cómo lo hace.
 */
public interface Figura {
    /* Una figura podrá calcular su área y su perimetro */
    public double calcularArea();
    public double calcularPerimetro();
}
