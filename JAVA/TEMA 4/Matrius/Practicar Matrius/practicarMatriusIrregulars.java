public class practicarMatriusIrregulars {
    public static void main(String[] args) {
        int [][]a = {{1,2},
                    {4,5,6,8},
                    {2,5,8}};

        int [][]b = {{3,2,5,7},
                    {4,5,6},
                    {2,5}};

        // for (int i = 0; i < a.length; i++) {
        //     for (int j = 0; j < a[i].length; j++) {
        //         System.out.println("Fila "+i+" columna: "+j+" es: "+a[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        // for (int i = 0; i < b.length; i++) {
        //     for (int j = 0; j < b[i].length; j++) {
        //         System.out.println("Fila "+i+" columna: "+j+" es: "+b[i][j]);
        //     }
        //     System.out.println();
        // }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }
}
