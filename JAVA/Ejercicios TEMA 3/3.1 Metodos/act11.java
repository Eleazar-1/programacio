import java.util.Scanner;

public class act11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la cadena: ");
        String cadena = sc.nextLine();
        
        System.out.println("Cadena invertida: "+cadenaInvertida(cadena));
        sc.close();
    }
    static String cadenaInvertida(String cadena){
        String invertida = "";
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (Character.isLowerCase(c)) {
                c = Character.toUpperCase(c);
                invertida+=c;
            }else if (Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
                invertida+=c;
            }
            
        }
        return invertida;
    }

}
