import java.lang.reflect.Array;
import java.util.Arrays;

public class matriusIrregulars {

    public static void main(String[] args) {
        
        int [][] matriuA = {{1,2,3},{4,6},{7,8,9}};
        int [][] matriuB = {{1,2},{4},{7}};

        System.out.println("Matriz vacia");
        int [][] matrizVacia = crearMatriu(matriuA, matriuB);

        System.out.println(Arrays.deepToString(matrizVacia));

        System.out.println("Matriz maxima");
        int [][] matriuC = matrizMaxima(matriuA, matriuB);
        System.out.println(Arrays.deepToString(matriuC));

        System.out.println("Con método artesanal");
        mostrarMatrizMaxima(matriuA, matriuB);
    }

    static int[][] matrizMaxima(int [][]a, int[][]b){
        //Crear una matriz asegurandonos que las dimensiones son correctas
        int [][] matrizMaxima = crearMatriu(a, b);

        //Recorrer matriz fila por fila

        for (int i = 0; i < matrizMaxima.length; i++) {
            for (int j = 0; j < matrizMaxima[i].length; j++) {
                //Caso 1 si en a y b existe la fila
                if (i < a.length && i< b.length) {
                    //caso 1.1
                    if (j>= b[i].length) {
                        matrizMaxima[i][j]=a[i][j];//Tomamos el valor de A
                    }
                    //caso 1.2 si en A no existe la columna
                    else if (j>= a[i].length) {
                        matrizMaxima[i][j]=b[i][j];
                    }
                    //Caso 3 Si en A y B existe la columna
                    else{
                        matrizMaxima[i][j]= a[i][j]> b[i][j] ? a[i][j] : b[i][j];
                    }
                }
                //caso 2 si en A no existe la fila
                else if (i>= a.length) {
                    matrizMaxima[i][j]= b[i][j];
                }
                //Caso 3 si en B no existe la fila
                else if (i>= b.length) {
                    matrizMaxima[i][j]= a[i][j];
                }
            }
        }
        return matrizMaxima;
    }
    
    static void mostrarMatrizMaxima(int [][]a, int [][]b){
        int [][]c= matrizMaxima(a, b);
        for (int[] fila : c) {
            System.out.println(Arrays.toString(fila));
        }
    }

    static int[][] crearMatriu(int [][] matriuA, int [][] matriuB){
        //Crear filas

        //Determinar cantidad fials

        int filas = matriuA.length > matriuB.length ? matriuA.length : matriuB.length;
        int [][] matrizResultante = new int[filas][];
        //Crear la matriz con la cantidad maxima de filas

        //Recorremos filas
        for (int i = 0; i < filas; i++) {//recorrer filas
            //Comparar cantidad de elementos en A y B para las columnas

            //Caso 1: Si matriuA y matriuB existe la fila

            if (i< matriuA.length && i< matriuB.length) {
                int columnas = matriuA[i].length > matriuB[i].length ? matriuA[i].length : matriuB[i].length;
                matrizResultante[i]= new int[columnas];
            }

            //Caso 2: Si en matriuA no existe la fila

            else if (i< matriuA.length) {
                int columnas = matriuB[i].length; //Tomamos columnas de matriuB
                matrizResultante[i]=new int[columnas];
            }

            //Caso 3: Si en matriuB no existe la fila
            else if (i>= matriuB.length) {
                int columnas = matriuA[i].length; //Tomamos columnas de matriuB
                matrizResultante[i]=new int[columnas];
            }
        }
        return matrizResultante;
    }
}