import java.util.Scanner;

public class act3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe tu nombre: ");
        String nombre = sc.nextLine();

        String mayuscula = nombre.substring(0, 1).toUpperCase() + nombre.substring(1);
        
        System.out.println(mayuscula);

        sc.close();
    }
}
