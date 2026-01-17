import java.util.Scanner;

public class act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       int edad = 0;
       int acumulador = 0;
       int contadorEdades = 0;

       while (edad >= 0) {
            System.out.println("Dime tu edad: ");
            edad = sc.nextInt();

            if (edad >= 0) {
                contadorEdades = contadorEdades + 1;
                acumulador += edad;
            }
       }

       System.out.println("Hay "+contadorEdades+" alumnos.");
       System.out.println("La suma de todas las edades es: "+acumulador);
       System.out.println("La media de edad es: "+(acumulador/contadorEdades));
        sc.close();
    }
}
