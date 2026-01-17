import java.util.Scanner;

public class ACT8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();

        if (numero > 99999) {
            System.out.println("El numero esta fuera del rango");
        } else if (numero > 9999) {
            System.out.println("El numero tiene 5 cifras");
        } else if (numero > 999) {
            System.out.println("El numero tiene 4 cifras");
        } else if (numero > 99) {
            System.out.println("El numero tiene 3 cifras");
        } else if (numero > 9) {
            System.out.println("El numero tiene 2 cifras");
        } else if (numero >= 0) {
            System.out.println("El numero tiene 1 cifra");
        } else{
            System.out.println("Los numeros negativos estan fuera del rango");
        }
        
        sc.close();
    }
}
