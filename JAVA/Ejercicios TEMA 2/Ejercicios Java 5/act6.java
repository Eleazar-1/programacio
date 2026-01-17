import java.util.Scanner;

public class act6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero");
        int numero = sc.nextInt();

        for (int i = numero; i >= 1; i--) {
            System.out.println("El numero: "+i);

        }

        sc.close();
    }
}
