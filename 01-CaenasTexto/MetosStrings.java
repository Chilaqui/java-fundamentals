import java.util.Scanner;
import java.util.*;


public class MetosStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String cadena = "     Esta es texto de la Cadena mas Usada por Todos    ";
        System.out.println(cadena);

        //Muestra el numero de caracteres que tiene la cadena en si 
        int contar = cadena.length();
        System.out.println(contar);

        //Muestra el caracter que esta en el indice que seleccionamos
        char caracter = cadena.charAt(5);
        System.out.println(caracter);

        //Aqui dice de donde hasta donde queremos la cadena extraida
        String subString = cadena.substring(7, 14);
        System.out.println(subString);

        //Convierte las letras a minuscula si es que hay mayuscula
        String minuscula = cadena.toLowerCase();
        System.out.println(minuscula);

        //Convierte la cedena en mayuscula
        String mayuscula = cadena.toUpperCase();
        System.out.println(mayuscula);
        
        //Busca donde esta empezando la variable que le dimos por parametro
        int indiceVariable = cadena.indexOf("Cadena");
        System.out.println(indiceVariable);

        //Reemplaza lacadena de texto que seleccionaste por la que pusiste como parametro
        String reemplazar = cadena.replace("texto", "parrafo");
        System.out.println(reemplazar);

        //Revisa si tienes en la cadena de texto esta cadena
        boolean contiene = cadena.contains("por");
        System.out.println(contiene);

        //Borra los espacios que existen en una cadena al principio y al inal de la cadena
        String sinEspacios = cadena.trim();
        System.out.println(sinEspacios);

    }



}
