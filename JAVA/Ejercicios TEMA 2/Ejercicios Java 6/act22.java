import java.util.Scanner;

public class act22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número (a): ");
        int a = sc.nextInt();

        System.out.print("Introduce el segundo número (b): ");
        int b = sc.nextInt();

        int mayor = (a > b) ? a : b;
        int mcm = mayor;

        while (true) {
            if (mcm % a == 0 && mcm % b == 0) {
                break; 
            }
            mcm++; 
        }

        System.out.println("El mínimo común múltiplo de " + a + " y " + b + " es: " + mcm);
        sc.close();
    }
}
