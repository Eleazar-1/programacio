import java.util.Scanner;

public class ACT5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Introduce el numero: ");
        int numero2 = sc.nextInt();
        System.out.println("-------------------");

        if (numero1>numero2) {
            System.out.println(numero1);
            System.out.println(numero2);
        } else {
            System.out.println(numero2);
            System.out.println(numero1);
        }
        
        
        sc.close();
    }
}
