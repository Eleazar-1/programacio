public class SumaNaturales {
    //Metodo recursivo para obtener la suma de los numeros naturales hasta N
    public static void main(String[] args) {
        System.out.println(SumaNaturales(7));
        int total = SumaNaturales(6);
        System.out.println(" = "+total);
    }

    //7 7+6+5+4+3+2+1
    static int SumaNaturales(int n){
        if (n == 1) {
            System.out.println("1");
            return 1;
        }else{
            int parcial = SumaNaturales(n-1);
            System.out.println("+"+n);
            return n+parcial;
        }
    }
}
