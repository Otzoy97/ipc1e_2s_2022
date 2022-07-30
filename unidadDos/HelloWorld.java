/**
 * Cuando se aprende un nuevo lenguaje de programación es costumbre
 * realizar un programa que imprima en consola "hello world!". Este
 * programa tiene ese propósito, sin embargo también tiene como objetivo
 * mostrar como se construye un programa simple en Java
 * 
 * Cualquier programa de Java comienza con un archivo con extensión .java
 * Dentro de ese archivo escribimos una 'clase'. Observa la linea de este
 * archivo donde dice 'public class HelloWorld', esa es la manera de definir una
 * nueva clase en Java. Todo el contenido de una clase se encierra en llaves {}
 * 
 * El contenido de una clase puede ser variables globales o funciones. La
 * función más importante de una clase será el método 'main'. No todas las
 * clases necesitan un método main. El método main indica cuál será el punto de
 * partida del programa. Indica qué acciones realizará el programa al ser
 * ejecutado.
 */
public class HelloWorld {

    /**
     * La forma de declara el método main no cambia,
     * siempre será 'public static void main(String[] args)' seguidos de llaves,
     * en ese orden, siempre.
     * 
     * El contenido de la función main dependerá del propósito del programa, en este
     * caso imprimir en consola el mensaje "hello world"
     * 
     * @param args
     */
    public static void main(String[] args) {
        /**
         * Hay declaraciones o lineas de código que deberán finalizar con un punto y
         * coma. Por ejemplo, la declaración de una clase no lleva punto y coma al
         * final; la declaración del método main, no lleva punto y coma al final.
         * 
         * La declaración 'System.out.println("hello world!")' debe finalizar con un
         * punto y coma.
         */
        System.out.println("hello world!");
    }
}
