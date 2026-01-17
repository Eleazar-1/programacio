import java.util.Scanner;

public class elAhorcado{
static Scanner sc = new Scanner(System.in);
String palabra;
    public static void main(String[] args) {
      
        System.out.println(menu(0, null));
    }

    static int menu(int opcion, String palabra ){
        
        do {
            System.out.println("JUEGO DEL AHORCADO");
            System.out.println("Selecciona una opción");
            System.out.println("1. Introducir palabra");
            System.out.println("2. Adivinar palabra");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            
            switch (opcion) {

                case 1:
                    System.out.println("Introduce la palabra: ");
                    palabra = sc.next();
                    sc.nextLine();
                    break;
                case 2:
                    if (palabra==null) {
                        System.out.println("------------------------------");
                        System.out.println("No has introducido la palabra.");
                        System.out.println("------------------------------");
                        break;
                    }
                    System.out.println("---------------------");
                    System.out.println(cambiarALineas(palabra));
                    System.out.println("---------------------");

                    System.out.println("Introduce una letra");
                    char letra = sc.nextLine().charAt(opcion);
                    if (sc.hasNextLine()) {
                        
                    }
                    System.out.println(ponerLetra(palabra, 0));
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    System.out.println("Has salido.");
                    break;
            
                default:
                    System.out.println("Error, no has seleccionado ninguna opción disponible");
                    break;
            }
        } while (opcion !=3);
        
        return opcion;
    }
    
    static String introducir(String palabra){
        System.out.println("Introduce una palabra");
        palabra = sc.nextLine();
        palabra = palabra.toUpperCase();
        return palabra;
    }

    static String cambiarALineas(String palabra){
        return palabra.replaceAll(".", "_");
    }

    static String ponerLetra(String palabra, char letra){
        //Si letra introducido está dentro de la palabra introducida, intercambiar "_" por la letra.
        //Luego mostrar la palabra con la letra ya cambiada y sus restantes "_"
        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                char guion = '_';
                palabra.replace(guion, letra);
            }
        }
        return palabra;
    }

}



