import java.util.Scanner;

public class act2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // a y b
        int[][]matriu=new int[4][5];
        datosAleatorios(matriu);//a 
        System.out.println("Visualizar matriz: ");
        mostrar(matriu);
        //c
        int[][]matriz1=new int[4][5];
        int[][]matriz2=new int[4][5];
        datosAleatorios(matriz1);
        datosAleatorios(matriz2);
        System.out.println("Matriz 1: ");
        mostrar(matriz1);
        System.out.println();
        System.out.println("Matriz 2: ");
        mostrar(matriz2);
        System.out.println();
        System.out.println("Suma de matrizes: ");
        mostrar(sumarMatrizes(matriz1, matriz2));
        System.out.println();
        //d
        System.out.println("Matriz identidad: ");
        int identidad[][] = new int[5][5];
        mostrar(matrizIdentidad(identidad));
        //e
        System.out.println();
        int simetrica[][] ={
            {1,2,3},
            {2,5,6},
            {3,6,4}
        };
        System.out.println("Es simetrico?: "+esSimetrica(simetrica));
        //f
        int invertida[][] = new int[5][5];
        datosAleatorios(invertida);
        mostrar(invertida);
        System.out.println();
        mostrar(invertirHorizontalmente(invertida));
        //g
        System.out.println();
        int traspuesta[][] = new int[5][5];
        System.out.println("Matriz original: ");
        mostrar(datosAleatorios(traspuesta));
        System.out.println("Matriz traspuesta: ");
        mostrar(matrizTraspuesta(traspuesta));
        
    }
    //a. Método para llenar una matriz de datos aleatorios
    static int[][] datosAleatorios(int[][]d){
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                d[i][j]=(int)(Math.random()*10);
            }
            System.out.println();
        }
        return d;
    }
    //b. Método para mostrar la matriz
    static int [][] mostrar(int[][]d){
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }
        return d;
    }
    //c. Método de suma de 2 matrizes
    static int [][] sumarMatrizes(int [][]a, int [][]b){
        int suma [][] = new int[4][5];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                suma[i][j]= a[i][j]+b[i][j];
            }
        }
        
        return suma;
    }
    //d. Método crear matriz identidad
    static int [][] matrizIdentidad(int a [][]){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (i == j) {
                    a[i][j]=1;
                }else{
                    a[i][j]=0;
                }
            }
            
        }
        return a;
    }
    //e. Método para saber si una matriz es simetrica con respecto a su diagonal principal
    static boolean esSimetrica(int s[][]){
        boolean simetrico = true;
        
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++) {
                if (s[i][j]==s[j][i]) {
                    simetrico=true;
                }else{
                    simetrico = false;
                    break;
                }
            }
        }
        return simetrico;
    }
    //f. Método invertir horizontalmente
    static int [][] invertirHorizontalmente(int [][] h){
        int filas = h.length;
        int columnas = h[0].length;
        int [][] invertida = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                invertida[i][j] = h[i][columnas - 1 - j];
            }
        }
        return invertida;
    }
    //g. Método traspuesta
    static int [][] matrizTraspuesta(int [][]t){
        int traspuesta [][]= new int [5][5];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                traspuesta[i][j] = t[j][i];
            }
        }
        return traspuesta;
    }
    
}
