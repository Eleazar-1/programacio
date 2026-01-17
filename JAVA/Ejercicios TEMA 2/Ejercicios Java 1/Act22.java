import java.util.Scanner;

public class Act22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos Kb: ");
        double kb = sc.nextDouble();

        System.out.println("Son: " +(kb / 1000)+ " Mb.");

        sc.close();
    }
}
