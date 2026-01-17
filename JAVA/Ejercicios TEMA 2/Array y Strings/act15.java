import java.util.Scanner;

public class act15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena:");
        String cadena = sc.nextLine();

        cadena = cadena.trim();

        if (cadena.isEmpty()) {
            System.out.println("Número de palabras: 0");
        } else {
            String[] palabras = cadena.split("\\s+");
            System.out.println("Número de palabras: " + palabras.length);
        }
        sc.close();
    }
}
