import java.util.Scanner;

public class Act4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime el año actual: ");
        int añoActual = sc.nextInt();

        System.out.print("En que año naciste: ");
        int añoNacimiento = sc.nextInt();

        System.out.println("Tu edad es: " + (añoActual - añoNacimiento) );
    }
}
