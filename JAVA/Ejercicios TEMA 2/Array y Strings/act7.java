import java.util.ArrayList;
import java.util.Scanner;

public class act7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();;
        String nombre;

        System.out.println("Introduce 10 nombres: ");
        for (int i = 1; i < 11; i++) {
            System.out.println("Introduce el "+i+" nombre: ");
            nombre = sc.nextLine();
            nombres.add(nombre);
        }
        
        String nueva;

        do {
            System.out.println("Introduce un nombre que ya hayas introducido: ");
            nueva = sc.nextLine();
            if (nombres.contains(nueva)) {
                System.out.println("---------------");
                System.out.println("El nombre si que ha sido introducido");
                System.out.println("---------------");
            }else{
                System.out.println("---------------");
                System.out.println("Ese nombre no se habia introducido");
                System.out.println("---------------");
            }
        } while (!nueva.equals("fin"));

        
        sc.close();
    }
}
