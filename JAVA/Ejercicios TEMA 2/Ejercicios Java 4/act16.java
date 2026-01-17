import java.util.Scanner;

public class act16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe un numero: ");
        int numero = sc.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinc");
                break;
            case 6:
                System.out.println("Sis");
                break;
            case 7:
                System.out.println("Set");
                break;
            case 8:
                System.out.println("Vuit");
                break;
            case 9:
                System.out.println("Nou");
                break;
            case 10:
                System.out.println("Deu");
                break;
            default:
                break;
        }

        sc.close();
    }
}