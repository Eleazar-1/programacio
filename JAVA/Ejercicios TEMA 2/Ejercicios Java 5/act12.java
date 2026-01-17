import java.util.Scanner;

public class act12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int suspensos=0;
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduce tu nota: ");
            int nota = sc.nextInt();
            if (nota < 5) {
                suspensos++;
            }
        }
        System.out.println("Hay "+suspensos+" suspensos.");
        sc.close();
    }
}
