import java.util.Scanner;

public class act8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        int totalDeNumeros = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce un numero: ");
            numero = sc.nextInt();
            totalDeNumeros += numero;
        }
        System.out.println("La media de los numeros es: "+(totalDeNumeros/10));

        sc.close();
    }
}
