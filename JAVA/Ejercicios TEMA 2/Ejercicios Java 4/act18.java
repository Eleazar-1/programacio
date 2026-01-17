import java.util.Scanner;

public class act18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime un número: ");
        int numero = sc.nextInt();
        
        int resultado = (numero >= 0 ) ? numero:-numero;

        System.out.println("El valor absoluto de "+numero+" es "+resultado);
        sc.close();
    }
}