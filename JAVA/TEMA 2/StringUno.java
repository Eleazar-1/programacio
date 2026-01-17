import java.util.Scanner;

public class StringUno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe una palabra: ");
        String palabra1 = sc.nextLine();

        System.out.println("Escribe una otra: ");
        String palabra2 = sc.nextLine();

        if (palabra1.equalsIgnoreCase(palabra2)) {
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
        
        sc.close();
    }
}
