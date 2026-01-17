import java.util.Scanner;

public class act10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int suma =0;
        for (int i = 0; i <= 10; i++) {
            if (i %2!=0) {
                suma += i;
            }
        }
        System.out.println("----------------");
        System.out.println("La suma de los 10 primeros numeros impares es: "+suma);
        sc.close();
    }
}
