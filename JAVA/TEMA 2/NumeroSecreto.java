import java.util.Scanner;

public class NumeroSecreto {

    public static void main(String[] args) {
        //Numero aleatori entre 1 /100 Adivinarlo
        Scanner sc = new Scanner(System.in);
        
        int numero = -2;

        int numeroSecreto = (int)(Math.random()*101);
        
        while (numero != numeroSecreto && numero != -1 ) {
            System.out.println("Introduce el numero: ");
            numero = sc.nextInt();
            if (numero > numeroSecreto) {
                System.out.println("El numero es inferior.");
            } else if (numero < numeroSecreto) {
                System.out.println("El numero es superior.");
            }
        }

        if (numero == numeroSecreto) {
            System.out.println("Has acertado el numero!");
        } else if (numero == -1) {
            System.out.println("Te has rendido.");
        }
        sc.close();
    }
}