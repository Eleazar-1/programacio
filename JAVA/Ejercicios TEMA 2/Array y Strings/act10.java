import java.util.ArrayList;
import java.util.Scanner;

public class act10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("-----MENÚ------");
            System.out.println("1-Saludar");
            System.out.println("2-Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("¡Hola!");
                    break;
                case 2:
                    System.out.println("Has salido");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion != 2);

        sc.close();
    }
}