import java.util.Scanner;

public class ACT4 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el numero: ");
        double numero = sc.nextDouble();

        if (numero > -1 && numero !=0 && numero < 1 ) {
            System.out.println( numero+" es numero casi 0.");
        } else{
            System.out.println(numero+" no es un numero casi 0");
        }
        
        
        sc.close();
    }
}
