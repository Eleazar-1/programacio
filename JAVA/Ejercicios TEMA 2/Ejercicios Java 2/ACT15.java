import java.util.Scanner;

public class ACT15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el coficiente a: ");
        double a = sc.nextDouble();

        System.out.println("Introduce el coficiente b: ");
        double b = sc.nextDouble();

        System.out.println("Introduce el coficiente c: ");
        double c = sc.nextDouble();

        System.out.println("Introduce el coficiente x: ");
        double xbase = sc.nextDouble();
        double exponente = 2;

        double potencia = Math.pow(xbase, exponente);

        double formulaY = a*potencia+b*xbase+c;

        System.out.println("El valor de y es: "+formulaY);

        sc.close();
    }
}
