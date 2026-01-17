public class act3 {
    public static void main(String[] args) {
        int[] n = {2,4,6,8};

        int resultado = multiplicar(n, 0);
        System.out.println("Resultado: "+resultado);
    }
    public static int multiplicar(int[] v, int i){
        if (i== v.length -1) {
            return v[i];
        }
        return v[i] *multiplicar(v, i+1);
    }
}
