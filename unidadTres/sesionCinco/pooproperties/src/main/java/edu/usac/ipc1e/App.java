package edu.usac.ipc1e;

import edu.usac.ipc1e.animal.Loro;
import edu.usac.ipc1e.animal.Pinguino;
import edu.usac.ipc1e.figura.Circulo;
import edu.usac.ipc1e.figura.Cuadrado;
import edu.usac.ipc1e.figura.Figura;
import edu.usac.ipc1e.figura.Rectangulo;

/**
 * Este proyecto sirve para ejemplificar el uso de extends e implements
 * 
 * Para el ejemplo de extends se encuentran las clases Animal, Vertebrado,
 * Oviparo, Ave, Loro y Pinguino.
 * 
 * Para el ejemplo de implements se encuentran las clases Figura, Cuadrado,
 * Rectangulo y Circulo
 */
public class App {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[] {
                new Cuadrado(4),
                new Rectangulo(4, 2),
                new Circulo(3),
                new Rectangulo(2, 2)
        };
        for (Figura figura : figuras) {
            System.out.println("El area del " + figura.toString().toLowerCase() + " es " + figura.calcularArea());
        }
        /* ------- */
        Loro loro = new Loro(false);
        loro.setNombre("Pablo");
        System.out.println("¿El loro puede volar? -> " + loro.vuela());
        System.out.println("El loro se llama "+ loro.getNombre());
        
        Pinguino pinguino = new Pinguino(false);
        pinguino.setNombre("Pedro");
        System.out.println("¿El pinguino puede volar? -> " + pinguino.vuela());
        System.out.println("El pinguino se llama "+ pinguino.getNombre());
    }
}
