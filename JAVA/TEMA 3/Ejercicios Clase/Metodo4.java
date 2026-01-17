import java.util.Scanner;

public class Metodo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * Crea un metodo analizarPalabra(String palabra) que:
         * Cuenta las vocales y consonantes
         * Detecte si la palabra es palindroma
         * Devuelve una cadena con el analisis
        */
        
        String vocales = "aeiouáéíóúAEIOUÁÉÍÓÚ";

        int contadorVocales=0;
        int contadorConsonantes=0;

        System.out.println("Introduce una palabra");
        String palabra = sc.nextLine();

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            if (vocales.indexOf(letra) != -1) {
                contadorVocales+=1;
            }else{
                contadorConsonantes+=1;
            }
        }

        System.out.println("Vocales: "+contadorVocales+", consonantes: "+contadorConsonantes+".");
        sc.close();

        String alreves= "";
        for (int i = palabra.length()-1; i >=0; i--) {
            char letra = palabra.charAt(i);
            alreves+=letra;
        }

        System.out.println("alreves: "+alreves);
        
        if (palabra.equals(alreves)) {
            System.out.println("Es palindroma");
        }else{
            System.out.println("No es palindroma");
        }

    }

}
