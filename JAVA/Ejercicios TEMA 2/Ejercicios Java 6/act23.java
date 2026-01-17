import java.util.Scanner;

public class act23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número natural: ");
        int numero = sc.nextInt();

        int raiz = 0;

        while (Math.pow(raiz + 1, 2) <= numero) {
            raiz++;
        }
        int resto = numero - (int)Math.pow(raiz, 2);

        System.out.println("Raíz cuadrada aproximada: " + raiz);
        if (resto > 0) {
            System.out.println("Resto: " + resto);
        }

        sc.close();
    }
}
