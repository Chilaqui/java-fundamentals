public class EstructuraSwitch {
    public static void main(String[] args) {

        String bebida = "Mate";

        if (bebida == "Cafe") {
            System.out.println("Buenisima eleccion, de paso convinalo con leche");
        } else if (bebida == "Mate") {
            System.out.println("Tienes que ser argentico o paraguayo");
        }else if (bebida == "Gaseosa") {
            System.out.println("Ten cuidado con el azzucar eso es peligroso");
        } else if (bebida == "Vino") {
            System.out.println("Si tomaste vino no manejes por favo");
        }else{
            System.out.println("Disfruta tu bebida");
        }

        switch (bebida) {
            case "Cafe":System.out.println("Buenisima eleccion, sigue programando");break;
            case "Mate":System.out.println("Tienes que ser paraguayo o argentino");break;
            case "Gaseosa":System.out.println("Cuidado con el azucar mano");break;
            case "Vino":System.out.println("Si tomas  no manejes por favor");break;
            case "Agua":System.out.println("Buena eleccion con el agua mano");break;
            default:
                break;
        }


    }
}
