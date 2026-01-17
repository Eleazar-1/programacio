import java.util.Scanner;

public class Act12p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los €: ");
        double euros = sc.nextDouble();

        double pesetas = euros * 166.386;
        System.out.println(euros +" €, son: "+ pesetas+ " pesetas.");

        sc.close();
    }
}
