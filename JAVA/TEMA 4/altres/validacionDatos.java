import java.util.Scanner;

public class validacionDatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("PORTERO AUTOMATICO");
        System.out.println("Escribe nombres. Salir para ir al siguiente ejercicio: ");
        System.out.println(">");

        while (sc.hasNextLine()) {
            String entrada = sc.nextLine();

            if (entrada.equalsIgnoreCase("SALIR")) {
                System.out.println("Saliendo del portero");
                break;
            }

            if (entrada.equalsIgnoreCase("vip")) {
                System.out.println("CLIENTE VIP");
            }else{
                System.out.println("Acceso permitido"+entrada);
            }
            System.out.println(">");
        }

        sc.close();
    }
}
