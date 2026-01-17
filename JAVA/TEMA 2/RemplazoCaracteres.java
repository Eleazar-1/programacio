import java.util.Scanner;

public class RemplazoCaracteres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe una frase: ");
        String frase = sc.nextLine();
        
        String fraseCambiada = frase.replace(" ", "_");
        
        System.out.println("CAMBIO: "+fraseCambiada);
        sc.close();
    }
}
