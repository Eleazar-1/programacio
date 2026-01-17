public class practicarMatriusIrregulars2 {
    public static void main(String[] args) {
        int[][]botiga = {{10,20,30},{5,15},{12,18,25,40},{7}};
        int sumaTotal = 0;

        for (int i = 0; i < botiga.length; i++) {
            int sumaFila = 0;
            for (int j = 0; j < botiga[i].length; j++) {
                System.out.println("Botiga: "+i+" Producte: "+botiga[i][j]);
                sumaFila+=botiga[i][j];
            }
            System.out.println("La suma de la botiga "+i+" es "+sumaFila);
            System.out.println();
            sumaTotal+=sumaFila;
        }
        System.out.println("La suma total es: "+sumaTotal);

    }
    
}
