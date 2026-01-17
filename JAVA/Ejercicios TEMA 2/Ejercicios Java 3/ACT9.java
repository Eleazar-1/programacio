import java.util.Scanner;

public class ACT9 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la nota de 0 a 10: ");
        int numero = sc.nextInt();

        if (numero >= 9) {
            System.out.println("Sobresaliente");
        } else if (numero >= 7 ) {
            System.out.println("Notable");
        } else if (numero >=5) {
            System.out.println("Suficiente");
        } else if (numero < 5) {
            System.out.println("Insuficiente");
        } 
        
        sc.close();
    }
}
