public class Condicionales {
    public static void main(String[] args) {
        //Recordar importancia parentesis
        boolean resultado1 = true || false && true; // true
        boolean resultado2 = (true|| false) && false; //false

        System.out.println(resultado1);
        System.out.println(resultado2);
        
        /*
         con && si la primera condicion es falsa la seguna no se evalua
         Con & siempre evalua ambas
         */

        int x = -5;
        int y = 10;

        System.out.println("===AND logico &&");
        if (x > 10 && y++ > 0) {
            //Primera condicion es falsa la segunda no se ejecuta
            System.out.println("Ambas son verdaderas");
            
        }

        System.out.println("Valor de y "+y);
    }
}
