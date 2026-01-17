import java.util.Scanner;

public class act21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número (a): ");
        int a = sc.nextInt();

        System.out.print("Introduce el segundo número (b): ");
        int b = sc.nextInt();

        int menor = (a < b) ? a : b;  
        int mcd = 1;                  
        for (int i = menor; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                mcd = i;             
                break;               
            }
        }

        System.out.println("El máximo común divisor de " + a + " y " + b + " es: " + mcd);
        sc.close();
    }
}
