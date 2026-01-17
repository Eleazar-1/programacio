import java.util.Scanner;

public class Ejercicio2b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        int[] contarPV = contadorVocalesYcontadorConsonantes(palabra);
        int totalVocales = contarPV[0];
        int totalConsonantes = contarPV[1];

        System.out.println("Vocales "+totalVocales);
        System.out.println("");
    }

    static int[] contadorVocalesYcontadorConsonantes(String palabra){
        int vocales = 0;
        int consonantes = 0;

        String vocalesReferencia = "aeiou";

        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            //Esta en la lista de vocales?

            if (vocalesReferencia.indexOf(letra)!=-1) {
                vocales++;
            }else{
                consonantes++;
            }
        }
        return new int []{vocales, consonantes};
    }

    static boolean esPalindroma
}
