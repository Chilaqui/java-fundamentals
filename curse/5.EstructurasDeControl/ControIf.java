public class ControIf {
public static void main(String[] args) {
    
    int edad = 60;


    if (edad > 18 && edad <= 59) {
        System.out.println("Puedes entrar a la disco");
    }else if (edad >= 60) {
        System.out.println("No puedes entrar a la disco, ya eres muy grande");
    }
    else if (edad == 18) {
        System.out.println("Tienes la edad justa para entrar, no te olvides de tu id");
    }
    else{
        System.out.println("No tienes edad suficiente para entrar a la disco");
    }


}
}
