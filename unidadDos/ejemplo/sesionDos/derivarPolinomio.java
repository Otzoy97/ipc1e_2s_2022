import java.util.Scanner;

/**
 * Deriva
 */
public class derivarPolinomio {
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
         * Variable que almacenara el polinomio derivado
         */
        String polinomioDerivado = "";
        /**
         * Recorre el arreglo para construir el polinomio
         * derivado
         */
        for (int i = 0; i < entradaArray.length; i++) {
            int coeficiente = Integer.parseInt(entradaArray[i]);
            polinomioDerivado = polinomioDerivado + " + " + derivar(entradaArray.length - i - 1, coeficiente);
        }
        /**
         * Imprime el resultado en consola
         */
        System.out.println(polinomioDerivado);
    }

    public static String derivar(int grado, int coeficiente) {
        if (grado == 0) {
            /**
             * La derivada de una constante, es 0
             */
            return ("0");
        } else if (grado == 1) {
            /**
             * La derivada de x (grado 0) es 1 por su coeficiente
             * Por lo tanto, es el coeficiente en sí
             */
            return String.valueOf(coeficiente);
        }
        /**
         * La derivada de Cx^n es C*n*x^(n - 1)
         */
        return ((grado * coeficiente) + "x^" + (grado - 1));
    }
}
