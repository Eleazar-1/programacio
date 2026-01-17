import java.util.Scanner;

public class act16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número decimal: ");
        int numero = sc.nextInt();

        String binario = "";

        while (numero > 0) {
            int resto = numero % 2;       
            binario = resto + binario;    
            numero = numero / 2;          
        }

        for (int i = 0; i < binario.length(); i++) {
            System.out.print(binario.charAt(i));
        }
        System.out.println();

        sc.close();
    }
}