import java.util.Scanner;

public class act17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la base: ");
        int base = sc.nextInt();

        System.out.println("Dime la altura: ");
        int altura = sc.nextInt();

        if (base > 0 && altura > 0) {
            int area = (base*altura)/2;
            System.out.println("El area es: "+area+"m.");
        }else{
            System.out.println("No introduzcas numero negativos.");
        }
        sc.close();
    }
}