import java.util.Scanner;

/**
 * Este programa toma de entrada una cadena con un numero binario
 * y lo convierte en un numero decimal 
 */
public class BinarioADecimal {
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
    }    
}
