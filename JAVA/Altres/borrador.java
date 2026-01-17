import java.util.Arrays;
import java.util.Scanner;

/**
 * Reto Práctico: Protocolo de Seguridad
 * 
 * @author [PON AQUÍ TU NOMBRE]
 */
public class borrador {

    // --- VARIABLES GLOBALES (Configuración) ---
    static int LONGITUD_CLAVE = 4;
    static int MAX_VALOR = 5; // Los números serán entre 1 y MAX_VALOR
    static int MAX_INTENTOS = 10;

    static Scanner sc = new Scanner(System.in);

    // PROGRAMA PRINCIPAL FINALIZADO. NO MODIFICAR NADA
    public static void main(String[] args) {
        configurarDificultad();
        int[] secreto = generarSecreto();
        System.out.println(Arrays.toString(secreto));
        int[] intento = pedirCombinacionUsuario();
        System.out.println(Arrays.toString(intento));
        System.out.println(comprobarIntento(secreto, intento));
    }

    /**
     * Muestra las opciones del menú por consola.
     */
    static void mostrarMenu() {
        System.out.println("\n--- CAJA FUERTE DA VINCI v2.0 ---");
        System.out.println("Configuración actual: [Longitud: " + LONGITUD_CLAVE + "] [Rango: 1-" + MAX_VALOR + "]");
        System.out.println("1. Configurar Dificultad");
        System.out.println("2. Jugar Partida");
        System.out.println("3. Salir");
        System.out.println("---------------------------------");
    }

    /**
     * Método fundamental de validación.
     * Pide un número al usuario repetidamente hasta que esté dentro del rango.
     * * @param mensaje Texto que se muestra al pedir el dato.
     * 
     * @param min Valor mínimo aceptable (inclusivo).
     * @param max Valor máximo aceptable (inclusivo).
     * @return El entero validado introducido por el usuario.
     */
    static int leerEntero(String mensaje, int min, int max) {
        int numero = 0;
        // TODO: Implementar bucle do-while para pedir y validar
        // Si el número está fuera de rango, mostrar mensaje de error.
        do {
            System.out.print(mensaje);
            if (sc.hasNextInt()) {
                numero = sc.nextInt();
            } else {
                System.out.println("ERROR");
                sc.nextLine();
                continue;
            }
            if (numero < min || numero > max) {
                System.out.println("ERROR");
            }
        } while (numero < min || numero > max);
        return numero; // Cambiar este return por el valor correcto
    }

    static void configurarDificultad() {
        System.out.println("\n--- CONFIGURACIÓN ---");
        // TODO: Pedir nueva longitud (mínimo 1, máximo 10)
        LONGITUD_CLAVE = leerEntero("Introduce nueva longitud de clave deseada: ", 1, 10);
        // TODO: Pedir nuevo valor máximo (mínimo 2, máximo 9)
        MAX_VALOR = leerEntero("Introduce nuevo valor máximo de clave deseada: ", 2, 9);
        // Actualizar las variables estáticas
    }

    static int[] generarSecreto() {
        int[] secreto = new int[LONGITUD_CLAVE];
        // TODO: Rellenar el array con Math.random()
        for (int i = 0; i < secreto.length; i++) {
            secreto[i] = (int)(Math.random() * MAX_VALOR + 1);
        }
        return secreto; // Cambiar este return por el valor correcto
    }

    static int[] pedirCombinacionUsuario() {
        System.out.println("\nIntroduce tu combinación (" + LONGITUD_CLAVE + " dígitos):");
        int[] intento = new int[LONGITUD_CLAVE];

        for (int i = 0; i < intento.length; i++) {
            intento[i] = leerEntero("Valor " + (i + 1) + ") ", 1, MAX_VALOR);
        }
        return intento; // Cambiar este return por el valor correcto Cambiar este return por el valor correcto
    }

    static boolean comprobarIntento(int[] secreto, int[] intento) {
        boolean aciertoTotal = true;
        System.out.print("PISTAS: ");
        
        // TODO: Recorrer ambos arrays comparando posición a posición.
        // Imprimir si es Mayor, Menor o Igual.
        // Si alguno no es igual, aciertoTotal pasa a false.
        
        for (int i = 0; i < intento.length; i++) {
            if (secreto[i] == intento[i]) {
                System.out.print("igual ");
            } else if (secreto[i] > intento[i]) {
                System.out.print("mayor ");
                aciertoTotal = false;
            } else {
                System.out.print("menor ");
                aciertoTotal = false;
            }
        }

        System.out.println(); // Salto de línea final
        return aciertoTotal; // Cambiar este return por el valor correcto
    }
}