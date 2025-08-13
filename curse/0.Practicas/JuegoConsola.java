
import java.util.Scanner;

public class JuegoConsola {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido a la maquina expendedora de bebidas");
        System.out.println("Elije una opcion de las siguiente");
        System.out.println("1 - Cafe");
        System.out.println("2 - Mate");
        System.out.println("3 - Gaseosa");
        System.out.println("4 - Vino");
        int opcion = input.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Perfecto buenisima eleccion la de el cafe");
                break;
            case 2:
                System.out.println("Debes de ser argentino che");
                break;
            case 3:
                System.out.println("Ten cuidado con el azucar mano");
                break;
            case 4:
            System.out.println("Si tomaste vino no manejes por favor");
                break;
            default:
                System.out.println("Opcion no valida vulva a elejir");
                break;
        }
        if (opcion <= 4) {
            System.out.println("Disfrute de su bebida");
        }


    }
}
