import java.util.Scanner;

public class act13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorDesordenados = 0;
        int anterior = Integer.MIN_VALUE; 

        System.out.println("Introduce números (termina con un número negativo):");

        while (true) {
            int actual = sc.nextInt();

            if (actual < 0) {
                break;
            }

            if (actual < anterior) {
                contadorDesordenados++;
            }

            anterior = actual;
        }

        System.out.println("Cantidad de números fuera de orden ascendente: " + contadorDesordenados);
        sc.close();
    }
}
