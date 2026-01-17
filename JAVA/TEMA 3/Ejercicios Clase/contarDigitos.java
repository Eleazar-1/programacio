public class contarDigitos {
    //Metodo q obtenga la cantidad de dígitos
    //de un número > 0
    //Se pasa como parametro N
    public static void main(String[] args) {
        System.out.println(contarDigitos(123456));
    }

    static int contarDigitos(int n){
        //Caso base
        if (n < 10) {
            return 1;
        }else{//Caso general
            //
            return 1 + contarDigitos(n/10);
            
            //Cuento 1 para contar el digito eliminado
        }
        //(44556) -> (4455) -> 1 + 1 (445) -> 1 + 1 + 1 (44) -> 1
    }
}
