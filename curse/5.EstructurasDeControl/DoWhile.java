public class DoWhile {

    public static void main(String[] args) {

        int contador = 1;

        do {
            System.out.print("Esto suscede antes de la condicion Contador = ");
            System.out.println(contador);
            contador++;
        } while (contador <=5);


        System.out.println("El contador queda en = " + contador);

    }       

}
