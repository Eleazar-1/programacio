public class esBinario {
    public static void main(String[] args) {
        
    }

    static boolean esBinario(int n){
        //Caso base
        if (n==0|| n==1) {
            return true;
        }else{
            //Caso recursivo.
            if (n%10 ==0|| n% 10==1) {
                return esBinario(n/10);//Esto quita 1 num
            }
            //Si el último digito no es ni cero ni uno, no es binario
            return false;
        }
    }
}
