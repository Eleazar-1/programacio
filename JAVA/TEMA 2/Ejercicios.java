import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {
        
        Scanner entradaDatos = new Scanner(System.in);

        int edad;

        System.out.println("Introduce tu edad: ");
        edad = entradaDatos.nextInt();
        edad++;
        //edad +1
        System.out.println("El proximo año tendras " + edad + " años");

    } //Fin del main

}//Fin de clase
