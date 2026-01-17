import java.util.Scanner;

public class act3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int base;
        int exponente;
        do {
            System.out.println("Introduce la base inferior a 50: ");
            base = sc.nextInt();
        } while (base > 49);

        do {
            System.out.println("Introduce el exponente inferior a 10: ");
            exponente = sc.nextInt();
        } while (exponente > 9);
        System.out.println("-----------------------");
        System.out.println(potencia(base, exponente));
        
        sc.close();
    }

    public static int potencia(int base, int exponente){
        return (int)Math.pow(base, exponente);
    }
}
