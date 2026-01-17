import java.util.Scanner;

public class act1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        
        int[][]vector=new int[4][5];

        preguntarNumeros(vector);
        System.out.println("Media Aritmetica de la columna: ");
        System.out.println(devolverMediaAritmetica(vector));        
    }
    //Preguntar numeros al usuario
    static int [][] preguntarNumeros(int [][]n){
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.println("Introduce el valor: ");
                int valor = sc.nextInt();
                n[i][j]=valor;
            }
            System.out.println();
        }
        return n;
    }
    //Saber la media aritmetica de una determinada columna
    static int devolverMediaAritmetica(int [][]a){
        System.out.println("Que columna quieres hacer la media?: ");
        int columna = sc.nextInt();
        int media = 0;

        for (int i = 0; i < a.length; i++) {
            media+= a[i][columna];
        }
        return (media/a.length);
    }
}