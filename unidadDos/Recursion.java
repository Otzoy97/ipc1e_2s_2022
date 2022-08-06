public class Recursion {
    public static void main(String[] args) {
        int[] arreglo = {4,2,3,-4,8,0,3,8,-1};
        int maximo = obtenerMax(arreglo, 0, arreglo.length);
        System.out.println("El numero mayor es " +maximo);
        System.out.println("El factorial del numero mayor es " + factorial(maximo));
    }

    /**
     * Función recursiva para obtener el maximo de un arreglo de numeros
     * 
     * @param arreglo
     * @param idxInicio
     * @param largo
     * @return
     */
    public static int obtenerMax(int[] arreglo, int idxInicio, int largo) {
        // Caso base
        if (largo == 1) {
            return arreglo[idxInicio];
        }
        // Camino hacia el caso base y llamada recursiva
        return Math.max(arreglo[idxInicio], obtenerMax(arreglo, idxInicio + 1, largo - 1));
    }

    /**
     * Función recursiva para obtener el factorial de n
     * 
     * @param n
     * @return
     */
    public static int factorial(int n) {
        // Caso base
        if (n == 1) {
            return 1;
        }
        // Camino hacia el caso base y llamada recursiva
        return n * factorial(n - 1);
    }
}
