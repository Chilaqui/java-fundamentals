public class IfElse {

    public static void main(String[] args) {

         int edad = 61;

         if (edad > 18 && edad <= 60) {
            System.out.println("Puedes entrar al boliche");
         }else if (edad > 60) {
            System.out.println("Estas un poco viejo pra entrar a esta disco");
         }
         else if (edad == 18) {
            System.out.println("Tienes la edad justo, tenee cuidado");
         }else if (edad < 18) {
            System.out.println("heeeee no tenes la edad suficiente");
         }
         else{
            System.out.println("dato erroneo");
         }
    }
}
