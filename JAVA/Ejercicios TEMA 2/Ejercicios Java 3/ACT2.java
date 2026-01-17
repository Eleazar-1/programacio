import java.util.Scanner;

public class ACT2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Introduce el numero: ");
        int numero2 = sc.nextInt();

        if (numero1==numero2) {
            System.out.println("Son igual");
        } else{
            System.out.println("No son igual");
        }
        
        sc.close();
    }
}
