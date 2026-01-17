import java.util.Scanner;

public class act17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena:");
        String cadena = sc.nextLine();

        String[] palabras = cadena.split(" ");
        String resultado = "";

        for (String palabra : palabras) {
            String palabraInvertida = "";
            for (int i = palabra.length() - 1; i >= 0; i--) {
                palabraInvertida += palabra.charAt(i);
            }
            resultado += palabraInvertida + " ";
        }

        System.out.println("Cadena con palabras invertidas:");
        System.out.println(resultado.trim());
        sc.close();
    }
}
