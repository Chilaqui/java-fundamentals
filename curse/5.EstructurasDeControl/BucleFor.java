import java.util.Scanner;

public class BucleFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // for(Inicializacion; Condicion; Actualizacion)
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        //Inicializacion por fuera 
        int a;

        for(a = 1; a <= 10; a++){
            System.out.println(a);
        }

        //Inicializacion por fuera pero con un for por dentro(Hace que el for de dentro primero se acomplete y despues siga con el siguiente, pero vulave a ejecutarse)

        int i;

        for(i = 1; i <= 3; i++){
            for(int j = 0; j <=3; j++){
                System.out.print("i: ");
                System.out.print(i);
                System.out.print("j: ");
                System.out.println(j);
            }
        }



    }

}
