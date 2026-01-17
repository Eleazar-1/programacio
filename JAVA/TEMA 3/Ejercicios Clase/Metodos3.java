public class Metodos3 {
    public static void main(String[] args) {
        //invocar
        saludar("joan");
        System.out.println(cubo(5));
        System.out.println(mult(5, 3));
        tabla(5);
        parONo(5);
    }//fin main
    //Metode 1 pedir al usuario un nombre y saludarlo mediante un metodo(saludar).
    //Pedira como parametro el nombre
    static void saludar(String nombre){
        System.out.println("HOla "+nombre+" q tal.");
    }
    static int cubo(int n){
        return n*n*n;
    }
    static int mult(int r, int a){
        return r*a;
    }
    static void tabla(int r){
        for (int i = 0; i <= 10; i++) {
            System.out.println(i+"x"+r+"="+(i*r)); 
        }
    }
    static void parONo(int a){
        if (a %2==0) {
            System.out.println("Es par");
        }else{
            System.out.println("No es par");
        }
    }
    //Metodos
}
