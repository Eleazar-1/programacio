public class ArraysBidimensionales {
    public static void main(String[] args) {
        //Declaración

        int datos[][];
        datos = new int[5][5];

        int [][] numeros= new int[3][4];

        int [][] peras = new int[4][];
        peras[0] = new int[3];//3 columnas
        peras[1] = new int[4]; //4 columnas
        peras[2] = new int [2];
        //peras[3] = new String [4];
    
        int naranjas [] [] [] [] [];
        naranjas = new int[20][5][60][5][1];

        int matriz2 [][];
        matriz2 = new int [3][3];
        matriz2[0][0]=1;
        matriz2[0][1]=2;
        matriz2[2][32]=15;

        //Declara e inicializar
        int [][] matriz4 = new int[][]{{1,2,3},{6,7,2},{8,3,8},{}};

        int [][] matriz = {{1,2,3},{6,7,2},{8,3,8}};
        
        int filas = matriz.length;
        int elementosFila0 = matriz[0].length;
        int elementosFila1 = matriz[1].length;
        int elementosFila2 = matriz[2].length;

        int [] tercerArray = matriz[2];

        System.out.println("He sacado los elementos del arrays Bi");
        for (int i = 0; i < tercerArray.length; i++) {
            System.out.println(tercerArray[i]);//8,3,8
        }

    }
}
