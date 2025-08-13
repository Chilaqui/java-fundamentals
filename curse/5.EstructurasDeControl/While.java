import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contador = 1;

        while (contador <= 5) {
            System.out.println(contador);
            contador++;//Actualizacion de la variable
        }
        
        System.out.println("El contador queda en un numero mas, por que ya fue sumado Contador = " + contador);

    }
}
