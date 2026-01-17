import java.util.Scanner;

public class ACT21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el 1er numero: ");
        int a = sc.nextInt();
        System.out.println("Introduce el 2o numero: ");
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("true"); 
        } else {
            System.out.println("false");
        }
        sc.close();
    }
}
