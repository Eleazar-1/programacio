import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        
        
        int edad = 0;
        edad = 23;
        
        /*
         * Array, tabla, vector, arreglo
         * Analogia -> Archivador con cajones.
         * Todos los cajones guardan el mismo tipo de documento
         * Cada cajon tiene su numero (indice)
         * 
         * Caracteristicas clave
         *      Mismo tipo de datos. Todos sus elementos deben de ser del mismo tipo
         *      Tamaño fijo. Una vez creamos el array no podem modificar su tamaño
        */

         //Declaración e inicializacion

         int datos [];//SERÁ UN ARRAY DE ENTEROS
         datos = new int[4]; //CREAR EL ARRAY (instanciar)RESERVAMOS EN MEMORIA EL TAMAÑO
         //fijo de 4 enteros

         //ASIGNAR VALORES A CADA ELEMENTO. Lo hacemos por el indice
         System.out.println("ASIGNAR VALORES");
         datos [0] = 2;
         datos [1] =-3;
         datos [2] = 0;
         datos [3] = 7;//ULTIMO ELEMENTO (TAMAÑO -1)

         datos[1]= 8 * datos[3];
        
        //conocer lonigitud array
        int lonigitud = datos.length; //EMPIEZA POR 1

        System.out.println("El tamaño del array de datos es "+lonigitud);
         
        //RECORRER EL array con for tradicional

        for (int i = 0; i < datos.length; i++) {
            System.out.println("El valor de datos["+i+"] es "+datos[i]);
        }

        //Declarar, crear y asignar valores al mismo tiempo

        double[] numDobles = {10,23.5,15,7,8,9};

        int edades [];

        //Acceso a elementos por su índice 

        System.out.println("El valor de la posicion 5 del array numDobles es "+numDobles);

        //RECORRER ARRAYS CON FOR EACH

        /*
         * Forma simplificada para recorrer un array
         * Se suele usar para ** leer ** los valores
         * Sintaxis
         * 
         * for (TipodeDato nombreVariableTemporal : nombredelArray){
         * .....
         * }
         */

        System.out.println("\n Nombre de los alumnos con forEach");
        String nombreAlumnos[]={"Ana", "Luis", "Carlos"};

        for (String nombre : nombreAlumnos) {
            System.out.println(" - "+nombre);
        }

        //RECORRER ARRAYS CON VALORES POR DEFECTO

        System.out.println("RECORRER ARRAYS CON VALORES POR DEFECTO");

        double[] datos1 = new double[5];
        for (int i = 0; i < datos1.length-1; i++) {
            System.out.println("datos1: Valor"+i+" "+datos1[i]);
        }

        //RELLENAR CON NUMEROS ALEATORIOS

        int datos2 []= new int[10];
        System.out.println("Datos aleatorios");

        for (int i = 0; i < datos2.length; i++) {
            datos2[i] = (int)(Math.random()*20);
            System.out.println("Datoas2["+i+" ]--> "+datos2[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos nombres quieres introducir?");
        int cantidad = sc.nextInt();
        sc.nextInt();

        String nombresAlumnos []= new String[cantidad];

        System.out.println("\n Introducir los nombres de los alumnos: ");
        
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Introduce el nombre del alumno "+(i+1)+": ");
            nombresAlumnos[i] = sc.nextLine();
        }

        for (String nombres : nombresAlumnos) {
            System.out.println(nombres);
        }

        

        sc.close();
    }
}
