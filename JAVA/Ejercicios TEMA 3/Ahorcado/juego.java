import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class juego {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String palabra;

        do {
            System.out.println("Introduce una palabra: ");
            palabra = sc.nextLine();
        } while (palabra.equals(null));

        char [] cadena = palabra.toCharArray();
        char [] cadenaOriginal = palabra.toCharArray();

        for (int i = 0; i < cadena.length; i++) {
            cadena[i]='_';
        }
        System.out.println(cadena);
        do {
            System.out.println("Introduce una letra: ");
            char letra = sc.nextLine().charAt(0);
            if (letra==' ') {
                System.out.println("No has introducido letra: ");
                sc.next();
                continue;
            }
            for (int i = 0; i < cadenaOriginal.length; i++) {
                if (letra==cadenaOriginal[i]) {
                    cadena[i]=letra;
                }
            }
            System.out.println(cadena);
        } while (!Arrays.equals(cadena, cadenaOriginal));
        if (cadena==cadenaOriginal) {
            System.out.println("HAS GANADO!!");
        }

        sc.close();
    }

    //static char [] ocultarPalabra(char []p){
    //    for (int i = 0; i < p.length(); i++) {
    //        p[i]='_';
    //    }
    //}

    static String ponerLetra(String palabra, char letra){
        //Si letra introducido está dentro de la palabra introducida, intercambiar "_" por la letra.
        //Luego mostrar la palabra con la letra ya cambiada y sus restantes "_"
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                char guion = '_';
                palabra.replace(guion, letra);
            }
        }
        return palabra;
    }

}