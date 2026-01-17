public class ambitos {
    public static void main(String[] args) {
        /*
         El ambito o "scope" determina la parte del programa donde una variable es accesible o puede ser utilizada

         Tipos de ambitos principales
         - Ambito de bloque: dentro de las llaves
         - Ambito de método o funcion. Las declaradas dentro de este metodo
         -Ambito de clase
        */

        System.out.println("Vriables en el metodo principal o main");
        
        int a = 1;
        int b = 2;
        int c = 3;
        //bloque interno

        {
            a++;
            b+=c;
            int d = a; //Solo esta dentro de este bloque
        } //fin bloque interno

        //d=1
        {
            int e = b;
        }
        // e++;

        //AMBITOS EN ESTRUCTURA DE CONTROL
        //Las variables declaradas dentro de estructuras como if/for/while solo existen dentro de ese bloque

        //if (6>5) 
            int numero = 6;
            System.out.println("Se cumple la condicion");

        //EJEMPLO evitar division por cero
        double i = 5, j =10;

        if (i !=0) {
            System.out.println("i no es igual que cero");
            double d = j/i;
            System.out.println("j / i "+d);
        }
        i++;;

        int n1 = 0;
        int n2 = 0;

        if (n1 > n2)
            
    }//ambito de metodo
} //ambito de clase
