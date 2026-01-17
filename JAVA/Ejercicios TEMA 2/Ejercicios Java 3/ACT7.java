import java.util.Scanner;

public class ACT7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el numero: ");
        int numero1 = sc.nextInt();
        System.out.println("Introduce el numero: ");
        int numero2 = sc.nextInt();
        System.out.println("Introduce el numero: ");
        int numero3 = sc.nextInt();
        System.out.println("----Mayor a menor----");

        if (numero1>numero2 && numero1 > numero3) {
            if (numero2 > numero3) {
                 System.out.println(numero1);
                 System.out.println(numero2);
                 System.out.println(numero3);
            }else{
                 System.out.println(numero1);
                 System.out.println(numero3);
                 System.out.println(numero2);
            }
        } else if (numero2>numero1 && numero2 > numero3) {
            if (numero1 > numero3) {
                 System.out.println(numero2);
                 System.out.println(numero1);
                 System.out.println(numero3);
            }else{
                 System.out.println(numero2);
                 System.out.println(numero3);
                 System.out.println(numero1);
            }
            
        }else if (numero3>numero1 && numero3 > numero2) {
            if (numero2 > numero1) {
                 System.out.println(numero3);
                 System.out.println(numero2);
                 System.out.println(numero1);
            }else{
                 System.out.println(numero3);
                 System.out.println(numero1);
                 System.out.println(numero2);
            }
        }else{
            System.out.println("Todos son iguales");
        }
        
        
        sc.close();
    }
}
