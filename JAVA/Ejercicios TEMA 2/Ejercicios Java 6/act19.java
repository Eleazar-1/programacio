import java.util.Scanner;

public class act19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número n: ");
        int n = sc.nextInt();

        int contadorPrimos = 0;

        for (int i = 2; i <= n; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break; 
                }
            }
            if (esPrimo) {
                contadorPrimos++;
            }
        }

        System.out.println("Hay " + contadorPrimos + " números primos entre 1 y " + n);
        sc.close();
    }
}
