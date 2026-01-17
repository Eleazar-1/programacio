public class Matematicas {

    public static void main(String[] args) {
    System.out.println(esPrimo(5));
    System.out.println(digitos(-5));
    System.out.println(digitoN(5689, 2));
    }

    //digitoN
    /*
     * Devuelve el dígito que está en la posicion n (0) = izquierda
     * Si no existe devuelve -1
    */

    static int digitoN(long n, int pos){
        long num = Math.abs(n);
        int numDigitos = digitos(num);

        //Si la posicion no existe devolvemos -1
        if (pos < 0 || pos >= numDigitos) {
            return -1;
        }
        //Calcular cuantos digitos hay que quitar por detras
        int quitarPorDetras = numDigitos -1 -pos;
        long recortado = QuitarPorDetras(num, quitarPorDetras);
        
        return (int)(recortado % 10);
    }

    //Quitar por detras
    //Quita n digitos por la derecha
    //QuitarPorDetras(123456,2) --> 1234
    static long QuitarPorDetras(long numero, int n){
        //PISTAS:
        //Si n <= 0 devuelve el número com está
        //Calcular 10 elevado n para dividir
        //Hacer division entera entre ese valor
        //10 elev 0 = 1 10 elev 1 = 10 10 elev 2 = 100

        if (n <= 0) return numero;          
        long divisor = potencia(10, n);
        return numero / divisor;
    }

    //devuelve el n1 de digitos de un numero entero
    static int digitos(long n){
        //convertir numero en positivo
        //el numero cero tienen 1 digito
        //Dividir entre 10 cuantas veces puedes
        n = Math.abs(n);
        if (n == 0) {
            return 1;
        }
        int contador = 0;
        while (n > 0) {
            contador++;
            n = n/10;
        }
        return contador;
    }
    //CALCULAR LA POTENCIA
    static long potencia(long base, int exponente){
        //Cualquier n elevado a 0 es 1
        //for para multiplicar la base tantas veces como exponente
        if (exponente == 0) {
            return 1;
        }
        long resultado = 1;
        for (int i = 0; i <= exponente; i++) {
            resultado = resultado * base;
        }
        return resultado;
    }
    static long siguientePrimo(long n){
        //Empieza por n+1
        //Mientras ese número no se primo, se incrementa
        long numeroPosible = n +1;
        while (!esPrimo(numeroPosible)) {// esPrimo == false
            numeroPosible++;
        }
        return numeroPosible;
    }
    // 3 - Es primo
    //Cuando solo es divisible entre 1 y él mismo
    static boolean esPrimo(long n){
        //PISTAS
        // <= 1 no son primos
        //Recorremos todos los numeros desde 2 hasta n -1
        if (n<=1) {
            return false;//No hay primos menores o iguales a 1
        }
        for (long i = 2; i < n; i++) {
                if (n % i == 0) {
                    return false;//Tiene un divisor, NO ES PRIMO
                }
            }
        return true;
    }
    //===================================
    //2 esCapicua
    //Devuelve true si el numero se lee igual de derecha a izquierda
    //12321
    //===================================
    public static boolean esCapicua(long n){
        long num = Math.abs(n);
        return num == voltea(num);
    }
    //===================================
    //1Voltea
    //Devuelve el numero invertido
    //voltea(1234) -> 4321
    //===================================

    static long voltea(long n){
        long num = Math.abs(n);
        long resultado =0;

        while (num > 0) {
            //Obtindre el últim digit
            long ultimaCifra = num %10;
            //ultima cifra = num % 10 = 4
            //lo pego al numero nuevo
            resultado = resultado *10+ultimaCifra;
            //0 * 10 + 4 = 4

            //elimino ese digito
            num = num / 10;
            // 1234/10 = 123 
        }
        //con este if mantenemos al signo
        if (n<0) {
            resultado = -resultado;
        }
        return resultado;
    }
}