import java.util.Scanner;

public class Act9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Scanner

        System.out.println("Escribe un numero: ");
        int numero = sc.nextInt(); //El programa lee el numero

        boolean es = (numero % 2 == 0) ? true:false;
        System.out.println(es);
    }
}
