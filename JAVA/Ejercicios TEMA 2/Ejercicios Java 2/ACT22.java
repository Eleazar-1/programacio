import java.util.Scanner;

public class ACT22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hasta cuantos metros has llegado?: ");
        double metros = sc.nextDouble();
        
        double centimetros = metros * 100;

        int centimetrosEnteros = (int) centimetros;

        System.out.println("Has alcanzado "+centimetrosEnteros+"cm.");

        sc.close();
    }
}
