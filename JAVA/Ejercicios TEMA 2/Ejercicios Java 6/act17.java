import java.util.Scanner;

public class act17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número binario: ");
        String binario = sc.nextLine();  

        int decimal = 0;
        int potencia = 0;

        for (int i = binario.length() - 1; i >= 0; i--) {
            char bit = binario.charAt(i);       
            if (bit == '1') {
                decimal += Math.pow(2, potencia); 
            }
            potencia++; 
        }

        System.out.println("Equivalente decimal: " + decimal);
        sc.close();
    }
}
