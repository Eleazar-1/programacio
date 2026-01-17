import java.util.Scanner;

public class act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce una letra: ");
        char l = sc.nextLine().charAt(0);

        System.out.println("Introduce las veces: ");
        int v = sc.nextInt();

        imprimeCaracter(l, v);

        sc.close();
    }
    public static void imprimeCaracter(char caracter, int veces){
        for (int i = 0; i < veces; i++) {
            System.out.println(caracter);
        }
    }
}
