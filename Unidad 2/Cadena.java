/**
 * Las cadenas o strings es una tipo de dato no primitivo
 * que consiste en una secuencia de 'chars'
 * 
 * Existe funciones que Java posee para manipularlas.
 * En este ejemplo se explorarán alguna de esas funcioens
 */
public class Cadena {

    public static void main(String[] args) {
        String cadenaDeEjemplo = "/home/user/index.html";

        /**
         * Una función muy util es split, 
         * esta función "separa" una cadena y la almacena
         * en un arreglo.
         * 
         * La separa tomando en consideración el caracter de division
         */
        String[] cadenaArray = cadenaDeEjemplo.split("/");
        for (int i = 0; i < cadenaArray.length; i++) {
            System.out.println(cadenaArray[i]);
        }

        /**
         * Determina el largo de una cadena se usa
         * length() (con parentesis)
         */
        int largoDeCadena = cadenaDeEjemplo.length();
        System.out.println("El largo de la cadena es " + largoDeCadena);

        /**
         * Determina la primera ocurrencia de un caracter
         * devuelve el indice (base-0)
         */
        int primerIndice = cadenaDeEjemplo.indexOf('/');
        System.out.println("El caracter '/' aparece por primera vez en el indice " + primerIndice);
        /**
         * Determina la uiltima ocurrencia de un caracter
         * devuelve el indice (base-0)
         */
        int ultimoIndice = cadenaDeEjemplo.lastIndexOf('/');
        System.out.println("El caracter '/' aparece por ultima vez en el indice " + ultimoIndice);

        /**
         * Obtener una subcadena de una cadena
         * utilizando un indice inicial y el indice final
         * 
         * En la salida a consola se observa una subcadena
         * que comienza comienza desde la primera '/', hasta la ultima '/'
         */
        String subCadena = cadenaDeEjemplo.substring(primerIndice, ultimoIndice);
        System.out.println(subCadena);

        /**
         * Determina si un subcadena existe en una cadena
         */
        boolean existeEnCadena = cadenaDeEjemplo.contains("user");
        System.out.println("user existe como subcadena?: " + existeEnCadena);

        /**
         * Reemplaza una subcadena por otra, y devuelve el resultado
         */
        String nuevaCadena = cadenaDeEjemplo.replace("user", "usuario");
        System.out.println(nuevaCadena);

        /**
         * Convierte una cadena a mayusculas.
         */
        String cadenaTodoMayuscula = cadenaDeEjemplo.toUpperCase();
        System.out.println(cadenaTodoMayuscula);

        /**
         * Convierte una cadena a minuscula.
         */
        String cadenaTodoMinuscula = cadenaTodoMayuscula.toLowerCase();
        System.out.println(cadenaTodoMinuscula);

        /**
         * Trim, elimina cualquier espacio en blanco o saltos de linea iniciales
         */
        String cadenaConEspacios = "    cadena    ";
        System.out.println("|" + cadenaConEspacios +"|");
        String cadenaSinEspacios = cadenaConEspacios.trim();
        System.out.println("|" + cadenaSinEspacios +"|");
    }
}
