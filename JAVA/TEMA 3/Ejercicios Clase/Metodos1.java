public class Metodos1 {

    public static void main(String[] args) {
        System.out.println("Hola, 1DAW");
        System.out.println("Hola 1 daw");
        System.out.println("hola");
    
        //Metodo, funcion, procedimiento. INVOCO
        tresSaludos();
        System.out.println("Continuacion del main");
        tresSaludos();
        tresSaludos();

        variosSaludos(5);
        variosSaludos(1);
    
        dineroAhorrado(7, 8, 9, "joan");
    }//fin main

    static void dineroAhorrado(int num1, int num2, int num3, String nombre){
        int resultado = num1 + num2 + num3;
        System.out.println("El ahorro total es: "+resultado);
        System.out.println(nombre+" tiene ahorrados "+resultado+" euros");
    }

    static void variosSaludos(int veces){//variable entero local
        for (int i = 0; i < veces; i++) {
            System.out.println("Hola, 1 DAW "+veces);
        }

    }

    static void tresSaludos(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hola, 1 DAW con metodo funcion");
        }
    }
}//fin clase Metodos1