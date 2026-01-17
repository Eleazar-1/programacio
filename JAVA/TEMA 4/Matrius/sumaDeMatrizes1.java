public class sumaDeMatrizes1 {
    public static void main(String[] args) {
    int matriz1 [][] = {{1,2,3},
                        {1,2,3}};
    int matriz2 [][] = {{1,2,3},
                        {1,2,3}};                       
    
    mostrarMatriz(sumaDeMatrizes(matriz1, matriz2));
    }

    static int [][] sumaDeMatrizes(int matriz1 [][], int matriz2 [][]){
        int matrizResultado [][] = new int[3][3];

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                matrizResultado[i][j]=matriz1[i][j]+matriz2[i][j];
            }
        }
        return matrizResultado;
    }

    static int [][] mostrarMatriz(int m [][]){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        return m;
    }
}
