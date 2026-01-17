import java.util.Scanner;

public class act9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el numero: ");
        int numero = sc.nextInt();
        System.out.println("----Tabla del "+numero);

        if (numero >= 1 && numero <=10) {
           for (int i = 1; i <= 10; i++) {
            System.out.println(i+" x "+numero+" = "+(i*numero));
            
        } 
        }else{
            System.out.println("Ese numero esta fuera del rango.");
        }
        
        sc.close();

    }
}
