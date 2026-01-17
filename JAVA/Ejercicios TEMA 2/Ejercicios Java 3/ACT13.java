import java.util.Scanner;

public class ACT13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce dia mes año: ");
        int numero1 = sc.nextInt();
        int numero2 = sc.nextInt();
        int numero3 = sc.nextInt();



        System.out.println("Dia "+numero1+" ,del mes "+numero2+" y del dia "+numero3+".");
        sc.close();

        System.out.println();
    }
}
