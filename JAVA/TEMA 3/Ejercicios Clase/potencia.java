public class potencia {
    public static void main(String[] args) {
        
    }

    static int potencia (int base, int exponente){
        //caso base 2 elevado 0
        //caso base
        if (exponente == 0) {
            return 1;
        }else{
            //
            return base * potencia(base, exponente -1);
        }
    }
}
/*Calculo de (2,4)
 * 1 llamada potencia (2,4)
 * No es el caso base exponente 4 ! = 0
 * Devuelve 2 x potencia (2,3)
*/
