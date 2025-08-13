public class Switch {
    public static void main(String[] args) {

        // Que tipo de bebida te gusta

        String bebida = "Vino";

        //Solucion con IF
        if (bebida == "Cafe") {
            System.out.println("Perfecto buenisima ellecion la del cafe");
        }else if (bebida == "Mate") {
            System.out.println("Debes de ser argentio cheee");
        }else if (bebida == "Gaseosa") {
            System.out.println("Ten cuidado con el azumar mano");
        }else if (bebida == "Vino") {
            System.out.println("Si tomaste vino, no manejes por favor");
        }else{
            System.out.println("Disfruta de tu bebida");
        }

        //Solucion con Switch

        switch (bebida) {
            case "Cafe":
                System.out.println("(Switch) Perfecto buenisima eleccion la de el cafe");
                break;
            case "Mate":
                System.out.println("(Switch) Debes de ser argentino che");
                break;
            case "Gaseosa":
                System.out.println("(Switch) Ten cuidado con el azucar mano");
                break;
            case "Vino":
            System.out.println("(Switch) Si tomaste vino no manejes por favor");
                break;
            default:
                System.out.println("(Switch) Disfruta de tu bebida");
                break;
        }

        
    }
}
