import java.util.Scanner;

public class act1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        int numero;
        do {
            System.out.println("Introduce el numero: ");
            numero = sc.nextInt();
            
            if (numero %2==0) {
                System.out.println("El numero es par");
            } else {
                System.out.println("No es par");
            }
            System.out.println("La raiz cuadrada es: "+(numero*numero));
            System.out.println("----------");
        } while (numero != 0);
        sc.close();
    }
}