import java.util.Scanner;

public class tresEnRaya {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        String tablero [][] = new String[3][3];
        do {
            menu();
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    
                    inicioTablero(tablero);
                    preguntarJugador1(tablero);
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("-Has salido del programa-");
                    break;
            
                default:
                    System.out.println("+++++++++++++++++");
                    System.out.println("Opción no valida!");
                    System.out.println("+++++++++++++++++");
                    break;
            }
        } while (opcion != 3);
        
    }

    static void menu(){
        System.out.println("=====JUEGO 3 EN RAYA=====");
        System.out.println("1. Modo 2 jugadores");
        System.out.println("2. Modo 1 jugador");
        System.out.println("3. Salir del juego");
        System.out.println("=========================");
    }

    static String [][] inicioTablero(String [][]t){
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j]="?";
            }
        }
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
        return t;
    }

    static String[][] preguntarJugador1(String[][] s){

        System.out.println("Que posicion vertical quieres poner?: ");
        int v = sc.nextInt();
        System.out.println("Que posicion horizontal quieres poner?: ");
        int h = sc.nextInt();
        for (int i = 0; i < s[v].length; i++) {
            for (int k = 0; k < s[h].length; k++) {
                s[v][h] = "X";
            }
        }
        
        return mostrarTablero(s);
    }

    static String [][] mostrarTablero(String [][]t){
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
        return t;
    }

    static String [][] elegirJugador(String [][] s){
        
        System.out.println("Jugador 1 - Introduce la X");
        return s;
    }

    
}
