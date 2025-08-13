public class App {

    public static void main(String[] args) {
        // Operadores que sirven para hacer operaciones con variables o valores
        // Aritmeticos

        int a = 5;
        int b = 4;
        double c = a / b;

        // Resto Par

        int v = 12;
        int g = v % 2;

        // Asignacion

        int ru = 5;
        ru = 10;
        ru += 5;
        ru -= 5;
        ru *= 3;
        ru /= 2;
        ru++;
        ru++;
        ru--;

        // Operadores de comparacion

        int co = 3;
        int co2 = 4;

        boolean esMayor = co > co2;
        boolean esMenor = co < co2;
        boolean esIgual = co == co2;

        // Opreadores de Logica

        boolean condicion1 = true;
        boolean condicion2 = false;

        boolean resultadoAND = condicion1 && condicion2; //Ambos deben ser positivos para dar true
        boolean resultadoOR = condicion1 || condicion2; // uno de los dos debe ser positivo para que de true
        boolean resultadoNOT = !condicion1; // Lo opuesto a lo que tenga asignado previamente

        System.out.println(c);
        System.out.println(g);// si g es 0 es par y si es 1 es impar
        System.out.println(ru);
        System.out.println(esMayor);
        System.out.println(esMenor);
        System.out.println(esIgual);
        System.out.println(resultadoAND);
        System.out.println(resultadoOR);
        System.out.println(resultadoNOT);

    }
}
