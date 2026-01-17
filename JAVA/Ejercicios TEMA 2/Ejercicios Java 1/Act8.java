import java.util.Scanner;

public class Act8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Crear un objeto para leer lo que escribe el usuario
        
        System.out.println("Indica tu edad: ");
        int edad = sc.nextInt();
        
        boolean Mayor = edad >= 18; //Un boleano que determina una condicion, si se cumple o no se puede usar como un if sin hacer comparacion

        if (Mayor) {
            System.out.println("Eres mayor de edad.");
        } else{
            System.out.println("No eres mayor de edad.");
        }
        sc.close(); //Cerrar el scanner
    }

}
