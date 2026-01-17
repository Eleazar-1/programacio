import java.util.Scanner;

public class hundirLaFlota {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        
        do {
            System.out.println("========Juego HUNDIR LA FLOTA===========");
            System.out.println("1.Modo automatico");
            System.out.println("2.Modo manual (poner los barcos)");
            System.out.println("3.Salir");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion) {
            case 1:
                hundirLaFlotaAutomatico();
                break;
            case 2:
                hundirLaFlotaManual();
                break;
            case 3:
                System.out.println("Has salido!");
                break;
            default:
                System.out.println("Opcion no valida!");
                break;
            }
        } while (opcion != 3);
        
        
    }
    
    //===================== MÉTODO AUTOMATICO
    //Metodo automatico con un tablero ya predifinido
    static void hundirLaFlotaAutomatico(){
        String tableroOculto [][] = {
            {"1","a","a","a","a","a","a","a","a","a",},
            {"2","a","a","a","a","a","a","a","a","a",},
            {"3","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",}
        };
        String tableroVisible [][] = {
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",}
        }; 
        
        int posicionVertical;
        int posicionHorizontal;
        boolean victoria;
        int intentosMax = 10;

        

        do {
            System.out.println();
            System.out.println("===============Tablero Visible ===============");
            mostrarTablero(tableroVisible);
            //System.out.println("===============Tablero Oculto ===============");
            //mostrarTablero(tableroOculto);
            System.out.println("Tienes "+intentosMax+" intentos.");
            System.out.println();
            System.out.println("INFORMACIÓN: 'a'=agua, '*'=disparo al agua, 'A'=disparo a barco nv1");
            System.out.println("INFORMACIÓN: 'B'=disparo a barco nv2, 'C'=disparo a barco nv3");
            System.out.println("Introduce la posición 1.(A-Z), 2(0-9): ");
            String coordenada = sc.nextLine();
            //String coordenada = "a5";
            posicionVertical = extraerPosicionVertical(coordenada);
            posicionHorizontal = extraerPosicionHorizontal(coordenada);

            //System.out.println("===============Tablero Oculto===============");
            disparoJugador(tableroOculto, posicionHorizontal, posicionVertical);
            //System.out.println("===============Tablero Visible===============");
            marcarDisparoEnTablaVisible(tableroOculto, posicionHorizontal,posicionVertical, tableroVisible);
            victoria = comprobarVictoriaYDerrota(tableroOculto);
            intentosMax--;

        } while (!victoria && intentosMax > 0);

        if (victoria) {
            System.out.println("=====================================");
            System.out.println("Felicidades has tumbado todos los barcos!");
            System.out.println("=====================================");
        }

        if (!victoria) {
            System.out.println("=====================================");
            System.out.println("Mala suerte, no has tumbado todos los barcos!");
            System.out.println("=====================================");
        }
        System.out.println("=====================================");
        System.out.println("Resultado del tablero");
        mostrarTablero(tableroOculto);
        System.out.println("=====================================");
    }

    //Metodo para mostrar el tablero
    static String [][] mostrarTablero(String [][]m){
        System.out.println("    A B C D E F G H I J");
        for (int i = 0; i < m.length; i++) {
            System.out.print(i+" | ");
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        return m;
    }

    //Metodo para saber los posicion numerica de una letra introducida
    static int extraerPosicionVertical(String palabra){
        int posicion1;
        char letras [] ={'A','B','C','D','E','F','G','H','I','J'};
        palabra = palabra.toUpperCase();
        char letra = palabra.charAt(0);
        
        for (int i = 0; i < letras.length; i++) {
            if (letra == letras[i]) {
                posicion1 = i;
                return posicion1;
            }
        }
        //Devuelve error(10) en caso de que el numero esté fuera del rango
        System.out.println("==========================================");
        System.out.println("Has introducido una letra fuera del rango!");
        System.out.println("==========================================");
                
        return 10;
    }

    static int extraerPosicionHorizontal(String palabra){
        boolean numeroCorrecto;
        int posicion2 = Integer.parseInt(palabra.substring(1));
        

        if (posicion2 >= 0 && posicion2 <= 9 ) {
            return posicion2;
        }
        //Devuelve error(10) en caso de que el numero esté fuera del rango
        System.out.println("==========================================");
        System.out.println("Has introducido un número fuera del rango!");
        System.out.println("==========================================");
        return 10;
    }
    
    //Este es el metodo que analiza a lo que dispara el usuario y en funcion 
    // a lo que dispare cambiará tanto el tablero visible como en el oculto
    static String [][] disparoJugador(String [][]disparo, int x, int y){
        if (disparo[x][y].equals("a")) {
            disparo[x][y]="*";
        }else if (disparo[x][y].equals("1")) {
            disparo[x][y]="A";
        }else if (disparo[x][y].equals("2")) {
            disparo[x][y]="B";
        }else if (disparo[x][y].equals("3")) {
            disparo[x][y]="C";
        }
        
        return disparo;
        
    }
    //En este metodo analizo el tablero oculto y dependiendo 
    // a lo que se haya disparado se marcará en el tablero visible
    static String [][] marcarDisparoEnTablaVisible(String [][]tableroOculto, int x, int y, String [][]tableroVisible){
        if (tableroOculto[x][y].equals("*")) {
            tableroVisible[x][y] = "*";
            System.out.println("=====================================");
            System.out.println("Has disparado al agua!");
            System.out.println("=====================================");
        } else if (tableroOculto[x][y].equals("A")) {
            tableroVisible[x][y] = "A";
            System.out.println("=====================================");
            System.out.println("Has disparado a un barco nivel 1!");
            System.out.println("=====================================");

        } else if (tableroOculto[x][y].equals("B")) {
            tableroVisible[x][y] = "B";
            System.out.println("=====================================");
            System.out.println("Has disparado a un barco nivel 2!");
            System.out.println("=====================================");

        } else if (tableroOculto[x][y].equals("C")) {
            tableroVisible[x][y] = "C";
            System.out.println("=====================================");
            System.out.println("Has disparado a un barco nivel 3!");
            System.out.println("=====================================");

        } else {
            System.out.println("=====================================");
            System.out.println("No has acertado!");
            System.out.println("=====================================");
        }

        return tableroVisible;
    }
    //Este es el metodo para comprobar la victoria si queda algun barco "1","2"
    //Si se han acabado todos los barcos nivel 3 no informa, y si se han acabado los
    //barcos nivel 2 antes que los nivel 1 no lo informa
    static boolean comprobarVictoriaYDerrota(String [][]tabla){
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j].equals("1")) {
                    return false;
                }
            }
        }
        System.out.println("Todos los barcos nv1 han sido undidos");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j].equals("2")) {
                    return false;
                }
            }
        }
        System.out.println("Todos los barcos nv2 han sido undidos");
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j].equals("3")) {
                    return false;
                }
            }
        }
        
        return true;
    }

    //=========================================================================

    static void hundirLaFlotaManual(){
        String tableroOculto [][] = {
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",}
        };
        String tableroVisible [][] = {
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",},
            {"a","a","a","a","a","a","a","a","a","a",}
        }; 
        
        int posicionVertical;
        int posicionHorizontal;
        boolean victoria;
        int intentosMax = 10;

        
        modificarTablero(tableroOculto);
        do {
            
            System.out.println();
            System.out.println("===============Tablero Visible ===============");
            mostrarTablero(tableroVisible);
            //System.out.println("===============Tablero Oculto ===============");
            //mostrarTablero(tableroOculto);
            System.out.println("Tienes "+intentosMax+" intentos.");
            System.out.println();
            System.out.println("INFORMACIÓN: 'a'=agua, '*'=disparo al agua, 'A'=disparo a barco nv1");
            System.out.println("INFORMACIÓN: 'B'=disparo a barco nv2, 'C'=disparo a barco nv3");
            System.out.println("Introduce la posición 1.(A-Z), 2(0-9): ");
            String coordenada = sc.nextLine();
            //String coordenada = "a5";
            posicionVertical = extraerPosicionVertical(coordenada);
            posicionHorizontal = extraerPosicionHorizontal(coordenada);

            //System.out.println("===============Tablero Oculto===============");
            disparoJugador(tableroOculto, posicionHorizontal, posicionVertical);
            //System.out.println("===============Tablero Visible===============");
            marcarDisparoEnTablaVisible(tableroOculto, posicionHorizontal,posicionVertical, tableroVisible);
            victoria = comprobarVictoriaYDerrota(tableroOculto);
            intentosMax--;

        } while (!victoria && intentosMax > 0);

        if (victoria) {
            System.out.println("=====================================");
            System.out.println("Felicidades has tumbado todos los barcos!");
            System.out.println("=====================================");
        }

        if (!victoria) {
            System.out.println("=====================================");
            System.out.println("Mala suerte, no has tumbado todos los barcos!");
            System.out.println("=====================================");
        }
        System.out.println("=====================================");
        System.out.println("Resultado del tablero");
        mostrarTablero(tableroOculto);
        System.out.println("=====================================");
    }

    static String [][] modificarTablero(String [][]tablero){
        int posicionVertical;
        int posicionHorizontal;
        int barcosNv1 = 3;
        int barcosNv2 = 4;
        int barcosNv3 = 1;
        int nivel;
        String coordenada;
        do {
            System.out.println("==========Tablero Oculto ===========");
            mostrarTablero(tablero);
            System.out.println("=====================================");
            System.out.println("De que nivel quieres poner el barco(1, 2 o 3)");
            nivel = sc.nextInt();
            sc.nextLine();
            System.out.println("=====================================");
            System.out.println("Te quedan "+barcosNv1+" barcos nv1, "+barcosNv2+" nv2, "+barcosNv3+" nv3.");
            System.out.println("=====================================");
            if (nivel == 1 && barcosNv1 !=0) {
                System.out.println("Tienes "+barcosNv1+" barcos nivel 1, ¿A dónde quieres ponerlos?: ");
                System.out.println("Formato 'Letra' y 'numero' (A-J)-(0-9)");
                coordenada = sc.nextLine();
                posicionVertical = extraerPosicionVertical(coordenada);
                posicionHorizontal =  extraerPosicionHorizontal(coordenada);
                tablero[posicionHorizontal][posicionVertical]="1";
                barcosNv1--;

            }else if (nivel == 2 && barcosNv2 !=0) {
                System.out.println("Tienes "+barcosNv2+" barcos nivel 2, ¿A dónde quieres ponerlos?: ");
                System.out.println("Formato 'Letra' y 'numero' (A-J)-(0-9)");
                coordenada = sc.nextLine();
                posicionVertical = extraerPosicionVertical(coordenada);
                posicionHorizontal =  extraerPosicionHorizontal(coordenada);
                tablero[posicionHorizontal][posicionVertical]="2";
                barcosNv2--;

            }else if (nivel == 3 && barcosNv3 !=0) {
                System.out.println("Tienes "+barcosNv3+" barcos nivel 3, ¿A dónde quieres ponerlos?: ");
                System.out.println("Formato 'Letra' y 'numero' (A-J)-(0-9)");
                coordenada = sc.nextLine();
                posicionVertical = extraerPosicionVertical(coordenada);
                posicionHorizontal =  extraerPosicionHorizontal(coordenada);
                tablero[posicionHorizontal][posicionVertical]="3";
                barcosNv3--;

            }else{
                System.out.println("Ese nivel de barco no existe");
            }

        } while (barcosNv1 > 0 || barcosNv2 > 0 || barcosNv3 > 0);
        return tablero;
    }


}
