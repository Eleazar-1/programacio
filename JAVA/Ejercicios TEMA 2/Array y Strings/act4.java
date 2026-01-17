import java.util.Scanner;

public class act4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime tu nombre: ");
        String palabra = sc.nextLine();
        
        String[] letras = palabra.split(""); 

        for (String letra : letras) {
            System.out.print(letra + " ");
        }

        sc.close();
    }
}
