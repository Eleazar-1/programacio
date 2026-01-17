import java.util.Scanner;

public class act4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuanto mide el arbol?: ");
        int arbol = sc.nextInt();

        int arbolMasAlto = 0;

        while (arbol != -1 ) {
            if (arbol > arbolMasAlto) {
                arbolMasAlto = arbol;
            }    
            System.out.println("Cuanto mide el arbol?: ");
            arbol = sc.nextInt();
        }

        System.out.println("El arbol mas alto mide: "+arbolMasAlto+" cm.");
        sc.close();
    }
}
