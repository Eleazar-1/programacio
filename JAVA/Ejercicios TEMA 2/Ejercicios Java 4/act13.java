import java.util.Scanner;

public class act13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entre 0 y 9999: ");
        int numero = sc.nextInt();

        if (numero < 0 || numero > 9999) {
            System.out.println("El número debe estar entre 0 y 9999.");
        } else {
            // extraer las cifras
            int unidad = numero % 10;
            int decena = (numero / 10) % 10;
            int centena = (numero / 100) % 10;
            int millar = numero / 1000;

            boolean capicua = false;

            if (numero < 10) {
                capicua = true; 
            } else if (numero < 100) {
                capicua = (unidad == decena); 
            } else if (numero < 1000) {
                capicua = (unidad == centena); 
            } else {
                capicua = (unidad == millar) && (decena == centena); 
            }

            if (capicua) {
                System.out.println("El número " + numero + " es capicúa.");
            } else {
                System.out.println("El número " + numero + " no es capicúa.");
            }
        }
    }
}
