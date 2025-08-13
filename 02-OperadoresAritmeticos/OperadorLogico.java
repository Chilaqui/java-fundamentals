public class OperadorLogico {
    public static void main(String[] args) {

        //Estructurs loicas
        
        boolean condicional1 = true;
        boolean condicional2 = false;



        boolean resultadoAnd = condicional1 && condicional2;
        boolean resultadoOR = condicional1 || condicional2;
        boolean resultadoNOT = !condicional1;

        System.out.println(resultadoAnd);
        System.out.println(resultadoOR);
        System.out.println(resultadoNOT);
        
    }

}
