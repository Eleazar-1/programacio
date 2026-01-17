import java.util.Scanner;

public class tresEnRayaFinal{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    int opcion;
    String tablero [][] ={
        {"?","?","?"},
        {"?","?","?"},
        {"?","?","?"}
    };
    do {
        menu();
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                mostrarTablero(tablero);  
                modo2Jugadores();
                break;
            case 2:
                mostrarTablero(tablero);
                modo1Jugador();
                break;
            case 3:
                System.out.println("=========================");
                System.out.println("-Has salido del programa-");
                System.out.println("=========================");
                break;
            
            default:
                System.out.println("+++++++++++++++++");
                System.out.println("Opción no valida!");
                System.out.println("+++++++++++++++++");
                break;
            }
        } while (opcion != 3);
    }
    
    //MENÚ PRINCIPAL
    static void menu(){
        System.out.println("=====JUEGO 3 EN RAYA=====");
        System.out.println("1. Modo 2 jugadores");
        System.out.println("2. Modo 1 jugador");
        System.out.println("3. Salir del juego");
        System.out.println("=========================");
    }
    //============================================================

    //METODO MOSTRAR TABLERO
    static String [][] mostrarTablero(String [][]t){
        System.out.println("================================");
        System.out.println("    0 1 2");
        for (int i = 0; i < t.length; i++) {
            System.out.print(i+" | ");
            for (int j = 0; j < t.length; j++) {
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
        return t;
    }
    //============================================================
    
    //METODO 2 JUGADORES
    static void modo2Jugadores(){
        String tablero [][] ={
        {"?","?","?"},
        {"?","?","?"},
        {"?","?","?"}
        };
        boolean victoriaJ1;
        boolean victoriaJ2 = false;
        boolean tableroLleno = false;
         
        do {
            //1er Juego
            System.out.println("================================");
            System.out.println("Juego del 3 en raya(2 Jugadores)");
            System.out.println("--------------------------------");
            System.out.println("(Jugador 1) Introduce la posición horizontal(0, 1 o 2)");
            int x1 = sc.nextInt();
            System.out.println("(Jugador 1) Introduce la posición vertical(0, 1 o 2)");
            int y1 = sc.nextInt();
            mostrarTablero(posicionDisponibleJugador1(x1, y1, tablero));
            System.out.println("================================");
            //Comprobacion de victoria jugador 1 y que esté lleno
            victoriaJ1 = comprobarVictoriaJugador1(tablero);
            //Solucion "Chapuza" para evitar el error de que pregunte al jugador 2 
            //aún estando el tablero lleno o ya habiendo ganado el jugador 1
            if (victoriaJ1 == true) {
                break;
            }
            tableroLleno = comprobarQueNoEsteLlenoElTablero(tablero);
            if (tableroLleno == true) {
                break;
            }
            System.out.println("--------------------------------");
            System.out.println("(Jugador 2) Introduce la posición horizontal(0, 1 o 2)");
            int x2 = sc.nextInt();
            System.out.println("(Jugador 2) Introduce la posición vertical(0, 1 o 2)");
            int y2 = sc.nextInt();
            System.out.println("================================");
            mostrarTablero(posicionDisponibleJugador2(x2, y2, tablero));
            //Comprobacion de victoria jugador 2
            victoriaJ2 = comprobarVictoriaJugador2YMaquina(tablero);
        } while (!victoriaJ1 && !victoriaJ2 && !tableroLleno); 

        if (victoriaJ1) {
            System.out.println("========================================");
            System.out.println("Ha ganado el Jugador 1! Felicidades");
            System.out.println("========================================");
        }
        if (victoriaJ2) {
            System.out.println("========================================");
            System.out.println("Ha ganado el Jugador 2! Felicidades");
            System.out.println("========================================");
        }
        if (tableroLleno) {
            System.out.println("========================================");
            System.out.println("El tablero se ha llenado! Fin del juego.");
            System.out.println("========================================");
        }
    }
    //============================================================

    //METODO 1 JUGADOR
    static void modo1Jugador(){
        String tablero [][] ={
        {"?","?","?"},
        {"?","?","?"},
        {"?","?","?"}
        };
        boolean victoriaJ1;
        boolean victoriaIA = false;
        boolean tableroLleno = false;

        do {
            //2o Juego
            System.out.println("================================");
            System.out.println("Juego del 3 en raya(1 Jugador)");
            System.out.println("--------------------------------");
            System.out.println("(Jugador 1) Introduce la posición horizontal(0, 1 o 2)");
            int x1 = sc.nextInt();
            System.out.println("(Jugador 1) Introduce la posición vertical(0, 1 o 2)");
            int y1 = sc.nextInt();
            System.out.println("================================");
            mostrarTablero(posicionDisponibleJugador1(x1, y1, tablero));
            System.out.println("================================");
            //Comprobacion de victoria jugador 1 y que esté lleno
            victoriaJ1 = comprobarVictoriaJugador1(tablero);
            //Solucion "Chapuza" para evitar el error de que pregunte al jugador 2 
            //aún estando el tablero lleno o ya habiendo ganado el jugador 1
            if (victoriaJ1 == true) {
                break;
            }
            tableroLleno = comprobarQueNoEsteLlenoElTablero(tablero);
            if (tableroLleno == true) {
                break;
            }
            System.out.println("Jugada de la maquina: ");
            mostrarTablero(posicionDisponibleMaquina(tablero));
            victoriaIA = comprobarVictoriaJugador2YMaquina(tablero);
            if (victoriaIA == true) {
                break;
            }
        } while (!victoriaJ1 && !victoriaIA && !tableroLleno);
        if (victoriaJ1) {
            System.out.println("========================================");
            System.out.println("Has ganado! Felicidades");
            System.out.println("========================================");
        }
        if (victoriaIA) {
            System.out.println("========================================");
            System.out.println("Ha ganado la IA, mala suerte!");
            System.out.println("========================================");
        }
        if (tableroLleno) {
            System.out.println("========================================");
            System.out.println("El tablero se ha llenado! Fin del juego.");
            System.out.println("========================================");
        }
        
    }
    //============================================================

    //COMPROBAR QUE LAS POSICIONES ESTÉN DISPONIBLES Y ASIGNARLAS
    static String [][] posicionDisponibleJugador1(int x, int y, String [][]t){
        boolean posicionCorrecta = false;
        do {
            
            for (int i = 0; i < t[x].length; i++) {
                for (int j = 0; j < t[y].length; j++) {
                    if (t[x][y]=="?") {
                        t[x][y]="X";
                        posicionCorrecta = true;
                        return t;
                    }else if (t[x][y]!="?") {
                        posicionCorrecta = false;
                    }
                    
                }
            }
            if (!posicionCorrecta) {
                System.out.println("==========================================");
                System.out.println("Posición incorrecta! Vuelve a introducirla.");
                System.out.println("==========================================");
                mostrarTablero(t);
                System.out.println("==========================================");
                System.out.println("(Jugador 1) Introduce la posición horizontal.");
                x = sc.nextInt();
                System.out.println("(Jugador 1) Introduce la posición vertical.");
                y = sc.nextInt();
                System.out.println("================================");
            }
        } while (!posicionCorrecta);
        
        return t;
    }

    static String [][] posicionDisponibleJugador2(int x, int y, String [][]t){
        boolean posicionCorrecta = false;
        do {
            
            for (int i = 0; i < t[x].length; i++) {
                for (int j = 0; j < t[y].length; j++) {
                    if (t[x][y]=="?") {
                        t[x][y]="O";
                        posicionCorrecta = true;
                        return t;
                    }else if (t[x][y]!="?") {
                        posicionCorrecta = false;
                    }
                    
                }
            }
            if (!posicionCorrecta) {
                System.out.println("==========================================");
                System.out.println("Posición incorrecta! Vuelve a introducirla.");
                System.out.println("==========================================");
                mostrarTablero(t);
                System.out.println("==========================================");
                System.out.println("(Jugador 2) Introduce la posición horizontal(0, 1 o 2).");
                x = sc.nextInt();
                System.out.println("(Jugador 2) Introduce la posición vertical(0, 1 o 2).");
                y = sc.nextInt();
                System.out.println("================================");
            }
        } while (!posicionCorrecta);
        return t;
    }

    static String [][] posicionDisponibleMaquina(String [][]t){
        
        boolean posicionCorrecta = false;

        do {
            //Elegir la fila y columna de forma aleatoria
            int x = (int) (Math.random()*3);
            int y = (int) (Math.random()*3);

            for (int i = 0; i < t[x].length; i++) {
                for (int j = 0; j < t[y].length; j++) {
                    if (t[x][y]=="?") {
                        t[x][y]="O";
                        posicionCorrecta = true;
                        break;
                    }
                }
            }
        } while (!posicionCorrecta);
        
        return t;
    }
    //============================================================
    
    //COMPROBAR VICTORIAS Y QUE EL TABLERO NO ESTÉ LLENO
    static boolean comprobarVictoriaJugador1(String [][]t){
        //VICTORIA POR FILAS
        if (t[0][0]=="X"&& t[0][1]=="X"&& t[0][2]=="X") {
            return true;
        }
        if (t[1][0]=="X"&& t[1][1]=="X"&& t[1][2]=="X") {
            return true;
        }
        if (t[2][0]=="X"&& t[2][1]=="X"&& t[2][2]=="X") {
            return true;
        }
        //VICTORIA POR COLUMNAS
        if (t[0][0]=="X"&& t[1][0]=="X"&& t[2][0]=="X") {
            return true;
        }
        if (t[0][1]=="X"&& t[1][1]=="X"&& t[2][1]=="X") {
            return true;
        }
        if (t[0][2]=="X"&& t[1][2]=="X"&& t[2][2]=="X") {
            return true;
        }
        //VICTORIA POR DIAGONALES
        if (t[0][0]=="X"&& t[1][1]=="X"&& t[2][2]=="X") {
            return true;
        }
        if (t[2][0]=="X"&& t[1][1]=="X"&& t[0][2]=="X") {
            return true;
        }
        return false;
    }
    static boolean comprobarVictoriaJugador2YMaquina(String [][]t){
        //VICTORIA POR FILAS
        if (t[0][0]=="O"&& t[0][1]=="O"&& t[0][2]=="O") {
            return true;
        }
        if (t[1][0]=="O"&& t[1][1]=="O"&& t[1][2]=="O") {
            return true;
        }
        if (t[2][0]=="O"&& t[2][1]=="O"&& t[2][2]=="O") {
            return true;
        }
        //VICTORIA POR COLUMNAS
        if (t[0][0]=="O"&& t[1][0]=="O"&& t[2][0]=="O") {
            return true;
        }
        if (t[0][1]=="O"&& t[1][1]=="O"&& t[2][1]=="O") {
            return true;
        }
        if (t[0][2]=="O"&& t[1][2]=="O"&& t[2][2]=="O") {
            return true;
        }
        //VICTORIA POR DIAGONALES
        if (t[0][0]=="O"&& t[1][1]=="O"&& t[2][2]=="O") {
            return true;
        }
        if (t[2][0]=="O"&& t[1][1]=="O"&& t[0][2]=="O") {
            return true;
        }
        return false;
    }

    static boolean comprobarQueNoEsteLlenoElTablero(String [][]t){
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                if (t[i][j]=="?") {
                    return false;
                }
            }
        }
        return true;
    }
    //============================================================
}