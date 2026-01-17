import java.util.Scanner;

public class act14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dime el número del DNI y te diré la letra: ");
        int numeroDNI = sc.nextInt();

        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
       
        int numero = numeroDNI % 23;
        System.out.println("El DNI completo es: "+numeroDNI+" "+letras[numero]);

        sc.close();
    }
}