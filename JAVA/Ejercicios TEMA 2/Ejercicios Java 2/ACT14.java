import java.util.Scanner;

public class ACT14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base: ");
        double base = sc.nextDouble();

        System.out.println("Introduce la altura: ");
        double altura = sc.nextDouble();

        double area = (base * altura) /2;
        
        System.out.println("El area es de: " + area + " cm.");

        sc.close();
    }
}
