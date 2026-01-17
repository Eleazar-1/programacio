import java.util.Scanner;

public class act19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una contraseña:");
        String contrasena = sc.nextLine();

        int puntuacion = 0;
        boolean tieneLetras = contrasena.matches(".*[a-zA-Z].*");
        boolean tieneNumeros = contrasena.matches(".*[0-9].*");
        boolean tieneMayusculas = contrasena.matches(".*[A-Z].*");
        boolean tieneMinusculas = contrasena.matches(".*[a-z].*");
        boolean tieneEspeciales = contrasena.matches(".*[\\$%!?].*");
        int longitud = contrasena.length();

        if (tieneLetras && tieneNumeros) {
            puntuacion += 30;
        }

        if (tieneMayusculas && tieneMinusculas && longitud >= 4 && longitud <= 5) {
            puntuacion += 30;
        }

        if (tieneMayusculas && tieneMinusculas && longitud >= 6 && longitud <= 8 && tieneEspeciales) {
            puntuacion += 60;
        }

        if (tieneMayusculas && tieneMinusculas && longitud > 8 && tieneEspeciales) {
            puntuacion += 80;
        }

        System.out.println("Grado de seguridad: " + puntuacion + "%");
        sc.close();
    }
}
