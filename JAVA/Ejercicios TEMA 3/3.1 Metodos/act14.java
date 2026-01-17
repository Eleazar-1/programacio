import java.util.Scanner;

public class act14 {

    static Scanner sc = new Scanner(System.in);

    static void llenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Introduce el valor " + (i+1) + ": ");
            vector[i] = sc.nextInt();
        }
    }

    static boolean esNumeroPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    static boolean esNumeroImparDePrimos(int[] vector) {
        int contador = 0;
        for (int n : vector) {
            if (esNumeroPrimo(n)) contador++;
        }
        return contador % 2 == 1; 
    }

    static boolean noTieneNumerosPrimos(int[] vector) {
        for (int n : vector) {
            if (esNumeroPrimo(n)) return false;
        }
        return true;
    }

    static void mostrarMinMaxMedia(String nombreVector, int[] vector) {
        int min = vector[0], max = vector[0], suma = 0;
        for (int n : vector) {
            if (n < min) min = n;
            if (n > max) max = n;
            suma += n;
        }
        double media = (double) suma / vector.length;
        System.out.println(nombreVector + " -> Mínimo: " + min + ", Máximo: " + max + ", Media: " + media);
    }

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Vector1 (7 enteros, correcto si nº impar de primos)");
            System.out.println("2. Vector2 (5 enteros, correcto si no tiene primos)");
            System.out.println("3. Vector3 (5 enteros, mostrar min, max y media)");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    int[] v1 = new int[7];
                    llenarVector(v1);
                    if (esNumeroImparDePrimos(v1)) {
                        System.out.println("Vector1 es CORRECTO (número impar de primos).");
                    } else {
                        System.out.println("Vector1 NO es correcto.");
                    }
                    break;

                case 2:
                    int[] v2 = new int[5];
                    llenarVector(v2);
                    if (noTieneNumerosPrimos(v2)) {
                        System.out.println("Vector2 es CORRECTO (no tiene primos).");
                    } else {
                        System.out.println("Vector2 NO es correcto.");
                    }
                    break;

                case 3:
                    int[] v3 = new int[5];
                    llenarVector(v3);
                    mostrarMinMaxMedia("Vector3", v3);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);

        sc.close();
    }
}
