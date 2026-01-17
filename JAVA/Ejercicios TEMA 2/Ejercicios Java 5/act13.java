import java.util.Scanner;

public class act13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int aprobados=0;
        int condicionados=0;
        int suspensos=0;
        
        for (int i = 1; i <= 6; i++) {
            System.out.println("Introduce tu nota: ");
            int nota = sc.nextInt();
            if (nota > 5) {
                aprobados++;
            } else if (nota == 4) {
                condicionados++;
            } else{
                suspensos++;
            }
        }
        System.out.println("Aprobados: "+suspensos+", condicionados: "+condicionados+", suspensos: "+suspensos);
        sc.close();
    }
}
