public class bucles {

    public static void main(String[] args) {
        // //BUCLES ANIDADOS

        // System.out.println("===Bucles anidados: Tabla de multiplicar");

        // //BUCLE EXTERNO
        // for (int tabla = 0; tabla <=10; tabla++) { //BUCLE EXTERNO
        //     System.out.println("\n Tabla del "+tabla);
        //     System.out.println("------------");

        //     for (int mult = 0; mult <= 10; mult++) {//BUCLE INTERNO
        //         int resultado = tabla * mult;

        //         System.out.printf("%d x %2d = %4d%n", tabla, mult,resultado); //FIN DEL BUCLE INTERNO
        //     }
        // }//FIN DEL BUCLE EXTERNO

        //Bucle dependientes. El valor de la variable del bucle interno depende de la externa

        for (int i = 1; i <= 3; i++) {
            System.out.println("Bucle externo , i= "+i);
            int j = 1;

            while (j <= i) {
                System.out.println("Bucle interno , j="+j);
                j++;
            }
        }

        //BUCLES INDEPENDIENTES
        for (int i = 1; i < 5; i++) {
            System.out.println(i+ " ");
        }
        for (int i = 10; i <= 17; i++) {
            System.out.println(i+" ");
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i: "+i+", j: "+j);
            }
        }

        /*
         *
         * *
         * * *
         * * * * 
        */

        System.out.println("\n Triangulo de asteriscos ");
        int numFilas = 5;

        for (int i = 1; i <= numFilas; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                
            }
            System.out.println("hola");
        }
    }
}