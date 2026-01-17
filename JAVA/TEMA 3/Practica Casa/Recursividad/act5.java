public class act5 {
    public static void main(String[] args) {
        int b = 5;
        int e = 2;
        System.out.println(potencia(b, e));
    }
    static int potencia(int b, int e){
        int s = (int)Math.pow(b, e);
        return s;
    }
}
