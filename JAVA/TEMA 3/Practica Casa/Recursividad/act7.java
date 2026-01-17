public class act7 {
    public static void main(String[] args) {
        int n = 10;
        int m = 2;
        System.out.println(cociente(n, m));
    }
    static int cociente(int n, int m){
        if (n < 0 || m < 0) {
            return 0;
        }
        int division = n/m;
        return division; 
    }
}
