package edu.usac.ipc1e;

import java.text.DateFormat;
import java.util.Date;

import edu.usac.ipc1e.Cliente.Cliente;

/**
 * Esta clase sirve para ejemplificar el uso de referencias de objetos en Java
 */
public class ReferenciaDeObjeto {
    public static void main(String[] args) {
        int i1 = 5;
        int i2 = i1;
        System.out.println("Se modifica i1\n");
        i1 = 5 + 5;
        System.out.println("i1 ahora es -> " + i1);
        System.out.println("i2 ahora es -> " + i2);

        System.out.println("\n/-------Copia por referencia de fecha-------/");
        Date date1 = new Date();
        Date date2 = date1;
        System.out.println("Fecha de date1 " + DateFormat.getInstance().format(date1));
        System.out.println("Fecha de date2 " + DateFormat.getInstance().format(date2));
        System.out.println("\nSe modifica date2\n");
        date2.setTime(new Date().getTime() + 1000 * 60);
        System.out.println("Fecha de date1 " + DateFormat.getInstance().format(date1));
        System.out.println("Fecha de date2 " + DateFormat.getInstance().format(date2));

        System.out.println("\n/-------Copia por referencia de cliente-------/");
        Cliente c1 = new Cliente("cliente 01");
        Cliente c2 = c1;

        System.out.println("¿Cliente c1 es igual a cliente c2? " + (c1 == c2));
        System.out.println("\n/-------Copia \"profunda\" de cliente-------/");
        c2 = new Cliente(c1.getNombre());
        System.out.println("¿Cliente c1 es igual a cliente c2? " + (c1 == c2));
    }
}
