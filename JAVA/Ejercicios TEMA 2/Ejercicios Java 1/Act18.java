import java.util.Scanner;

public class Act18 {
    public static void main(String[] args) {
        
        double IVA = 0.21;
        int BaseImponible = 500 ;
        double TotalFactura = BaseImponible * (1+IVA);

        System.out.println("Total de la factura es: "+ TotalFactura);
    
    }
}
