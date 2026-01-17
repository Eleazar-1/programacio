import java.util.Arrays;

public class testeos {
    public static void main(String[] args) {
        //f
        int invertida[][] = new int[5][5];
        datosAleatorios(invertida);
        mostrar(invertida);
        //invertir
        System.out.println();
        mostrar(invertirHorizontalmente(invertida));
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
}
