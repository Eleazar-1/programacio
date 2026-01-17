public class practicarMatriusIrregulars1 {
    public static void main(String[] args) {
        int[][]n={{7,8,9},{4,5,9},{4,6,7}};
        System.out.println("Notes de alumnes: ");
        notes(n);
    }
    
    static int [][]notes(int[][]n){
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.println("Alumne "+i+" ha tret: "+n[i][j]);
            }
        }
        return n;
    }
}
