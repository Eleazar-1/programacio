import java.util.Scanner;

public class act20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número n: ");
        int n = sc.nextInt();

        for (int fila = 1; fila <= n; fila++) {
    
            for (int espacio = 1; espacio <= n - fila; espacio++) {
                System.out.print(" ");
            }

            for (int col = 1; col <= fila; col++) {
                System.out.print("* ");
            }

            System.out.println(); 
        }

        sc.close();
    }
}
