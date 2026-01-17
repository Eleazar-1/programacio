import java.util.Scanner;

public class ACT17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los milimetros: ");
        int milimetros = sc.nextInt();
        System.out.println("Introduce los centimetros: ");
        int centimetros = sc.nextInt();
        System.out.println("Introduce los metros: ");
        int metros = sc.nextInt();

        double milimetrosAcentimetros = milimetros / 10;
        double metrosAcentimetros = metros * 10;

        double sumaTotal = milimetrosAcentimetros + metrosAcentimetros + centimetros;

        System.out.println("Suma total: "+sumaTotal+" cm.");

        sc.close();
    }
}
