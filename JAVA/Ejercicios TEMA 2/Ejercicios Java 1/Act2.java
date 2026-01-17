import java.util.Scanner;

public class Act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Escribe un numero: ");
        int numero = sc.nextInt();

        System.out.println("Has escrito: " + numero);

        sc.close();
    }
}
