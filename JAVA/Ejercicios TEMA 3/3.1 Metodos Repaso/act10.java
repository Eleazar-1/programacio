import java.util.Scanner;

public class act10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dime un numero");
        int n = sc.nextInt();
        System.out.println(invertida(n));
        
        sc.close();
    }
    static int invertida(int n){
        String s = String.valueOf(n);
        String invertido = new StringBuilder(s).reverse().toString();
        return Integer.parseInt(invertido);
    }
}
