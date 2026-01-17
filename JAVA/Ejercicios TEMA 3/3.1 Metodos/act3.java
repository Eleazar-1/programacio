import java.util.Scanner;

public class act3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce la base: ");
        int base = sc.nextInt();

        System.out.println("Introduce el exponente: ");
        int exponente = sc.nextInt();

        if (base < 50 && exponente < 10) {
            System.out.println("Calculo: "+potencia(base, exponente));
        }else{
            System.out.println("Numeros demasiado altos");
        }
        sc.close();
    }

    public static int potencia(int base, int exponente){
        return (int) Math.pow(base, exponente);
    }
    
}
