import java.util.ArrayList;
import java.util.Scanner;

public class act8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime una frase capicua: ");
        String frase = sc.nextLine();

        String alreves = "";

        for (int i = frase.length()-1; i >= 0; i--) {
            char letra = frase.charAt(i);
            alreves+=letra;
        }

        

        if (frase.equals(alreves)) {
            System.out.println("La frase es palindroma");
        }else{
            System.out.println("La frase no es palindroma");
        }
        
        sc.close();
    }
}
