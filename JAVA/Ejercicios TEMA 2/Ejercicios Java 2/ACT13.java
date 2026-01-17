import java.util.Scanner;

public class ACT13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el primer número: ");
        double n = sc.nextDouble();

        System.out.println("Introduce el primer número: ");
        double m = sc.nextDouble();

        double resultado = n % m;
        
        if (resultado == 0) {
            System.out.println(n + " es multiplo de " + m);
        } else{
            System.out.println(m - resultado+" es lo que falta para llegar.");
        }

        sc.close();
    }
}
