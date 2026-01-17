import java.util.Scanner;

public class Act15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuanto mide el primer lado?: ");
        double lado1 = sc.nextDouble();

        System.out.println("Cuanto mide el segundo lado?: ");
        double lado2 = sc.nextDouble();

        double area = lado1 * lado2;

        System.out.println("El area es: "+ area+  " cm.");

        sc.close();
    }
}
