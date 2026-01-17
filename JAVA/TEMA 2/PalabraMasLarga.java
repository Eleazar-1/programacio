import java.util.Scanner;

public class PalabraMasLarga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        String[] nombres = {"Ana", "Sebastian", "Luis", "Montserrat", "Carlos"};

        String nombreMasLargo = "";

        for (String nombre : nombres) {
            if (nombre.length() > nombreMasLargo.length()) {
                nombreMasLargo = nombre;  
            }
        }

        System.out.println("El nombre más largo es: " +nombreMasLargo );
        sc.close();
    }
}
