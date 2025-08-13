public class ControlFlujo {
    public static void main(String[] args) {
        


        int i;

        for(i = 1; i <= 10; i++){
            System.out.println(i);
            if (i == 5) {
                //break;// Corta el flujo cuando llega al 5
                //continue; //Salta las lineas que continuan de el Scope
                return; // Funciona igual que el break, se corta el scope(Tambien devuelve valores en otras estructuras)
            }
            System.out.println(i);
        }

    }
}
