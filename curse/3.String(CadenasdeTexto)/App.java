public class App {
    public static void main(String[] args) {
        String texto = "     Este es un Texto Asignado a una variable String";

        
        //Muestra el numero de caracteres que tiene el texto
        int longitud = texto.length();

        //Con charAt selecciona uno de lo scaratceres que eligamos meidante el index
        char caracter = texto.charAt(0);

        //substring desde donde hasta donde queremos extraer el texto
        String subString = texto.substring(3, 16);

        //toLowerCase transforma el texto en minuscula
        String minuscula = texto.toLowerCase();

        // toUpperCase Convierte el texto de la cadena en mayuscula
        String mayuscula = texto.toUpperCase();

        //indexOf nos dice en donde arranca la variable
        int indice = texto.indexOf("variable");

        //reamplace reemplaxa un texto de el parrafo
        String resmplazado = texto.replace("Texto","Parrafo");

        //contains nos dice mediante el boolean si existe esa texto en la cadena
        boolean contiene = texto.contains("Asignado");

        //trimp nos quita los espacios de al principio y al final
        String sinEspacios = texto.trim();

        //startsWith Verifica si el texto empieza con el prefijo dado
        boolean prefijo = texto.trim().startsWith("Este");



        //Souts
        //Muestra solo el textp
        System.out.println(texto);

        System.out.println("---------------");

        //length
        System.out.println(longitud);

        System.out.println("---------------");

        //charAt
        System.out.println(caracter);

        System.out.println("---------------");

        //substring
        System.out.println(subString);

        System.out.println("---------------");

        //toLowerCase
        System.out.println(minuscula);

        System.out.println("---------------");

        //toUpperCase
        System.out.println(mayuscula);

        System.out.println("---------------");

        //indexOf
        System.out.println(indice);

        System.out.println("---------------");

        //remplace
        System.out.println(resmplazado);

        System.out.println("---------------");

        //contains
        System.out.println(contiene);

        System.out.println("---------------");

        //trimp
        System.out.println(sinEspacios);

        System.out.println("---------------");

        //startsWith
        System.out.println(prefijo);


    }
}
