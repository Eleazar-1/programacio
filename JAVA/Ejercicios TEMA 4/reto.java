public class reto {
    public static void main(String[] args) {
        int[][]r=new int[5][5];
        int n=5;
        System.out.println(ponerZeros(n, r));
    }

    static int[][] ponerZeros(int n, int[][]r){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (r[i][j]%2==0) {
                    System.out.print("0 ");
                }else if (r[i][j]%2!=0) {
                    System.out.print(r[i][j]);
                }
            }
            System.out.println();
        }
        return r;
    }
}
