import java.util.Scanner;

public class matriu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=4;

        //imprimirMatriz(invertirMatriz(n));
        imprimirMatrizInvertidasSinIndices(invertirMatriz(n));
        sc.close();
    }

    static int[][] crearMatriz(int n){
        n=4;
        int[][]m = new int[n][n];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (i== j) {
                    m[i][j]=1;
                }else{
                    m[i][j]=0;
                }
            }
        }
        return m;
    }
    static void imprimirMatriz(int[][] m){
        //Recorrer la matriz

        for (int[] fila : m) {
            for (int columna : fila) {
                //mostrar X si el valor es 1 y - si es 0
                if (columna==1) {
                    System.out.print("X ");
                }else{
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
    static int[][] invertirMatriz(int n){
        int[][]m = new int[n][n];
        for (int i = 0; i < m.length; i++) {
            for (int j = m[i].length -1; j >= 0; j--) {
                if (i== j) {
                    System.out.print("X ");;
                }else{
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        return m;
    }

    static void imprimirMatrizInvertidasSinIndices(int [][]m){
        //Utilizando foreach
        for (int[] fila : m) {
            String linea="";

            for (int columna : fila) {
                if (columna==1) {
                    linea="X "+linea;
                }else{
                    linea="- "+linea;
                }
            }
            System.out.println(linea);
        }
    }
    

}
