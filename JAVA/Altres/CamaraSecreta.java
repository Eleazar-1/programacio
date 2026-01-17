import java.util.Arrays;
import java.util.Scanner;

/**
 * Reto Práctico: Protocolo de Seguridad
 * @author [PON AQUÍ TU NOMBRE]
 */
public class CamaraSecreta {

    // --- VARIABLES GLOBALES (Configuración) ---
    static int LONGITUD_CLAVE = 4;
    static int MAX_VALOR = 5;       // Los números serán entre 1 y MAX_VALOR
    static int MAX_INTENTOS = 10;
    
    static Scanner sc = new Scanner(System.in);
    // PROGRAMA PRINCIPAL FINALIZADO. NO MODIFICAR NADA
    public static void main(String[] args) { 
        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            // Reutilizamos la función leerEntero para validar la opción del menú
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
     * @param min Valor mínimo aceptable (inclusivo).
     * @param max Valor máximo aceptable (inclusivo).
     * @return El entero validado introducido por el usuario.
     */
    static int leerEntero(String mensaje, int min, int max) {
        int numero =0;
        // TODO: Implementar bucle do-while para pedir y validar
        // Si el número está fuera de rango, mostrar mensaje de error.
        do {
            System.out.print(mensaje);
            if (sc.hasNextInt() ) {
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

    /**
     * Permite al usuario modificar las variables globales LONGITUD_CLAVE y MAX_VALOR.
     * Debe usar leerEntero para asegurar que no se meten valores ilógicos 
     * (ej: longitud negativa).
     */
    static void configurarDificultad() {
        System.out.println("\n--- CONFIGURACIÓN ---");
        // TODO: Pedir nueva longitud (mínimo 1, máximo 10)
        LONGITUD_CLAVE = leerEntero("Introduce nueva longitud de clave deseada: ", 1, 10);
        // TODO: Pedir nuevo valor máximo (mínimo 2, máximo 9)
        MAX_VALOR = leerEntero("Introduce nuevo valor máximo de clave deseada: ", 2, 9);
        // Actualizar las variables estáticas
    }

    /**
     * Genera la combinación secreta.
     * @return Un array de tamaño LONGITUD_CLAVE con números aleatorios entre 1 y MAX_VALOR.
     */
    static int[] generarSecreto() {
        int[] secreto = new int[LONGITUD_CLAVE];
        // TODO: Rellenar el array con Math.random()
        for (int i = 0; i < secreto.length; i++) {
            secreto[i] = (int)(Math.random() * MAX_VALOR + 1);
        }
        return secreto; // Cambiar este return por el valor correcto
    }

    /**
     * Solicita al usuario su intento.
     * @return Un array con los números introducidos por el usuario (validados).
     */
    static int[] pedirCombinacionUsuario() {
        System.out.println("\nIntroduce tu combinación (" + LONGITUD_CLAVE + " dígitos):");
        int[] intento = new int[LONGITUD_CLAVE];

        for (int i = 0; i < intento.length; i++) {
            intento[i] = leerEntero("Valor " + (i + 1) + ") ", 1, MAX_VALOR);
        }
        return intento; // Cambiar este return por el valor correcto Cambiar este return por el valor correcto
    }

    /**
     * Compara el intento del usuario con el secreto y muestra las pistas.
     * @param secreto La combinación correcta.
     * @param intento La combinación del usuario.
     * @return true si son idénticos (victoria), false si no.
     */
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

    /**
     * Lógica principal de la partida.
     */
    static void jugarPartida() {
        int[] secreto = generarSecreto();
        // "Trampa" para el programador (BORRAR O COMENTAR EN VERSIÓN FINAL)
        //System.out.println("(DEBUG - Secreto: " + Arrays.toString(secreto) + ")");
        
        boolean victoria = false;
        int intentosUsados = 0;

        // TODO: Bucle principal del juego.
        // Se repite mientras intentosUsados < MAX_INTENTOS y NO haya victoria.
        
        do {

            if (comprobarIntento(secreto, pedirCombinacionUsuario())) {
                victoria = true;
            }
            intentosUsados++;
        } while (intentosUsados < MAX_INTENTOS && !victoria);
        
        // Mensaje final
        if (victoria) {
            System.out.println("\n¡ENHORABUENA! La caja se ha abierto.");
        } else {
            System.out.println("\n¡SISTEMA BLOQUEADO! Has agotado los intentos.");
            System.out.println("La clave era: " + Arrays.toString(secreto));
        }
    }
}