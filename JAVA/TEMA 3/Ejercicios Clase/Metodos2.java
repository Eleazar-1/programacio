import java.util.Random;

public class Metodos2 {
    public static void main(String[] args) {
        System.out.println("Vamos a usar la funcion suma y el resultado es "+suma(4, 7));

        System.out.println("Vamos a usar la funcion suma y el resultado es "+suma(3, 100));

        int n1 = 5;
        int n2 = 3;
        suma(n1, n2);
        System.out.println("La operacion es "+suma(n1, n2));
        
        System.out.println("El resultado de la suma es "+suma(99, 54));
        System.out.println("El resultado de la suma es "+suma(99, 54, 66));
        
        int arrayEjemplo[] = {10,15,65,52,14,21};
        mostrarArray(arrayEjemplo);
        
        System.out.println("\n Nuevo array aleatorio");
        int arrayEjemplov2 []= creaArray(2);
        mostrarArray(arrayEjemplov2);

        //podriamos hacerlo
        System.out.println("Version 2");
        int numeroElementos = 5;
        mostrarArray(arrayEjemplov2);
        //Invoco a los metodos
    
    
    
    }//main

    static int [] creaArray(int elementos){
        int [] arrayEnteros = new int[elementos];
        Random r = new Random();

        for (int i = 0; i < arrayEnteros.length; i++) {
            arrayEnteros[i]=r.nextInt(100);//3 //15
        }
        return arrayEnteros;
    }

    //Siempe van los metodos

    //Sobrecarga de metodos
    //Java permite 2 o mas funciones con el mismo nombre
    //Se distingen por su numero de parametros. No por el tipo de dato que devuelven

    static void mostrarArray(int []nomArray){
        for (int i = 0; i < nomArray.length; i++) {
            System.out.println("[]"+nomArray[i]+"]");
        }
    }

    static double suma (double a, double b){
        double resultado = a+b;
        return resultado;
    }
    static int suma(int a, int b, int c){
        int resultado = a+b+c;
        return resultado;
    }

    static int suma(int a, int b){
        int resultado = a+b;
        return resultado;
    }

}//fin clase Metodos2
