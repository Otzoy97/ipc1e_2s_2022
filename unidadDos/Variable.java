public class Variable {

    /**
     * Variables constantes que usan la palabra reservada 'final'. Esto hace que una
     * vez inicializada, la variable no pueda cambiar de valor. Si no se le indica
     * un valor inicial, el programa dará error
     * 
     * Ambas variables son variables globales.
     * 
     * La variable VALOR_DE_PI usa la palabra reservada static lo que la convierte
     * en una variable de clase.
     * 
     * La variable CONSTANTE_GRAVEDAD es una variable de instancia
     */
    static final double VALOR_DE_PI = 3.14f;
    final double CONSTANTE_GRAVEDAD = 9.8f;

    /**
     * Esta función 'main' usa 'args' como parámetro
     * 
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Declaración de variables sin inicialización
         */
        int intValue01;
        float floatValue01;
        double doubleValue01;
        boolean booleanValue01;
        char charValue01;
        /**
         * Declaración de variables con inicialización
         */
        int intValue02 = 1;
        float floatValue02 = 2.1f;
        double doubleValue02 = 8.484d;
        boolean booleanValue02 = true;
        char charValue02 = 'a';
        /**
         * Asignación de una variable ya declarada
         */
        intValue01 = 45;
        floatValue01 = 45.67f;
        doubleValue01 = 1234.66634d;
        booleanValue01 = false;
        charValue01 = '%';
        /**
         * A continuación se usa la instrucción System.out.println
         * que sirve para realizar una "impresión" en consola y hacer
         * un salto de línea.
         * 
         * En esta ocasión el operador '+' se está usando para 
         * concatenar la cadena del mensaje y el valor de la variable.
         */
        System.out.println("El valor de intValue01 es " + intValue01);
        System.out.println("El valor de floatValue01 es " + floatValue01);
        System.out.println("El valor de doubleValue01 es " + doubleValue01);
        System.out.println("El valor de booleanValue01 es " + booleanValue01);
        System.out.println("El valor de charValue01 es " + charValue01);
        System.out.println("----------------------------------------");
        System.out.println("El valor de intValue02 es " + intValue02);
        System.out.println("El valor de floatValue02 es " + floatValue02);
        System.out.println("El valor de doubleValue02 es " + doubleValue02);
        System.out.println("El valor de booleanValue02 es " + booleanValue02);
        System.out.println("El valor de charValue02 es " + charValue02);

    }
}