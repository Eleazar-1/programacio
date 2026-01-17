import java.util.Scanner;

public class ElprintF {
    static final String RESET= "\033[0m"; //Restablecer colores
    static final String ROJO= "\033[1,31m"; //ROJO 
    static final String VERDE= "\033[0,32m"; //VERDE 
    static final String AZUL= "\033[4,34m"; //AZUL 
    static final String AMARILLO= "\033[0,33m"; //AMARILLO 

    /*
     \033 --> Empieza una secuencia de escape
     0 Texto normal
     1 Negrita
     4 Subrayado
     9 Tachado
     31 m color
     */

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(AMARILLO + "Introduce tu nombre: " + RESET);

        String nombre = sc.nextLine();
        System.out.printf(VERDE+ " Hola, " + nombre + "!" + RESET);

        System.out.printf(AMARILLO + "Introduce tu edad: " + RESET);
        int edad = sc.nextInt();
        System.out.printf("Tu edad es " + edad);

        System.out.printf(AMARILLO + " Introduce tu salario: " + RESET);
        Double salario = sc.nextDouble();
        System.out.printf(AZUL+ "Tu salario es " + salario + RESET);

        //Usar printf para formatear la salida con un formato específico
        //%s --> marcarod para cadena de texto (String)
        //%f --> marcador para números reales
        //%c --> marcador para carácteres
        //%d --> marcador para número entero (int)
        //%.2f --> marcador para números decimal con 2 cifras
        //\n --> salto de líneas

        System.out.printf("Hola %s, tienes %d años y tu salario es %.2f euros. \n", nombre, edad, salario);
        sc.nextLine();

        System.out.printf("Ejemplos adicionales");
        String lenguaje = "Pyton";
        int version 3;

        System.out.printf(VERDE + "El lenguaje %s está en la versión %d.\n + "+ RESET, lenguaje, version);

        double numero = 123.45678;
        System.out.printf("Numero con dos decimales: %.2f\n", numero);

        //Formatear un numero entero con un ancho de campo fijo

        int valorEntero = 42;
        System.out.printf("Numero entero con ancho de campo de 5 y rellena con espacio si no hay suficientes números: %5d\n", valorEntero);

        System.out.printf(ROJO + "Texto alineado a la izquierda: [%-10s]\n" + RESET, "JAVA");
            System.out.printf(ROJO + "Texo alineado a la izquierda: [%10s]%n" + RESET, "JavaScript");

        int numeroHEX = 255;
        System.out.printf("El numero %d en hexadecimal es %x. \n", numeroHEX, numeroHEX);

        int numeroRelleno = 7;
        System.out.printf(ROJO + "Número relleno de ceros: %05d\n" +RESET, numeroRelleno);

        Scanner.close();
     }
}
