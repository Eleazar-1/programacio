import java.util.Scanner;

public class Act10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos kg de manzanas vendes: ");
        double manzanas = sc.nextDouble();

        System.out.println("Cuantos kg de peras vendes: ");
        double peras = sc.nextDouble();

        double totalManzanas = manzanas * 2.35;
        double totalPeras = peras * 1.95;

        System.out.println("El importe total de manzanas es: "+ totalManzanas + "€. Y el de peras es: "+ totalPeras+ "€.");

    }
}
