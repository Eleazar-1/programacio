import java.util.Scanner;

public class act14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int tabla=0;
        
        for (int i = 1; i <= 10; i++) {
            System.out.println("------------");
            System.out.println("Tabla del "+i);
            
            for (int j = 1; j <= 10; j++) {
                tabla = i*j;
                
                System.out.println(i+" * "+j+" = "+tabla);
            }
        }
        sc.close();
    }
}
