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



        //Souts
        //Muestra solo el textp
        System.out.println(texto);

        //length
        System.out.println(longitud);
        //charAt
        System.out.println(caracter);
        //substring
        System.out.println(subString);
        //toLowerCase
        System.out.println(minuscula);
        //toUpperCase
        System.out.println(mayuscula);
        //indexOf
        System.out.println(indice);
        //remplace
        System.out.println(resmplazado);
        //contains
        System.out.println(contiene);
        //trimp
        System.out.println(sinEspacios);


    }
}
