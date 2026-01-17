import java.util.Scanner;
import java.util.Random;

public class paroimpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int flor1 = 2;
        int flor2 = 3;

        if (flor2 %2!=0 && flor1 %2==0) {
            System.out.println("es impar entre los 2");
        }else{
            System.out.println("son pares");
        }
        if (flor1 %2!=0 && flor2 %2==0) {
            System.out.println("es impar entre los 2");
        }else{
            System.out.println("son pares");
        }
        
        
        
        sc.close();
    }
    
}
