import java.util.Scanner;

public class act11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el numero: ");
        int numero = sc.nextInt();
        int factorial=1;
        

        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial es "+factorial);
        sc.close();
    }
}
