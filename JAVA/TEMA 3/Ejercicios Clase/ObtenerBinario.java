public class ObtenerBinario {
    public static void main(String[] args) {
        
    }

    static int ObtenerBinario (int numero){
        if (numero ==0) {
            return 0;
        }else{
            return ObtenerBinario(numero/2) * 10 + numero % 2;
        }
    }
}
