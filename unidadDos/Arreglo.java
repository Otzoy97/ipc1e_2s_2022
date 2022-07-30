public class Arreglo {
    /**
     * Variable de clase de tipo arreglo 
     * de cadenas con identificador 'palabras'
     * 
     * Este arreglo solo está declarado pero 
     * no está inicializado, si se intentara realizar
     * operaciones sobre él, daría error.
     */
    public static String[] palabras;

    public static void main(String[] args) {
        /**
         * Ahora se inicializa el arreglo palabras
         * Se utiliza el operador de asignación y 
         * la palabra reservada new, para indicar
         * la asignación de un nuevo arreglo
         */
        palabras = new String[10];

        /**
         * Para asignar un valor a cualquier indice
         * del arreglo, se utiliza el identificador
         * seguidos del índice del arreglo encerrado 
         * en corchetes.
         * 
         * El índice de un arreglo va desde 0 hasta
         * el largo del arreglo menos uno.
         * 
         * Ya que palabras tiene un tamaño de 
         * 10, si se intentara asignar algo a la
         * posición 10, el programa daría error
         */
        palabras[0] = "hola";
        palabras[1] = "hola";
        palabras[2] = "hola";
        palabras[3] = "hola";
        palabras[4] = "hola";
        palabras[5] = "hola";
        palabras[6] = "hola";
        palabras[7] = "hola";
        palabras[8] = "hola";
        palabras[9] = "hola";
        
        /**
         * Para manipular arreglos o realizar operaciones
         * con ellos es usual usar ciclos.
         */
        for (int i = 0; i < palabras.length; i++) {
            /**
             * De esta manera, en lugar de escribir
             * 10 lineas con cada indice del arreglo,
             * se escribe un ciclo-for y se usa la variable
             * i (que es de tipo entero) para recorrer el arreglo
             * de forma secuencial.
             */
            System.out.println("Valor para el indice " + i + " -> " + palabras[i]);
        }

        /**
         * No es posible modificar el tamaño de un arreglo
         * luego de haberlo declarado. Sin embargo, es posible
         * "re-declararlo" y cambiarle el tamaño. Esto reescribirá
         * cualquier valor anterior que tenga este arreglo.
         * 
         * Para determinar el largo de un arreglo se usa length (sin parentesis)
         */
        System.out.println("Tamaño del arreglo antes de 'redeclararlo' -> " + palabras.length);
        palabras = new String[4];
        System.out.println("Tamaño del arreglo despues de 'redeclararlo' -> " + palabras.length);

        for (int i = 0; i < palabras.length; i++) {
            /**
             * Al imprimir estos valores, en consola, se visualizara
             * el valor "null". Ya que no se ha asignado nada a esos
             * espacios.
             * 
             * Esto suele suceder cuando el tipo de dato del arreglo
             * es un tipo de dato no primitivo.
             */
            System.out.println("Valor para el indice " + i + " -> " + palabras[i]);
        }

        /**
         * En el siguiente arreglo se asignan valores a cada espacio 
         * del arreglo
         */
        for (int i = 0; i < palabras.length; i++) {
            /**
             * Se concatena una cadena y el numero i
             * Este valor luego se asigna al indice i
             * de palabras
             */
            palabras[i] = "valor para el indice " + i;
        }

        /**
         * Ahora se imprime el valor de cada posicion del arreglo
         * 
         * Nótese que únicamente se imprime el valor del arreglo
         * y no se está concatenando nada más.
         */
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }
}

