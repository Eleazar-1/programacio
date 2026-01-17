import java.util.Scanner;

public class act10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        String numero = sc.nextLine();

        System.out.println(invertiCadena(numero));;
        sc.close();
    }

    static String invertiCadena(String n){
        String cadenaInvertida="";

        for (int i = n.length() -1; i >= 0; i--) {
            char c = n.charAt(i);
            cadenaInvertida+=c;
        }
        return cadenaInvertida;
    }
}
