

public class Arreglos {

    public static void main(String[] args) {
        // Arreglos: Estructuras de datos que tienen valores del mismo tipo bajo uin
        // mismo nombre
        // estos valores se distribuyen secuencialmente en la memoria y se pueden
        // acceder a ellos mediante un indice

        // Los arreglos tambien son llamados VECTORES O MATRICES

        // El indice se empieza a contar por cero no por 1

        int[] numeros = new int[5];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[4] = 50;

        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);//Se le asigna el valor 0 (No es indefinido como en javaScript)
        System.out.println(numeros[4]);

        System.out.println("Cantidad de elementos que tiene numeros: " + numeros.length);


        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        //MINUTO 2:48:07

    }

}
