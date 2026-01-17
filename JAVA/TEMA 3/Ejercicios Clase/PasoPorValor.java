public class PasoPorValor {

    //En java los paramteros toman su valor como una copia del valor de la expresion
    /*
     * Este mecanismo de paso de parametros se denomina paso por valor o copia
     */

     static int num = 2; //variable global
    public static void main(String[] args) {
        //En las clases se pueden declarar variables globales fuera del metodo main
        int num = 3;// variable local, sobreescribe a la global
        System.out.println("num= "+num+" doble "+doble(num));
    }//fin del main
    
    static int doble(int num){
        num*=2; //es un paso por valor una copia NO MODIFICO num
        return num;
    }
}//fin de clase
