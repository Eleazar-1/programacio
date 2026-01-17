import java.util.Scanner;

public class parOimpar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        int n = sc.nextInt();

        System.out.println(parOimpar(n));
        sc.close();
    }
    static boolean parOimpar (int n){
        boolean esParOimpar = (n %2==0) ? true:false;
        return esParOimpar;
    }
}