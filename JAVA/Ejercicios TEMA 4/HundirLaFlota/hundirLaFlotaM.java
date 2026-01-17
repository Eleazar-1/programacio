import java.util.Scanner;

public class hundirLaFlotaM {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String tableroInicial [][] = new String[10][10];
        String tableroFinal [][] = new String[10][10];
        
        boolean victoria = false;
        boolean derrota = false;
        int posicionVertical;
        int opcion;

        do {
            System.out.println("===Juego Hundir la flota===");
            System.out.println("1. Juego automático");
            System.out.println("2. Juego manual(poner los barcos)");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    juegoAutomatico();
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("-Has salido del juego!");
                    break;
                default:
                    System.out.println("Opción no valida!");
                    break;
            }
            
        } while (opcion !=3 || !derrota || !victoria);
        
    }

    static void juegoAutomatico(){
        String tableroInicial [][] = new String[10][10];
        String tableroFinal [][] = new String[10][10];
        tableroInicial = llenarTableroDeAgua(tableroFinal);
        tableroFinal = llenarTableroDeBarcos(tableroFinal);
        
        int posicionVertical;
        int posicionHorizontal;

        System.out.println("=======Tablero========");
        mostrarTablero(tableroInicial);
        
        do {
            System.out.println("=====================================");
            System.out.println("===============Tablero===============");
            System.out.println("INFORMACIÓN: 'a'=agua, '*'=disparo al agua, 'B'=disparo a barco");
            System.out.println("Introduce la posición 1.(A-Z), 2(0-9)");
            System.out.println();
            //String coordenada = sc.nextLine();
            String coordenada = "a5";
            posicionVertical = extraerPosicionVertical(coordenada);
            posicionHorizontal = extraerPosicionHorizontal(coordenada);

        } while (posicionVertical > 9 || posicionVertical < 0 || posicionHorizontal >9 || posicionHorizontal < 0);
        
        mostrarTablero(marcarDisparo(tableroFinal, posicionHorizontal, posicionVertical));
                     
        System.out.println("=====================================");

    }

    static String [][] llenarTableroDeAgua(String [][]t){
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                t[i][j]="a";
            }
        }
        return t;
    }
    static String [][] llenarTableroDeBarcos(String [][]t){
        //Cuantos barcos tengo y de que tamaños
        int barcosTamaño1 = 3;
        int barcosTamaño2 = 2;
        int barcosTamaño3 = 3;

        //Poner el agua al tablero oculto
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                t[i][j]="a";
            }
        }
        //Poner los barcos de forma aleatoria

        int posicionBarcoGrande1 = (int)(Math.random()*10);
        //int posicionBarcoGrande2 = (int)(Math.random()*10);
        int posicionBarcoMediano1 = (int) (Math.random()*10);

        for (int i = 0; i < t[posicionBarcoGrande1].length; i++) {
            for (int j = 0; j < t[posicionBarcoGrande1].length; j++) {
                if(j < 3){
                    t[posicionBarcoGrande1][j]="3";
                }
                
            }
        }
        /*
        for (int i = 0; i < t[posicionBarcoMediano1].length; i++) {
            for (int j = 0; j < t[posicionBarcoMediano1].length; j++) {
                if(j < 3){
                    t[posicionBarcoMediano1][j]="2";
                }
                
            }
        }  */

        return t;
    }

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

    
    //Strin p = la palabra que introduce el usuario ej. A5
    //int p1 = ya pasado a numero la "A" se sabe la posicion vertical
    //int p2 = aqui extraemos el numero 5 del "A5" y lo pasamos a una variable
    //En si lo que se hace es separar y extraer la palabra para saber la posicion

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
        int posicion2;
        
        char n = palabra.charAt(1);
        posicion2 = (int) n /10;

        if (posicion2 <= 9 && posicion2 >= 0) {
            return posicion2;
        }
        //Devuelve error(10) en caso de que el numero esté fuera del rango
        System.out.println("==========================================");
        System.out.println("Has introducido un número fuera del rango!");
        System.out.println("==========================================");
        return 10;
    } 

    
    
    static String [][] marcarDisparoATableroInicial(String [][]tablero, int posicion1, int posicion2, int disparo){
        // 0 = se ha vuelto a disparar al mismo sitio
        // 3 = Se ha disparado a un barco de nivel 3
        // 2 = Se ha disparado a un barco de nivel 2
        // 1 = Se ha disparado a un barco de nivel 1
        
        return tablero;
    }

    static int marcarDisparoATableroFinal(String [][]tablero, int posicion1, int posicion2){
        if (tablero[posicion1][posicion2]=="*") {
            System.out.println("==========================================");
            System.out.println("Esa coordenada ya ha sido disparada!");
            System.out.println("==========================================");
            return 0;
        }
        // Al disparar a un barco se debe mostrar que se 
        // ha disparado con un aviso y una marca con la letra "D"

        if (tablero[posicion1][posicion2]=="3"){
            tablero[posicion1][posicion2]="D";
            System.out.println("==========================================");
            System.out.println("Has disparado a un barco!");
            System.out.println("==========================================");
            return 3;
        }
        if (tablero[posicion1][posicion2]=="2"){
            tablero[posicion1][posicion2]="D";
            System.out.println("==========================================");
            System.out.println("Has disparado a un barco!");
            System.out.println("==========================================");
            return 2;
        }
        if (tablero[posicion1][posicion2]=="1"){
            tablero[posicion1][posicion2]="D";
            System.out.println("==========================================");
            System.out.println("Has disparado a un barco!");
            System.out.println("==========================================");
            return 1;
        }
        if (tablero[posicion1][posicion2]=="a"){
            tablero[posicion1][posicion2]="*";
            System.out.println("==========================================");
            System.out.println("Has disparado a al agua!");
            System.out.println("==========================================");
            return 4;
        }
        return 5;
    }
}
