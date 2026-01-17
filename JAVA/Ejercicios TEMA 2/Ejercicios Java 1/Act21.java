import java.util.Scanner;

public class Act21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos Mb: ");
        double mb = sc.nextDouble();

        System.out.println("Son: " +(mb * 1000)+ " Kb.");

        sc.close();
    }
}
