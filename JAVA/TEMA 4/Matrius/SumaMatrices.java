import java.util.Arrays;

public class SumaMatrices {
    public static void main(String[] args) {
        int [][]m={{1,23},{4,4},{5,5},{6,6}};
        int [][]n={{2,24},{5,5},{6,6},{7,7,8}};

        System.out.println(matrizMaxima(n, m));
    }
    static void mostrarMatrizMaxima(int [][]matrizA, int [][] matrizB){
        int resultado[][]= matrizMaxima(matrizA, matrizB);
        if (resultado != null) {
            for (int[] fila : resultado) {
                System.out.println(Arrays.toString(fila));
            }
        }else{
            System.out.println("Error, las matrices no son iguales");
        }
    }

    static int [][] matrizMaxima(int matrizA[][], int matrizB[][]){
        if (matricesIguales(matrizA, matrizB)) {
            int resultado [][]=new int[matrizA.length][];
            //Creamos la matriz resultado. Creamos las filas
            for (int i = 0; i < matrizA.length; i++) {
                resultado[i]=new int[matrizA[i].length];
                //Generar cada una de les columnes de la matriu
            }// fin for

            //Comparar el elements per afegir a matriz resultado
            //Recorremos ambas matrices y copiem el màxim en cada posicio
            
            for (int i = 0; i < resultado.length; i++) {
                for (int j = 0; j < resultado[i].length; j++) {
                    if (matrizA[i][j]>matrizB[i][j]) {//Maxim està en A
                        resultado[j][j]=matrizA[i][j];
                    }else{
                        resultado[i][j]=matrizB[i][j];
                    }
                }
            }
            return resultado;//si son iguales devuelves matriz
        }
        return null;
    }

    static boolean matricesIguales(int matrizA[][], int matrizB[][]){
        //MISMA CANTIDAD DE FILAS
        if (matrizA.length==matrizB.length) {
            //Recorrer les columnes
            for (int i = 0; i < matrizA.length; i++) {
                if (matrizA[i].length != matrizB[i].length) {
                    return false; //NO SON IGUALES
                }
            }
        }
        return true;
    }
}
