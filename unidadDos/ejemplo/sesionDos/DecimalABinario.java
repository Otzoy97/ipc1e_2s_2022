import java.util.Scanner;

/**
 * Este programa toma de entrada un numero decimal 
 * y devuelve su representacion binaria
 */
public class DecimalABinario {

    public static void main(String[] args) {
        /**
         * Esta variable permite habilitar el acceso 
         * a funciones que siven para que el usuario
         * pueda interactuar con el programa desde la consola
         */
        Scanner sc = new Scanner(System.in);
        /**
         * Imprime un mensaje en consola, solicitando
         * que ingrese un numero
         */
        System.out.print("Ingrese un numero entero positivo: ");
        /**
         * Espera por la entrada del usuario
         */
        String entradaDeUsuario = sc.nextLine();
        /**
         * Convierte la entrada del usuario (que es una cadena)
         * a un numero entero
         */
        int numeroBaseDiez = Integer.parseInt(entradaDeUsuario);
        /**
         * Declaración de una variable de tipo entero 
         * que servirá para mantener un copia temporal
         * del resultado de dividir el numeroBaseDiez entre dos
         * consecutivamente hasta que cociente sea 0 o 1
         */
        int cociente = numeroBaseDiez;
        /**
         * Declaración de una variable de tipo String
         */
        String numeroBinario = "";
        /**
         * Divide cociente hasta que sea 0
         */
        while(cociente != 0) {
            /**
             * Recupera el residuo de dividir cociente entre 2
             * y concatena el resultado al inicio de la variable
             * numeroBinario
             */
            numeroBinario = String.valueOf(cociente % 2) + numeroBinario;
            /**
             * Divide cociente entre dos y almacen el resultado en la misma variable
             */
            cociente = cociente / 2;
        }
        /**
         * Imprime en consola el resultado
         */
        System.out.println(numeroBaseDiez + " en binario es -> " + numeroBinario);
    }
}
