public class RecorrerMatrizes {
    public static void main(String[] args) {
        int [][]matriz = {{1,4,5},{6,7,2},{8,3,8}};
    
        System.out.println("RECORRER MATRIZ 1");
        for (int fila = 0; fila < matriz.length; fila++) {
            //Recorre filas .length --> 3
            
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna]);
            }
            System.out.println();
        }

        int [][]matriu = new int [3][7];
        System.out.println("Recorrer Matriu");

        for (int fila = 0; fila < matriu.length; fila++) {
            for (int columna = 0; columna < matriu[fila].length; columna++) {
                System.out.print(matriu[fila][columna]+" ");
            }
            System.out.println();
        }
    }
}
