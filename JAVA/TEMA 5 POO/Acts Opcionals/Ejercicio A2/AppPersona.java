import java.util.Scanner;

public class AppPersona {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce el DNI: ");
        String dni = sc.nextLine();

        System.out.println("Introduce tu nombre: ");
        String nombre = sc.nextLine();

        System.out.println("Introduce tus apellidos: ");
        String apellidos = sc.nextLine();

        System.out.println("Introduce la edad: ");
        int edad = sc.nextInt();


        Persona p1 = new Persona(dni, nombre, apellidos, edad);
        p1.mostrarDatos();
        System.out.println
        
        ("======================================");
        sc.nextLine();
        System.out.println("Introduce el DNI: ");
        String dni2 = sc.nextLine();

        System.out.println("Introduce tu nombre: ");
        String nombre2 = sc.nextLine();

        System.out.println("Introduce tus apellidos: ");
        String apellidos2 = sc.nextLine();

        System.out.println("Introduce la edad: ");
        int edad2 = sc.nextInt();
        Persona p2 = new Persona(dni2, nombre2, apellidos2, edad2);
        p2.mostrarDatos();

        System.out.println(p1.esMayor(edad));
        System.out.println(p2.esMayor(edad2));
        
        
    }
}