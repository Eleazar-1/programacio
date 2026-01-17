import java.util.Arrays;
import java.util.Scanner;

public class nuevoAhorcado {
    static Scanner sc = new Scanner(System.in);
    static String palabra;

    // Dibuixos del ahorcado
    static String[] figuras = {
        """
           +---+
           |   |
               |
               |
               |
               |
        =========
        """,
        """
           +---+
           |   |
           O   |
               |
               |
               |
        =========
        """,
        """
           +---+
           |   |
           O   |
           |   |
               |
               |
        =========
        """,
        """
           +---+
           |   |
           O   |
          /|   |
               |
               |
        =========
        """,
        """
           +---+
           |   |
           O   |
          /|\\  |
               |
               |
        =========
        """,
        """
           +---+
           |   |
           O   |
          /|\\  |
          /    |
               |
        =========
        """,
        """
           +---+
           |   |
           O   |
          /|\\  |
          / \\  |
               |
        =========
        """
    };

    public static void main(String[] args) {
        int opcion;
        String palabra = "";
        char[] cadena = palabra.toCharArray();
        char[] cadenaOriginal = palabra.toCharArray();

        do {
            opcion = menu(0);
            switch (opcion) {
                case 1:
                    System.out.println("Introduce una palabra");
                    palabra = sc.nextLine();
                    if (palabra.isEmpty()) {
                        System.out.println("=============");
                        System.out.println("Palabra vacia");
                        System.out.println("=============");
                        break;
                    }
                    cadena = palabra.toCharArray();
                    cadenaOriginal = palabra.toCharArray();
                    break;
                case 2:
                    if (cadena == null || cadena.length == 0) {
                        System.out.println("Palabra vacia");
                        break;
                    }
                    System.out.println(juego(cadena, cadenaOriginal));
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 3);
    }

    static int menu(int o) {
        System.out.println("----MENU---");
        System.out.println("1 Introducir palabra");
        System.out.println("2 Adivinar palabra");
        System.out.println("3 Salir");
        o = sc.nextInt();
        sc.nextLine();
        return o;
    }

    static char[] juego(char[] cadena, char[] cadenaOriginal) {
        for (int i = 0; i < cadena.length; i++) {
            cadena[i] = '_';
        }

        int errores = 0;
        final int maxErrores = figuras.length - 1;

        System.out.println(cadena);
        System.out.println(figuras[errores]);

        while (!Arrays.equals(cadena, cadenaOriginal) && errores < maxErrores) {
            System.out.println("Introduce una letra: ");
            char letra = sc.nextLine().charAt(0);

            boolean acierto = false;
            for (int i = 0; i < cadenaOriginal.length; i++) {
                if (letra == cadenaOriginal[i]) {
                    cadena[i] = letra;
                    acierto = true;
                }
            }

            if (!acierto) {
                errores++;
                System.out.println("Letra incorrecta. Errores: " + errores);
            }

            System.out.println(cadena);
            System.out.println(figuras[errores]);
        }

        if (errores == maxErrores) {
            System.out.println("Se acabaron los intentos. ¡Has perdido!");
            System.out.println(figuras[maxErrores]);
        } else {
            System.out.println("¡Has acertado la palabra!");
        }

        return cadena;
    }
}
