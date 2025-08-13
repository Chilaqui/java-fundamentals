package calculadora;

import java.util.Scanner;

public class CalculadoraMet {

    static class Menu{

        public void mostrarMenu(){
            System.out.println("Bienvenido ¿Que Operacion deseas realizar?");
            System.out.println("1.Suma");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Divicion");
            System.out.println("5.Salir");
        }

        
    }

    class Operaciones{

        private int num1;
        private int num2;

        public Operaciones(int num1, int num2){

        }

        public int sumar() {
            return num1 + num2;
        }
        public int restar(){
            return num1 - num2;
        }
        public int multi(){
            return num1 * num2;
        }
        public int div(){
            return num1 / num2;
        }

    }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Menu menu = new Menu();
    Operaciones op = new Operaciones(a, b);

    menu.mostrarMenu();
    System.out.println("Eleccion");
    int opcion = input.nextLine(); 

    if (condition) {
        
    }
    
  }

}
