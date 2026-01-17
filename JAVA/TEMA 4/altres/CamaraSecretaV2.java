import java.util.Arrays;
import java.util.Scanner;

/**
 * Reto Práctico: Protocolo de Seguridad
 * @author [Tu Nombre]
 */
public class CamaraSecretaV2 {

    // --- VARIABLES GLOBALES (Configuración) ---
    static int LONGITUD_CLAVE = 4;
    static int MAX_VALOR = 5;       // Los números serán entre 1 y MAX_VALOR
    static int MAX_INTENTOS = 10;
    
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) { 
        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            int opcion = leerEntero("Seleccione una opción: ", 1, 3);
            switch (opcion) {
                case 1 -> configurarDificultad();
                case 2 -> jugarPartida();
                case 3 -> {
                    System.out.println("Cerrando sistema de seguridad...");
                    salir = true;
                }
            }
        }
        sc.close();
    }

    static void mostrarMenu() {
        System.out.println("\n--- CAJA FUERTE DA VINCI v2.0 ---");
        System.out.println("Configuración actual: [Longitud: " + LONGITUD_CLAVE + "] [Rango: 1-" + MAX_VALOR + "]");
        System.out.println("1. Configurar Dificultad");
        System.out.println("2. Jugar Partida");
        System.out.println("3. Salir");
        System.out.println("---------------------------------");
    }

    static int leerEntero(String mensaje, int min, int max) {
        int numero;
        do {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
                sc.nextLine();
                if (numero < min || numero > max) {
                    System.out.println("Error: introduce un número entre " + min + " y " + max + ".");
                } else {
                    return numero;
                }
            } else {
                System.out.println("Error: debes introducir un número entero.");
                sc.nextLine();
            }
        } while (true);
    }

    static void configurarDificultad() {
        System.out.println("\n--- CONFIGURACIÓN ---");
        int nuevaLongitud = leerEntero("Nueva longitud (1-10): ", 1, 10);
        int nuevoMax = leerEntero("Nuevo valor máximo por dígito (2-9): ", 2, 9);
        LONGITUD_CLAVE = nuevaLongitud;
        MAX_VALOR = nuevoMax;
        System.out.println("Configuración actualizada: Longitud=" + LONGITUD_CLAVE + ", Rango=1-" + MAX_VALOR);
    }

    static int[] generarSecreto() {
        int[] secreto = new int[LONGITUD_CLAVE];
        for (int i = 0; i < LONGITUD_CLAVE; i++) {
            secreto[i] = (int) (Math.random() * MAX_VALOR) + 1;
        }
        return secreto;
    }

    static int[] pedirCombinacionUsuario() {
        System.out.println("\nIntroduce tu combinación (" + LONGITUD_CLAVE + " dígitos, cada uno entre 1 y " + MAX_VALOR + "):");
        int[] intento = new int[LONGITUD_CLAVE];
        for (int i = 0; i < LONGITUD_CLAVE; i++) { // CORRECCIÓN: LONGITUD_CLAVE
            intento[i] = leerEntero("Dígito " + (i + 1) + ": ", 1, MAX_VALOR);
        }
        return intento;
    }

    static boolean comprobarIntento(int[] secreto, int[] intento) {
        boolean aciertoTotal = true;
        System.out.print("PISTAS: ");
        for (int i = 0; i < LONGITUD_CLAVE; i++) {
            if (intento[i] == secreto[i]) {
                System.out.print("Igual ");
            } else if (intento[i] > secreto[i]) {
                System.out.print("Mayor ");
                aciertoTotal = false;
            } else {
                System.out.print("Menor ");
                aciertoTotal = false;
            }
        }
        System.out.println();
        return aciertoTotal;
    }

    static void jugarPartida() {
        int[] secreto = generarSecreto();
        System.out.println("(DEBUG - Secreto: " + Arrays.toString(secreto) + ")"); // quita en entrega

        boolean victoria = false;
        int intentosUsados = 0;

        while (!victoria && intentosUsados < MAX_INTENTOS) {
            int[] intento = pedirCombinacionUsuario();
            victoria = comprobarIntento(secreto, intento);
            intentosUsados++;
            System.out.println("Intentos usados: " + intentosUsados + "/" + MAX_INTENTOS);
        }

        if (victoria) {
            System.out.println("\n¡ENHORABUENA! La caja se ha abierto.");
        } else {
            System.out.println("\n¡SISTEMA BLOQUEADO! Has agotado los intentos.");
            System.out.println("La clave era: " + Arrays.toString(secreto));
        }
    }
}
