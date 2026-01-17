import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el alto: ");
        int alto = sc.nextInt();
        System.out.println("Introduce el ancho: ");
        int ancho = sc.nextInt();

        for (int i = 1; i <= alto; i++) {

            for (int j = 1; j <= ancho; j++) {
                if (i == 1 || i == alto || j == 1 || j == ancho) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
        sc.close();
    }
}
