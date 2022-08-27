package edu.usac.ipc1.figura;

public class Dibujador {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[5];
        figuras[0] = new Circulo();
        figuras[1] = new Cuadrado();
        figuras[2] = new Triangulo();
        figuras[3] = new Triangulo();
        figuras[4] = new Cuadrado();

        for (int i = 0; i < figuras.length; i++) {
            figuras[i].dibujar();
        }
    }
}
