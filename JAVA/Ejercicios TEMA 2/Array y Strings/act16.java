import java.util.Scanner;

public class act16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una cadena:");
        String cadena = sc.nextLine();

        System.out.println("¿Qué palabra quieres eliminar? (posición k, empezando desde 1):");
        int k = sc.nextInt();

        String[] palabras = cadena.split("\\s+");

        if (k < 1 || k > palabras.length) {
            System.out.println("La posición k no es válida.");
        } else {
            String nuevaCadena = "";
            for (int i = 0; i < palabras.length; i++) {
                if (i != k - 1) {
                    nuevaCadena += palabras[i] + " ";
                }
            }
            System.out.println("Cadena resultante:");
            System.out.println(nuevaCadena.trim());
    
        }   
        sc.close();
    }
}
