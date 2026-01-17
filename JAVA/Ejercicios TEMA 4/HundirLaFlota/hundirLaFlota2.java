public class hundirLaFlota2 {
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
                    mostrarTablero(llenarTablero(tableroFinal));
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
        tableroFinal = llenarTablero(tableroFinal);
        int posicionVertical;
        int posicionHorizontal;

        System.out.println("=======Tablero========");
        mostrarTablero(llenarTablero(tableroInicial));
        
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
        
        mostrarTablero(marcarDisparo(tableroFinal, posicionVertical, posicionHorizontal));
                     
        System.out.println("=====================================");
    }

    static String [][] llenarTablero(String [][]t){
        //Cuantos barcos tengo y de que tamaños
        int barcosTamaño1 = 3;
        int barcosTamaño2 = 2;
        int barcosTamaño3 = 3;

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













    //MOSTRAR TABLERO
    static String [][] mostrarTablero(String [][]m){
        System.out.println("    A B C D E F G H I J");
        for (int i = 0; i < m.length; i++) {
            System.out.print(i+" | ");
            for (int j = 0; j < m.length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        return m;
    }























    //SABER LA COORDENADA EXACTA
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

    //======================================================================
    
}
