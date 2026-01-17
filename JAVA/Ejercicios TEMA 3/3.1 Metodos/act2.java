import java.util.Scanner;

public class act2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un caracter");
        char caracter = sc.nextLine().charAt(0);

        System.out.println("Introduce un numero");
        int veces = sc.nextInt();
        imprimeCaracter(caracter, veces);
        sc.close();
    }

    public static void imprimeCaracter(char caracter, int veces){
        for (int i = 1; i <= veces; i++) {
            System.out.println("El caracter "+caracter+" sale "+i+" veces.");
        }
    }
}
