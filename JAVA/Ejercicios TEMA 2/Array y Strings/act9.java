import java.util.ArrayList;
import java.util.Scanner;

public class act9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> nombres = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            System.out.println("Introduce el " + i + "º nombre: ");
            String nombre = sc.nextLine();
            nombres.add(nombre);
        }

        String entrada;

        do {
            System.out.println("Introduce una letra inicial de una palabra (o escribe 'fin' para salir): ");
            entrada = sc.nextLine();

            if (!entrada.equals("fin") && !entrada.isEmpty()) {
                char letra = entrada.charAt(0);

                System.out.println("Nombres que empiezan por '" + letra + "':");
                for (String nombre : nombres) {
                    if (!nombre.isEmpty() && nombre.charAt(0) == letra) {
                        System.out.println("- " + nombre);
                    }
                }
            }

        } while (!entrada.equals("fin"));

        sc.close();
    }
}
