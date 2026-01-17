import java.util.Scanner;

public class act1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int numero1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = sc.nextInt();
        sc.close();
        if (estanOrdenados(numero1, numero2)) {
            System.out.println("Orden ascendiente");
        } else{
            System.out.println("Orden descendente");
        }
    }

    public static boolean estanOrdenados(int numero1, int numero2){
        return numero1 < numero2;
    }
    
}
