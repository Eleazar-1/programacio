import java.util.Random;
import java.util.Scanner;

public class act12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la longitud de la contraseña: ");
        int longitud = sc.nextInt();

        String password = generarPassword(longitud);

        System.out.println("Contraseña generada: " + password);

        sc.close();
    }
    static char generarNumero() {
        return (char) ('0' + (int)(Math.random() * 10));
    }

    static char generarMayuscula() {
        return (char) ('A' + (int)(Math.random() * 26));
    }

    static char generarMinuscula() {
        return (char) ('a' + (int)(Math.random() * 26));
    }

    static String generarPassword(int longitud) {
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int tipo = (int)(Math.random() * 3); 
            if (tipo == 0) {
                password.append(generarNumero());
            } else if (tipo == 1) {
                password.append(generarMayuscula());
            } else {
                password.append(generarMinuscula());
            }
        }
        return password.toString();
    }
}