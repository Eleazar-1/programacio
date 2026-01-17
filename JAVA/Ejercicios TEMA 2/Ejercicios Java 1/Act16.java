import java.util.Scanner;

public class Act16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuanto mide la base?: ");
        double base = sc.nextDouble();

        System.out.println("Cuanto mide la altura?: ");
        double altura = sc.nextDouble();

        double area = (base * altura) /2;

        System.out.println("El area es: "+ area+  " cm.");

        sc.close();
    }
}
