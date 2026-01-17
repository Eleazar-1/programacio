import java.util.Scanner;

public class act3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantas filas quieres que tenga la matriz?: ");
        int filas = sc.nextInt();
        System.out.println("Cuantas columnas quieres que tenga la matriz?: ");
        int columnas = sc.nextInt();

        int matriz [][] = new int[filas][columnas];
        System.out.println("Matriz creada: ");
        System.out.println("================");
        mostrarMatriz(rellenarMatriz(matriz));
        System.out.println("================");
        

        //4. Elegir fila y columna a eliminar
        System.out.println("Que fila quieres eliminar?: ");
        int eliminarFila = sc.nextInt();
        System.out.println("Que columna quieres eliminar?: ");
        int eliminarColumna = sc.nextInt();

        //4. Metodo eliminar fila y columna
        System.out.println("================");
        eliminarFilaYColumna(matriz, eliminarFila, eliminarColumna);
        System.out.println("================");
        sc.close();
    }

    static int [][] rellenarMatriz(int [][]n){
        
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j]=(int)(Math.random()*90+1);
            }
        }
        return n;
    }

    static int [][] mostrarMatriz(int [][]m){
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
        return m;
    }

    static int [][] eliminarFilaYColumna(int [][]fc, int f, int c){
        
        int nFilas = fc.length;
        int nColumnas = fc[0].length;
        boolean filasValidas = (nFilas <= f || nFilas >= 0);
        boolean columnasValidas = (nColumnas <= c || nColumnas >= 0);

        
        if (filasValidas  && columnasValidas) {
            System.out.println("Valores validos");
            for (int i = 0; i < fc.length; i++) {
                if (i!=f) {
                    for (int j = 0; j < fc[i].length; j++) {
                        if (j!=c) {
                            System.out.print(fc[i][j]+" ");
                        }
                    }
                }
                if (i!=f) {
                System.out.println();
                }
            }
        }else{
            System.out.println("No has introducido una posicion valida");
        }
        
        return fc;
    }

}
