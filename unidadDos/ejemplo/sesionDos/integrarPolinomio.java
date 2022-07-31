import java.util.Scanner;

/**
 * 
 */
public class IntegrarPolinomio {
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
        System.out.print("Ingrese un cadena de valores, separadas por coma: ");
        /**
         * Espera por la entrada del usuario
         */
        String entradaDeUsuario = sc.nextLine();
        /**
         * Separa la entrada del usuario
         */
        String[] entradaArray = entradaDeUsuario.split(",");
        /**
         * Variable que almacenara el polinomio integrado
         */
        String polinomioDerivado = "";
    }
}
