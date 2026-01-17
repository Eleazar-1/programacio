import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextline();
        System.out.println("Mi nombre es " + nombre);

        System.out.println("Introduce un numero entero: ");
        int numero = teclado.nextline();
        System.out.println("Has introducido el " + numero);

        System.out.println("Introduce un numero real: ");
        double numeroDecimal = teclado.nextdouble();
        System.out.println("Has introducido el doble " + numeroDecimal);

        System.out.println("Introduce una cadena: ");
        double cadena = teclado.next();
        System.out.println("La cadena introducida es " + cadena);

        System.out.println("Escribe otro alternativo: ");
        double texto = System.console().readLine();
        System.out.println("Texto es " + texto);
    }
}