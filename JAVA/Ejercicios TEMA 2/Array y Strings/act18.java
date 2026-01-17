import java.util.Scanner;

public class act18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre en formato 'apellidos, nombre':");
        String entrada = sc.nextLine();

        String[] partes = entrada.split(",");

        if (partes.length == 2) {
            String apellidos = partes[0].trim();
            String nombre = partes[1].trim();
            System.out.println("Formato corregido:");
            System.out.println(nombre + " " + apellidos);
        } else {
            System.out.println("Formato incorrecto. Asegúrate de usar 'apellidos, nombre'.");
        }
        sc.close();
    }
}
