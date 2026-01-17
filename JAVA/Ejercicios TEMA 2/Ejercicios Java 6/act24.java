import java.util.ArrayList;
import java.util.Scanner;

public class act24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tus cantidades de dinero: ");
        int dinero = sc.nextInt();
        int totalDinero = 0;
        totalDinero+= dinero; 

        do {
            if (dinero != 0) {
                System.out.print("Introduce tus cantidades de dinero: ");
                dinero = sc.nextInt();
                totalDinero += dinero;
            }else{
                break;
            }
        } while (dinero != 0);
        
        System.out.println("Total: " +totalDinero+"€.");

        sc.close();
    }
}
