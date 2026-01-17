import java.util.Scanner;

public class ACT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el numero: ");
        int numero = sc.nextInt();

        if (numero %2==0) {
            System.out.println("Es par");
        } else{
            System.out.println("No es par");
        }
        
        sc.close();
    }
}
