import java.util.Scanner;

public class Act12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe el primer numero: ");
        double num1 = sc.nextDouble();

        System.out.println("Escribe el segundo numero: ");
        double num2 = sc.nextDouble();

        double multiplicación = num1 * num2;
        System.out.println("El resultado de la multiplicación es: "+ multiplicación);

        sc.close();
    }
}
