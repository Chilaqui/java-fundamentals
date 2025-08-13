package calculadora;

import java.util.Scanner;

public class calculadora {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bienvenido a la calculadora...");
        System.out.println("Que operacion desea realizar?");        

        System.out.println("1.Suma");        
        System.out.println("2.Resta");
        System.out.println("3.Multiplicacion");
        System.out.println("4.Divicion");
        String men = input.nextLine();

        switch (men) {
            case "1": 
            System.out.println("Numero 1: ");
            int num1 = input.nextInt();
            System.out.println("Numero 2: ");
            int num2 = input.nextInt();
            int operacion = num1 + num2;
            System.out.println("Resultado:" + operacion);
            break;

            case "2":  
            System.out.println("Numero 1: ");
            num1 = input.nextInt();
            System.out.println("Numero 2: ");
            num2 = input.nextInt();
            operacion = num1 - num2;
            System.out.println("Resultado:" + operacion);
            break;

            case "3": 
            System.out.println("Numero 1: ");
            num1 = input.nextInt();
            System.out.println("Numero 2: ");
            num2 = input.nextInt();
            operacion = num1 * num2;
            System.out.println("Resultado:" + operacion);
            break;

            case "4":  
            System.out.println("Numero 1: ");
            num1 = input.nextInt();
            System.out.println("Numero 2: ");
            num2 = input.nextInt();
            operacion = num1 / num2;
            System.out.println("Resultado:" + operacion);
            break;
        }


    }
}
