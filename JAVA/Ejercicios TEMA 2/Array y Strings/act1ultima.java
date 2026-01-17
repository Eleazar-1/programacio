import java.util.Scanner;

public class act1ultima {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el texto a cifrar:");
        String texto = sc.nextLine();

        System.out.println("Introduce el desplazamiento (número entero):");
        int desplazamiento = sc.nextInt();

        String textoCifrado = "";

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);

            if (Character.isUpperCase(c)) {
                c = (char) ((c - 'A' + desplazamiento) % 26 + 'A');
            } else if (Character.isLowerCase(c)) {
                c = (char) ((c - 'a' + desplazamiento) % 26 + 'a');
            }
            textoCifrado += c;
        }

        System.out.println("Texto cifrado:");
        System.out.println(textoCifrado);
        sc.close();
    }
}