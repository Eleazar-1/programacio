import java.util.Scanner;

public class act1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un nº: ");
        int n = sc.nextInt();
        
        System.out.println(invertir(n));

        sc.close();
    }
    static int invertir(int n){
        String r = String.valueOf(n);
        String alreves = "";
        for (int i = r.length() -1; i >= 0; i--) {
            char l1 = r.charAt(i);
            alreves+=l1;
        }

        int numero = Integer.parseInt(alreves);
        return numero;
    }
}
