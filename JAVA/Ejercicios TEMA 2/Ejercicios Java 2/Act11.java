import java.util.Scanner;

public class Act11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cual es la base imponible?: ");
        double BaseImponible = sc.nextDouble();

        System.out.println("Cual es el IVA?: ");
        double IVA = sc.nextDouble();

        double TotalFactura = BaseImponible * (1+IVA/100);

        System.out.println("El total es de: " +TotalFactura+" €.");
        System.out.println("El IVA es de: " + (TotalFactura -  BaseImponible +" €."));
        sc.close();
    
    }
}