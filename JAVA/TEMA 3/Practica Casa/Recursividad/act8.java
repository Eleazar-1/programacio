public class act8 {
    public static void main(String[] args) {
        int n = 5;
        int s =0;
        
        System.out.println(suma(n, s));
    }
    static int suma(int n, int s){
        for (int i = n; i >= 0; i--) {
            s+=i;
        }
        return s;
    }
}
