import java.util.Scanner;

public class act1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el primer numero");
        int numero1 = sc.nextInt();

        System.out.println("Introduce el segundo numero");
        int numero2 = sc.nextInt();
        
        if (estanOrdenados(numero1, numero2)) {
            System.out.println("Orden ascendente");
        }else{
            System.out.println("Orden descendente");
        }
        sc.close();
    }

    public static boolean estanOrdenados(int numero1, int numero2){
        return numero1 < numero2;
    }
}